package com.fincatto.documentofiscal.nfe400.classes.nota;

import com.fincatto.documentofiscal.nfe400.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

public class NFNotaInfoItemImpostoCOFINSTest {

    @Test
    public void devePermitirApenasUmQuantidade() {
        final NFNotaInfoItemImpostoCOFINS cofins = new NFNotaInfoItemImpostoCOFINS();
        cofins.setQuantidade(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSQuantidade());
        NFNotaInfoItemImpostoCOFINSAliquota aliquota = FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSAliquota();
        try {
            cofins.setAliquota(aliquota);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoCOFINSNaoTributavel naoTributavel = FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSNaoTributavel();
        try {
            cofins.setNaoTributavel(naoTributavel);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoCOFINSOutrasOperacoes outrasOperacoes = FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSOutrasOperacoes();
        try {
            cofins.setOutrasOperacoes(outrasOperacoes);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
    }

    @Test
    public void devePermitirApenasUmAliquota() {
        final NFNotaInfoItemImpostoCOFINS cofins = new NFNotaInfoItemImpostoCOFINS();
        cofins.setAliquota(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSAliquota());
        NFNotaInfoItemImpostoCOFINSQuantidade quantidade = FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSQuantidade();
        try {
            cofins.setQuantidade(quantidade);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoCOFINSNaoTributavel naoTributavel = FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSNaoTributavel();
        try {
            cofins.setNaoTributavel(naoTributavel);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoCOFINSOutrasOperacoes outrasOperacoes = FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSOutrasOperacoes();
        try {
            cofins.setOutrasOperacoes(outrasOperacoes);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
    }

    @Test
    public void devePermitirApenasUmNaoTributavel() {
        final NFNotaInfoItemImpostoCOFINS cofins = new NFNotaInfoItemImpostoCOFINS();
        cofins.setNaoTributavel(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSNaoTributavel());
        NFNotaInfoItemImpostoCOFINSQuantidade quantidade = FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSQuantidade();
        try {
            cofins.setQuantidade(quantidade);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoCOFINSAliquota aliquota = FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSAliquota();
        try {
            cofins.setAliquota(aliquota);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoCOFINSOutrasOperacoes outrasOperacoes = FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSOutrasOperacoes();
        try {
            cofins.setOutrasOperacoes(outrasOperacoes);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
    }

    @Test
    public void devePermitirApenasUmOutrasOperacoes() {
        final NFNotaInfoItemImpostoCOFINS cofins = new NFNotaInfoItemImpostoCOFINS();
        cofins.setNaoTributavel(FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSNaoTributavel());
        NFNotaInfoItemImpostoCOFINSQuantidade quantidade = FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSQuantidade();
        try {
            cofins.setQuantidade(quantidade);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoCOFINSAliquota aliquota = FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSAliquota();
        try {
            cofins.setAliquota(aliquota);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoCOFINSOutrasOperacoes outrasOperacoes = FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINSOutrasOperacoes();
        try {
            cofins.setOutrasOperacoes(outrasOperacoes);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<NFNotaInfoItemImpostoCOFINS><COFINSAliq><CST>01</CST><vBC>999999999999.99</vBC><pCOFINS>99.99</pCOFINS><vCOFINS>999999999999.99</vCOFINS></COFINSAliq></NFNotaInfoItemImpostoCOFINS>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemImpostoCOFINS().toString());
    }
}