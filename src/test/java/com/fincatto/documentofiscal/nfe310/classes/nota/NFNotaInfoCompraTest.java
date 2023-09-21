package com.fincatto.documentofiscal.nfe310.classes.nota;

import static junit.framework.TestCase.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

import com.fincatto.documentofiscal.nfe310.FabricaDeObjetosFake;

public class NFNotaInfoCompraTest {

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPedidoComTamanhoNaoPermitido() {
        NFNotaInfoCompra test = new NFNotaInfoCompra();
        try {
            test.setPedido("");
            Assert.fail("Validacao nao esta funcionando corretamente");
        } catch (final IllegalStateException e) {
            new NFNotaInfoCompra().setPedido("9tQtearTIcXmO9vxNr3TPhSaItw5mk3zyTVlf2aIFXqqvtXrHoa0qPWKzUzca");
        }
        Assert.fail("Validacao nao esta funcionando corretamente");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirNotaDeEmpenhoComTamanhoNaoPermitido() {
        NFNotaInfoCompra test = new NFNotaInfoCompra();
        try {
            test.setNotaDeEmpenho("");
            Assert.fail("Validacao nao esta funcionando corretamente");
        } catch (final IllegalStateException e) {
            new NFNotaInfoCompra().setNotaDeEmpenho("uCJhbWe0g8OQ8KtSKlkXpRC");
        }
        Assert.fail("Validacao nao esta funcionando corretamente");
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirContratoComTamanhoNaoPermitido() {
        NFNotaInfoCompra test = new NFNotaInfoCompra();
        try {
            test.setContrato("");
            Assert.fail("Validacao nao esta funcionando corretamente");
        } catch (final IllegalStateException e) {
            new NFNotaInfoCompra().setContrato("9tQtearTIcXmO9vxNr3TPhSaItw5mk3zyTVlf2aIFXqqvtXrHoa0qPWKzUzca");
        }
        Assert.fail("Validacao nao esta funcionando corretamente");
    }

    @Test
    public void deveGerarXMLSemContrato() {
        final NFNotaInfoCompra compra = new NFNotaInfoCompra();
        assertNotNull(compra);
        compra.setNotaDeEmpenho("abcefghijklmnopqrstuvx");
        compra.setPedido("1kG8gghJ0YTrUZnt00BJlOsFCtj43eV5mEHHXUzp3rD6QwwUwX4GPavXkMB1");
        compra.toString();
    }

    @Test
    public void deveGerarXMLSemPedido() {
        final NFNotaInfoCompra compra = new NFNotaInfoCompra();
        assertNotNull(compra);
        compra.setContrato("9tQtearTIcXmO9vxNr3TPhSaItw5mk3zyTVlf2aIFXqqvtXrHoa0qPWKzUzc");
        compra.setNotaDeEmpenho("abcefghijklmnopqrstuvx");
        compra.toString();
    }

    @Test
    public void deveGerarXMLSemNotaDeEmpenho() {
        final NFNotaInfoCompra compra = new NFNotaInfoCompra();
        assertNotNull(compra);
        compra.setContrato("9tQtearTIcXmO9vxNr3TPhSaItw5mk3zyTVlf2aIFXqqvtXrHoa0qPWKzUzc");
        compra.setPedido("1kG8gghJ0YTrUZnt00BJlOsFCtj43eV5mEHHXUzp3rD6QwwUwX4GPavXkMB1");
        compra.toString();
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<NFNotaInfoCompra><xNEmp>abcefghijklmnopqrstuvx</xNEmp><xPed>1kG8gghJ0YTrUZnt00BJlOsFCtj43eV5mEHHXUzp3rD6QwwUwX4GPavXkMB1</xPed><xCont>9tQtearTIcXmO9vxNr3TPhSaItw5mk3zyTVlf2aIFXqqvtXrHoa0qPWKzUzc</xCont></NFNotaInfoCompra>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoCompra().toString());
    }
}