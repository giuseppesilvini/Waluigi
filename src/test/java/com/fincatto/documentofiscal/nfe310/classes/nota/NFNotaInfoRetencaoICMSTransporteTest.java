package com.fincatto.documentofiscal.nfe310.classes.nota;

import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.fincatto.documentofiscal.nfe310.FabricaDeObjetosFake;
import com.fincatto.documentofiscal.nfe310.classes.nota.NFNotaInfoRetencaoICMSTransporte;

public class NFNotaInfoRetencaoICMSTransporteTest {

    @Test
    public void devePermitirAliquotaRetencaoTamanhoValido() {
    	NFNotaInfoRetencaoICMSTransporte nota = new NFNotaInfoRetencaoICMSTransporte();
        nota.setAliquotaRetencao(new BigDecimal("99.99"));
        assertNotNull(nota);
    }

    @Test
    public void devePermitirValorICMSRetidoTamanhoValido() {
    	NFNotaInfoRetencaoICMSTransporte nota = new NFNotaInfoRetencaoICMSTransporte();
        nota.setValorICMSRetido(new BigDecimal("999999999999"));
        assertNotNull(nota);
    }

    @Test
    public void devePermitirValorBXRetencaoICMSTamanhoValido() {
    	NFNotaInfoRetencaoICMSTransporte nota = new NFNotaInfoRetencaoICMSTransporte();
        nota.setBcRetencaoICMS(new BigDecimal("999999999999"));
        assertNotNull(nota);
    }

