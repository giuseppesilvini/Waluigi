package com.fincatto.documentofiscal.nfe310.classes.nota;

import com.fincatto.documentofiscal.nfe310.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NFInfoReferenciadaTest {

    @Test(expected = IllegalStateException.class)
    public void devePermitirSetarApenasUmChaveAcessoCTReferenciada() {
        final NFInfoReferenciada referenciada = new NFInfoReferenciada();
        referenciada.setChaveAcessoCTReferenciada("976491545426199562046180593530960051134629091");
        NFInfoCupomFiscalReferenciado cupomFiscalReferenciado = FabricaDeObjetosFake.getNFInfoCupomFiscalReferenciado();
        try {
            referenciada.setCupomFiscalReferenciado(cupomFiscalReferenciado);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        NFInfoProdutorRuralReferenciada infoNFProdutorRuralReferenciada = FabricaDeObjetosFake.getNFInfoProdutorRuralReferenciada();
        try {
            referenciada.setInfoNFProdutorRuralReferenciada(infoNFProdutorRuralReferenciada);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        try {
            referenciada.setChaveAcesso("97649154542619956204618059353096005113462909");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        NFInfoModelo1Por1AReferenciada modelo1por1Referenciada = FabricaDeObjetosFake.getNFInfoModelo1Por1AReferenciada();
        try {
            referenciada.setModelo1por1Referenciada(modelo1por1Referenciada);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
    }

    @Test
    public void devePermitirSetarApenasUmChaveAcesso() {
        final NFInfoReferenciada referenciada = new NFInfoReferenciada();
        referenciada.setChaveAcesso("97649154542619956204618059353096005113462909");
        NFInfoCupomFiscalReferenciado cupomFiscalReferenciado = FabricaDeObjetosFake.getNFInfoCupomFiscalReferenciado();
        try {
            referenciada.setCupomFiscalReferenciado(cupomFiscalReferenciado);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        NFInfoProdutorRuralReferenciada infoNFProdutorRuralReferenciada = FabricaDeObjetosFake.getNFInfoProdutorRuralReferenciada();
        try {
            referenciada.setInfoNFProdutorRuralReferenciada(infoNFProdutorRuralReferenciada);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        try {
            referenciada.setChaveAcessoCTReferenciada("976491545426199562046180593530960051134629091");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        NFInfoModelo1Por1AReferenciada modelo1por1Referenciada = FabricaDeObjetosFake.getNFInfoModelo1Por1AReferenciada();
        try {
            referenciada.setModelo1por1Referenciada(modelo1por1Referenciada);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
    }

    @Test
    public void devePermitirSetarApenasUmInfoNFProdutorRuralReferenciada() {
        final NFInfoReferenciada referenciada = new NFInfoReferenciada();
        referenciada.setInfoNFProdutorRuralReferenciada(FabricaDeObjetosFake.getNFInfoProdutorRuralReferenciada());
        NFInfoCupomFiscalReferenciado cupomFiscalReferenciado = FabricaDeObjetosFake.getNFInfoCupomFiscalReferenciado();
        try {
            referenciada.setCupomFiscalReferenciado(cupomFiscalReferenciado);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        try {
            referenciada.setChaveAcesso("97649154542619956204618059353096005113462909");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        try {
            referenciada.setChaveAcessoCTReferenciada("976491545426199562046180593530960051134629091");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        NFInfoModelo1Por1AReferenciada modelo1por1Referenciada = FabricaDeObjetosFake.getNFInfoModelo1Por1AReferenciada();
        try {
            referenciada.setModelo1por1Referenciada(modelo1por1Referenciada);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
    }

    @Test
    public void devePermitirSetarApenasUmModelo1Por1Referenciada() {
        final NFInfoReferenciada referenciada = new NFInfoReferenciada();
        referenciada.setModelo1por1Referenciada(FabricaDeObjetosFake.getNFInfoModelo1Por1AReferenciada());
        NFInfoCupomFiscalReferenciado cupomFiscalReferenciado = FabricaDeObjetosFake.getNFInfoCupomFiscalReferenciado();
        try {
            referenciada.setCupomFiscalReferenciado(cupomFiscalReferenciado);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        try {
            referenciada.setChaveAcesso("97649154542619956204618059353096005113462909");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        try {
            referenciada.setChaveAcessoCTReferenciada("976491545426199562046180593530960051134629091");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        NFInfoProdutorRuralReferenciada infoNFProdutorRuralReferenciada = FabricaDeObjetosFake.getNFInfoProdutorRuralReferenciada();
        try {
            referenciada.setInfoNFProdutorRuralReferenciada(infoNFProdutorRuralReferenciada);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
    }

    @Test
    public void devePermitirSetarApenasUmCupomFiscalReferenciadoSetado() {
        final NFInfoReferenciada referenciada = new NFInfoReferenciada();
        referenciada.setCupomFiscalReferenciado(FabricaDeObjetosFake.getNFInfoCupomFiscalReferenciado());
        NFInfoModelo1Por1AReferenciada modelo1por1Referenciada = FabricaDeObjetosFake.getNFInfoModelo1Por1AReferenciada();
        try {
            referenciada.setModelo1por1Referenciada(modelo1por1Referenciada);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        try {
            referenciada.setChaveAcesso("97649154542619956204618059353096005113462909");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        try {
            referenciada.setChaveAcessoCTReferenciada("976491545426199562046180593530960051134629091");
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        NFInfoProdutorRuralReferenciada infoNFProdutorRuralReferenciada = FabricaDeObjetosFake.getNFInfoProdutorRuralReferenciada();
        try {
            referenciada.setInfoNFProdutorRuralReferenciada(infoNFProdutorRuralReferenciada);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirChaveAcessoComTamanhoInvalido() {
        try {
            new NFInfoReferenciada().setChaveAcesso("9764915454261995620461805935309600511346290");
        } catch (final IllegalStateException e) {
            new NFInfoReferenciada().setChaveAcesso("976491545426199562046180593530960051134629091");
        }
    }

    @Test
    public void devePermitirModelo1por1ReferenciadaNulo() {
        final NFInfoReferenciada referenciada = new NFInfoReferenciada();
        referenciada.setChaveAcesso("97649154542619956204618059353096005113462909");
        assertEquals("97649154542619956204618059353096005113462909", referenciada.getChaveAcesso());
        referenciada.toString();
    }

    @Test
    public void devePermitirChaveAcessoNulo() {
        final NFInfoReferenciada referenciada = new NFInfoReferenciada();
        referenciada.setModelo1por1Referenciada(FabricaDeObjetosFake.getNFInfoModelo1Por1AReferenciada());
        assertEquals(FabricaDeObjetosFake.getNFInfoModelo1Por1AReferenciada().toString(),referenciada.getModelo1por1Referenciada().toString());
        referenciada.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final NFInfoReferenciada referenciada = new NFInfoReferenciada();
        referenciada.setModelo1por1Referenciada(FabricaDeObjetosFake.getNFInfoModelo1Por1AReferenciada());
        final String xmlEsperado = "<NFInfoReferenciada><refNF><cUF>43</cUF><AAMM>1408</AAMM><CNPJ>12345678901234</CNPJ><mod>01</mod><serie>999</serie><nNF>999999999</nNF></refNF></NFInfoReferenciada>";
        Assert.assertEquals(xmlEsperado, referenciada.toString());
    }
}
