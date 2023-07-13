package com.fincatto.documentofiscal.nfe400.classes.nota;

import java.security.NoSuchAlgorithmException;

import org.junit.Assert;
import org.junit.Test;

import com.fincatto.documentofiscal.nfe400.FabricaDeObjetosFake;
import com.fincatto.documentofiscal.nfe400.utils.qrcode20.NFGeraQRCodeEmissaoNormal20;

public class NFGeraQRCodeEmissaoNormal20Test {

    // EXEMPLO DO MANUAL DA RECEITA
    private static final String URL_TEST = "?p=28170800156225000131650110000151341562040824|2|1|1|181769D8A1EF647E8475BEF7741AD2C21D1AF92028DF0FE84C1E8AB5EFA34BDB";

    @Test
    public void geraQRCodeConformeEsperado() throws NoSuchAlgorithmException {
        final NFNota nota = FabricaDeObjetosFake.getNotaQRCodeEmissaoNormal20();
        nota.setInfoSuplementar(new NFNotaInfoSuplementar());
        nota.getInfoSuplementar().setQrCode(new NFGeraQRCodeEmissaoNormal20(nota, NFGeraQRCode20Test.createConfigTest()).getQRCode());

        final String urlEsperada = nota.getInfo().getIdentificacao().getUf().getQrCodeProducao() + URL_TEST;
        Assert.assertEquals(urlEsperada, nota.getInfoSuplementar().getQrCode());
    }

}