package com.fincatto.documentofiscal.nfe400.classes.nota;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import com.fincatto.documentofiscal.nfe400.FabricaDeObjetosFake;

public class NFNotaInfoItemImpostoICMSUFDestinoTest {

    @Test
    public void deveObterPercentualAliquotaInternaDestinoComoFoiSetado() {
        final NFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaInfoItemImpostoICMSUFDestino();
        final String percentualAliquota = "999.9999";
        icmsUFDestino.setPercentualAliquotaInternaDestino(new BigDecimal(percentualAliquota));
        Assert.assertEquals(percentualAliquota, icmsUFDestino.getPercentualAliquotaInternaDestino());

    }

    @Test
    public void deveObterPercentualInterestadualComoFoiSetado() {
        final NFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaInfoItemImpostoICMSUFDestino();
        final String percentualInterestadual = "999.9999";
        icmsUFDestino.setPercentualInterestadual(new BigDecimal(percentualInterestadual));
        Assert.assertEquals(percentualInterestadual, icmsUFDestino.getPercentualInterestadual());
    }

    @Test
    public void deveObterPercentualProvisorioPartilhaComoFoiSetado() {
        final NFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaInfoItemImpostoICMSUFDestino();
        final String percentualProvisorioPartilha = "999.9999";
        icmsUFDestino.setPercentualProvisorioPartilha(new BigDecimal(percentualProvisorioPartilha));
        Assert.assertEquals(percentualProvisorioPartilha, icmsUFDestino.getPercentualProvisorioPartilha());
    }

    @Test
    public void deveObterValorBaseCalculoDestinoComoFoiSetado() {
        final NFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaInfoItemImpostoICMSUFDestino();
        final String valorBaseCalculoDestino = "9999999999999.99";
        icmsUFDestino.setValorBaseCalculoDestino(new BigDecimal(valorBaseCalculoDestino));
        Assert.assertEquals(valorBaseCalculoDestino, icmsUFDestino.getValorBaseCalculoDestino());
    }

    @Test
    public void deveObterValorICMSInterestadualDestinoComoFoiSetado() {
        final NFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaInfoItemImpostoICMSUFDestino();
        final String valorICMSInterestadualDestino = "9999999999999.99";
        icmsUFDestino.setValorICMSInterestadualDestino(new BigDecimal(valorICMSInterestadualDestino));
        Assert.assertEquals(valorICMSInterestadualDestino, icmsUFDestino.getValorICMSInterestadualDestino());
    }

    @Test
    public void deveObterValorICMSInterestadualRemetenteComoFoiSetado() {
        final NFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaInfoItemImpostoICMSUFDestino();
        final String valorICMSInterestadualRemetente = "9999999999999.99";
        icmsUFDestino.setValorICMSInterestadualRemetente(new BigDecimal(valorICMSInterestadualRemetente));
        Assert.assertEquals(valorICMSInterestadualRemetente, icmsUFDestino.getValorICMSInterestadualRemetente());
    }


    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualAliquotaInternaDestinoNulo() {
        final NFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaInfoItemImpostoICMSUFDestino();
        icmsUFDestino.setPercentualInterestadual(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualProvisorioPartilha(new BigDecimal("999.9999"));
        icmsUFDestino.setValorBaseCalculoDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualRemetente(new BigDecimal("9999999999999.99"));
        icmsUFDestino.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualInterestadualNulo() {
        final NFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaInfoItemImpostoICMSUFDestino();
        icmsUFDestino.setPercentualAliquotaInternaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualProvisorioPartilha(new BigDecimal("999.9999"));
        icmsUFDestino.setValorBaseCalculoDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualRemetente(new BigDecimal("9999999999999.99"));
        icmsUFDestino.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirPercentualProvisorioPartilhaNulo() {
        final NFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaInfoItemImpostoICMSUFDestino();
        icmsUFDestino.setPercentualAliquotaInternaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualInterestadual(new BigDecimal("999.9999"));
        icmsUFDestino.setValorBaseCalculoDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualRemetente(new BigDecimal("9999999999999.99"));
        icmsUFDestino.toString();
    }


    @Test
    public void deveObterPercentualRelativoFundoCombatePobrezaDestinoComoFoiSetado() {
        final NFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaInfoItemImpostoICMSUFDestino();
        final String percentualRelativoFundoCombatePobrezaDestino = "999.9999";
        icmsUFDestino.setPercentualRelativoFundoCombatePobrezaDestino(new BigDecimal(percentualRelativoFundoCombatePobrezaDestino));
        Assert.assertEquals(percentualRelativoFundoCombatePobrezaDestino, icmsUFDestino.getPercentualRelativoFundoCombatePobrezaDestino());
    }

    @Test
    public void deveObterValorRelativoFundoCombatePobrezaDestinoComoFoiSetado() {
        final NFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaInfoItemImpostoICMSUFDestino();
        final String valorRelativoFundoCombatePobrezaDestino = "9999999999999.99";
        icmsUFDestino.setValorRelativoFundoCombatePobrezaDestino(new BigDecimal(valorRelativoFundoCombatePobrezaDestino));
        Assert.assertEquals(valorRelativoFundoCombatePobrezaDestino, icmsUFDestino.getValorRelativoFundoCombatePobrezaDestino());
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorICMSInterestadualDestinoNulo() {
        final NFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaInfoItemImpostoICMSUFDestino();
        icmsUFDestino.setPercentualAliquotaInternaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualInterestadual(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualProvisorioPartilha(new BigDecimal("999.9999"));
        icmsUFDestino.setValorBaseCalculoDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualRemetente(new BigDecimal("9999999999999.99"));
        icmsUFDestino.toString();
    }

    @Test(expected = IllegalStateException.class)
    public void naoDevePermitirValorICMSInterestadualRemetenteNulo() {
        final NFNotaInfoItemImpostoICMSUFDestino icmsUFDestino = new NFNotaInfoItemImpostoICMSUFDestino();
        icmsUFDestino.setPercentualAliquotaInternaDestino(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualInterestadual(new BigDecimal("999.9999"));
        icmsUFDestino.setPercentualProvisorioPartilha(new BigDecimal("999.9999"));
        icmsUFDestino.setValorBaseCalculoDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.setValorICMSInterestadualDestino(new BigDecimal("9999999999999.99"));
        icmsUFDestino.toString();
    }

    

    @Test
    public void deveGerarXMLDeAcordoComOPadraoEstabelecido() {
        final String xmlEsperado = "<NFNotaInfoItemImpostoICMSUFDestino><vBCUFDest>9999999999999.99</vBCUFDest><vBCFCPUFDest>9999999999999.99</vBCFCPUFDest><pFCPUFDest>999.9999</pFCPUFDest><pICMSUFDest>999.9999</pICMSUFDest><pICMSInter>7.00</pICMSInter><pICMSInterPart>999.9999</pICMSInterPart><vFCPUFDest>9999999999999.99</vFCPUFDest><vICMSUFDest>9999999999999.99</vICMSUFDest><vICMSUFRemet>9999999999999.99</vICMSUFRemet></NFNotaInfoItemImpostoICMSUFDestino>";
        Assert.assertEquals(xmlEsperado, FabricaDeObjetosFake.getNFNotaaInfoItemImpostoICMSUFDestino().toString());
    }
}