package com.fincatto.documentofiscal.nfe400.classes.nota;

import com.fincatto.documentofiscal.nfe400.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

public class NFNotaInfoItemImpostoPISTest {

    @Test
    public void devePermitirApenasUmAliquota() {
        final NFNotaInfoItemImpostoPIS pis = new NFNotaInfoItemImpostoPIS();
        pis.setAliquota(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISAliquota());

        NFNotaInfoItemImpostoPISNaoTributado naoTributado = FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISNaoTributado();
        try {
            pis.setNaoTributado(naoTributado);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoPISOutrasOperacoes outrasOperacoes = FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISOutrasOperacoes();
        try {
            pis.setOutrasOperacoes(outrasOperacoes);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoPISQuantidade quantidade = FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISQuantidade();
        try {
            pis.setQuantidade(quantidade);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
    }

    @Test
    public void devePermitirApenasUmNaoTributado() {
        final NFNotaInfoItemImpostoPIS pis = new NFNotaInfoItemImpostoPIS();
        pis.setNaoTributado(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISNaoTributado());

        NFNotaInfoItemImpostoPISAliquota aliquota = FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISAliquota();
        try {
            pis.setAliquota(aliquota);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoPISOutrasOperacoes outrasOperacoes = FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISOutrasOperacoes();
        try {
            pis.setOutrasOperacoes(outrasOperacoes);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoPISQuantidade quantidade = FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISQuantidade();
        try {
            pis.setQuantidade(quantidade);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
    }

    @Test
    public void devePermitirApenasUmOutrasOperacoes() {
        final NFNotaInfoItemImpostoPIS pis = new NFNotaInfoItemImpostoPIS();
        pis.setOutrasOperacoes(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISOutrasOperacoes());

        NFNotaInfoItemImpostoPISAliquota aliquota = FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISAliquota();
        try {
            pis.setAliquota(aliquota);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoPISNaoTributado naoTributado = FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISNaoTributado();
        try {
            pis.setNaoTributado(naoTributado);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoPISQuantidade quantidade = FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISQuantidade();
        try {
            pis.setQuantidade(quantidade);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
    }

    @Test
    public void devePermitirApenasUmQuantidade() {
        final NFNotaInfoItemImpostoPIS pis = new NFNotaInfoItemImpostoPIS();
        pis.setQuantidade(FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISQuantidade());

        NFNotaInfoItemImpostoPISAliquota aliquota = FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISAliquota();
        try {
            pis.setAliquota(aliquota);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoPISNaoTributado naoTributado = FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISNaoTributado();
        try {
            pis.setNaoTributado(naoTributado);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoPISOutrasOperacoes outrasOperacoes = FabricaDeObjetosFake.getNFNotaInfoItemImpostoPISOutrasOperacoes();
        try {
            pis.setOutrasOperacoes(outrasOperacoes);
            Assert.fail("Validacao nao funcionou");
        } catch (final IllegalStateException ignored) {
        }
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<NFNotaInfoItemImpostoPIS><PISAliq><CST>01</CST><vBC>999999999999.99</vBC><pPIS>99.99</pPIS><vPIS>999999999999.99</vPIS></PISAliq></NFNotaInfoItemImpostoPIS>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoItemImpostoPIS().toString());
    }
}