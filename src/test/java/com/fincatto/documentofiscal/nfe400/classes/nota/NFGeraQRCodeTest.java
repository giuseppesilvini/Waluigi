package com.fincatto.documentofiscal.nfe400.classes.nota;

import com.fincatto.documentofiscal.DFUnidadeFederativa;
import com.fincatto.documentofiscal.nfe.NFeConfig;
import com.fincatto.documentofiscal.nfe400.FabricaDeObjetosFake;
import com.fincatto.documentofiscal.nfe400.utils.NFGeraQRCode;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;

public class NFGeraQRCodeTest {

    // EXEMPLO DO MANUAL DA RECEITA
    private static final String URL_TEST = "?chNFe=28140300156225000131650110000151341562040824&nVersao=100&tpAmb=2&cDest=13017959000181&dhEmi=323031342d30332d31385431303a35353a33332d30333a3030&vNF=60.90&vICMS=12.75&digVal=797a4759685578312f5859597a6b7357422b6650523351633530633d&cIdToken=000001&cHashQRCode=3015be8578a8321a23dab39cb81cfc420ba78b9256db2a20cd71d7602828eee6";
    private static final String URL_TESTV2 = "?p=28140300156225000131650110000151341562040824|2|2|1|D34CCA056F9774A9EEFF1746EE319368E031708E80AA71A0828844DAAF872A3D";

    @Test
    public void geraQRCodeConformeEsperado() throws NoSuchAlgorithmException {
        final NFNota nota = FabricaDeObjetosFake.getNotaQRCode();
        nota.setInfoSuplementar(new NFNotaInfoSuplementar());
        nota.getInfoSuplementar().setQrCode(new NFGeraQRCode(nota, this.createConfigTest()).getQRCode());

        final String urlEsperada = nota.getInfo().getIdentificacao().getUf().getQrCodeHomologacao() + NFGeraQRCodeTest.URL_TEST;
        Assert.assertEquals(urlEsperada, nota.getInfoSuplementar().getQrCode());
    }

    @Test
    public void geraSHA256() throws Exception {
        final String entrada = "chNFe=28140300156225000131650110000151341562040824&nVersao=100&tpAmb=1&cDest=13017959000181&dhEmi=323031342d30332d31385431303a35353a33332d30333a3030&vNF=60.90&vICMS=12.75&digVal=797a4759685578312f5859597a6b7357422b6650523351633530633d&cIdToken=000001SEU-CODIGO-CSC-CONTRIBUINTE-36-CARACTERES";
        final String saida = NFGeraQRCode.sha256(entrada);
        Assert.assertEquals(saida, "2e3f013d0be1821d2418b5115bc6e3066fd26553312ffcfeeb729083e25763ae");
    }
    
    @Test
    public void geraQRCodeConformeEsperadov2() throws NoSuchAlgorithmException {
        final NFNota nota = FabricaDeObjetosFake.getNotaQRCode();
        nota.setInfoSuplementar(new NFNotaInfoSuplementar());
        nota.getInfoSuplementar().setQrCode(new NFGeraQRCode(nota, this.createConfigTest()).getQRCodev2());
        
        final String urlEsperada = nota.getInfo().getIdentificacao().getUf().getQrCodeHomologacao() + NFGeraQRCodeTest.URL_TESTV2;
        Assert.assertEquals(urlEsperada, nota.getInfoSuplementar().getQrCode());
    }
    
    @Test
    public void geraSHA256v2() throws Exception {
        final String entrada = "28140300156225000131650110000151341562040824|2|2|1SEU-CODIGO-CSC-CONTRIBUINTE-36-CARACTERES";
        final String saida = NFGeraQRCode.sha256(entrada);
        Assert.assertEquals("D34CCA056F9774A9EEFF1746EE319368E031708E80AA71A0828844DAAF872A3D", StringUtils.upperCase(saida));
    }
    

    private NFeConfig createConfigTest() {
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