    @Test
    public void devePermitirValorICMSRetidoValorServicoTamanhoValido() {
    	NFNotaInfoRetencaoICMSTransporte nota = new NFNotaInfoRetencaoICMSTransporte();
        nota.setValorServico(new BigDecimal("999999999999"));
        assertNotNull(nota);
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirAliquotaRetencaoTamanhoValido() {
        new NFNotaInfoRetencaoICMSTransporte().setAliquotaRetencao(new BigDecimal("100000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorICMSRetidoTamanhoInvalido() {
        new NFNotaInfoRetencaoICMSTransporte().setValorICMSRetido(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirBCRetencaoICMSTamanhoInvalido() {
        new NFNotaInfoRetencaoICMSTransporte().setBcRetencaoICMS(new BigDecimal("1000000000000000"));
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirValorServicoTamanhoInvalido() {
        new NFNotaInfoRetencaoICMSTransporte().setValorServico(new BigDecimal("1000000000000000"));
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoMunicipioOcorrenciaFatoGeradorICMSTransporteInvalido() {
        new NFNotaInfoRetencaoICMSTransporte().setCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte("10000000");
    }

    @Test
    public void devePermitirCodigoMunicipioOcorrenciaFatoGeradorICMSTransporteValido() {
    	NFNotaInfoRetencaoICMSTransporte nota = new NFNotaInfoRetencaoICMSTransporte();
        nota.setCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte("9999999");
        assertNotNull(nota);
    }

    @Test(expected = NumberFormatException.class)
    public void naoDevePermitirCFOPValorInvalido() {
        new NFNotaInfoRetencaoICMSTransporte().setCfop(10000);
    }

    @Test
    public void devePermitirCFOPValorValido() {
    	NFNotaInfoRetencaoICMSTransporte nota = new NFNotaInfoRetencaoICMSTransporte();
        nota.setCfop(5351);
        assertNotNull(nota);
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorServicoNulo() {
        final NFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new NFNotaInfoRetencaoICMSTransporte();
        retencaoICMSTransporte.setAliquotaRetencao(new BigDecimal("99.99"));
        retencaoICMSTransporte.setBcRetencaoICMS(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.setCfop(5351);
        retencaoICMSTransporte.setCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte("9999999");
        retencaoICMSTransporte.setValorICMSRetido(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorICMSRetidoNulo() {
        final NFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new NFNotaInfoRetencaoICMSTransporte();
        retencaoICMSTransporte.setAliquotaRetencao(new BigDecimal("99.99"));
        retencaoICMSTransporte.setBcRetencaoICMS(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.setCfop(5351);
        retencaoICMSTransporte.setCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte("9999999");
        retencaoICMSTransporte.setValorServico(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCodigoMunicipioOcorrenciaFatoGeradorICMSTransporteNulo() {
        final NFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new NFNotaInfoRetencaoICMSTransporte();
        retencaoICMSTransporte.setAliquotaRetencao(new BigDecimal("99.99"));
        retencaoICMSTransporte.setBcRetencaoICMS(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.setCfop(5351);
        retencaoICMSTransporte.setValorICMSRetido(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.setValorServico(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirCfopNulo() {
        final NFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new NFNotaInfoRetencaoICMSTransporte();
        retencaoICMSTransporte.setAliquotaRetencao(new BigDecimal("99.99"));
        retencaoICMSTransporte.setBcRetencaoICMS(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.setCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte("9999999");
        retencaoICMSTransporte.setValorICMSRetido(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.setValorServico(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirBcRetencaOICMSNulo() {
        final NFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new NFNotaInfoRetencaoICMSTransporte();
        retencaoICMSTransporte.setAliquotaRetencao(new BigDecimal("99.99"));
        retencaoICMSTransporte.setCfop(5351);
        retencaoICMSTransporte.setCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte("9999999");
        retencaoICMSTransporte.setValorICMSRetido(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.setValorServico(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirAliquotaRetencaoNulo() {
        final NFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new NFNotaInfoRetencaoICMSTransporte();
        retencaoICMSTransporte.setBcRetencaoICMS(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.setCfop(5351);
        retencaoICMSTransporte.setCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte("9999999");
        retencaoICMSTransporte.setValorICMSRetido(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.setValorServico(new BigDecimal("999999999999.99"));
        retencaoICMSTransporte.toString();
    }

    @Test
    public void deveObterAliquotaRetencaoComoFoiSetado() {
        final NFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new NFNotaInfoRetencaoICMSTransporte();
        retencaoICMSTransporte.setAliquotaRetencao(BigDecimal.ONE);
        Assert.assertEquals("1.00", retencaoICMSTransporte.getAliquotaRetencao());
    }

    @Test
    public void deveObterBcRetencaoICMSComoFoiSetado() {
        final NFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new NFNotaInfoRetencaoICMSTransporte();
        retencaoICMSTransporte.setBcRetencaoICMS(BigDecimal.ONE);
        Assert.assertEquals("1.00", retencaoICMSTransporte.getBcRetencaoICMS());
    }

    @Test
    public void deveObterCfopComoFoiSetado() {
        final NFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new NFNotaInfoRetencaoICMSTransporte();
        retencaoICMSTransporte.setCfop(193);
        Assert.assertEquals(193, retencaoICMSTransporte.getCfop(), 0);
    }

    @Test
    public void deveObterCodigoMunicioOcorrenciaFatoGeradorICMSTransporteComoFoiSetado() {
        final NFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new NFNotaInfoRetencaoICMSTransporte();
        final String codigoMunicioOcorrenciaFatoGeradorICMSTransporte = "9876541";
        retencaoICMSTransporte.setCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte(codigoMunicioOcorrenciaFatoGeradorICMSTransporte);
        Assert.assertEquals(codigoMunicioOcorrenciaFatoGeradorICMSTransporte, retencaoICMSTransporte.getCodigoMunicipioOcorrenciaFatoGeradorICMSTransporte());
    }

    @Test
    public void deveObterValorICMSRetidoComoFoiSetado() {
        final NFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new NFNotaInfoRetencaoICMSTransporte();
        retencaoICMSTransporte.setValorICMSRetido(BigDecimal.TEN);
        Assert.assertEquals("10.00", retencaoICMSTransporte.getValorICMSRetido());
    }

    @Test
    public void deveObterValorServicoComoFoiSetado() {
        final NFNotaInfoRetencaoICMSTransporte retencaoICMSTransporte = new NFNotaInfoRetencaoICMSTransporte();
        final String valorServico = "100.00";
        retencaoICMSTransporte.setValorServico(new BigDecimal(valorServico));
        Assert.assertEquals(valorServico, retencaoICMSTransporte.getValorServico());
    }

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<NFNotaInfoRetencaoICMSTransporte><vServ>999999999999.99</vServ><vBCRet>999999999999.99</vBCRet><pICMSRet>99.99</pICMSRet><vICMSRet>999999999999.99</vICMSRet><CFOP>5351</CFOP><cMunFG>9999999</cMunFG></NFNotaInfoRetencaoICMSTransporte>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaInfoRetencaoICMSTransporte().toString());
    }
}