package com.fincatto.documentofiscal.nfe400.classes.nota;

import java.security.KeyStore;

import org.junit.Assert;
import org.junit.Test;

import com.fincatto.documentofiscal.DFAmbiente;
import com.fincatto.documentofiscal.DFUnidadeFederativa;
import com.fincatto.documentofiscal.nfe.NFeConfig;
import com.fincatto.documentofiscal.nfe400.utils.qrcode20.NFGeraQRCodeEmissaoNormal20;

public class NFGeraQRCode20Test {

    @Test
    public void geraSHA256() throws Exception {
        final String entrada = "28170800156225000131650110000151341562040824|2|1|1SEU-CODIGO-CSC-CONTRIBUINTE-36-CARACTERES";
        final String saida = NFGeraQRCodeEmissaoNormal20.sha256(entrada);
        Assert.assertEquals("181769D8A1EF647E8475BEF7741AD2C21D1AF92028DF0FE84C1E8AB5EFA34BDB", saida);
    }

    public static NFeConfig createConfigTest() {
        return new NFeConfig() {
            @Override
            public Integer getCodigoSegurancaContribuinteID() {
                return 1;
            }

            @Override
            public String getCodigoSegurancaContribuinte() {
                return "SEU-CODIGO-CSC-CONTRIBUINTE-36-CARACTERES";
            }

            @Override
            public DFUnidadeFederativa getCUF() {
                return DFUnidadeFederativa.SE;
            }

            @Override
            public DFAmbiente getAmbiente() {
                return DFAmbiente.PRODUCAO;
            }

            @Override
            public KeyStore getCertificadoKeyStore() {
                return null;
            }

            @Override
            public String getCertificadoSenha() {
                return null;
            }

            @Override
            public KeyStore getCadeiaCertificadosKeyStore() {
                return null;
            }

            @Override
            public String getCadeiaCertificadosSenha() {
                return null;
            }

            @Override
            public String getCertificadoAlias() {
                return null;
            }
        };
    }

}