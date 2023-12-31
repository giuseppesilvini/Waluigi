package com.fincatto.documentofiscal.nfe400.classes.nota;

import com.fincatto.documentofiscal.nfe400.FabricaDeObjetosFake;
import com.fincatto.documentofiscal.nfe400.utils.NFGeraChave;
import org.junit.Assert;
import org.junit.Test;

public class NFGeraChaveTest {

    @Test
    public void geraChaveDeAcessoComCPFConformeEsperado() {
        final NFNota nota = new NFNota();
        nota.setInfo(FabricaDeObjetosFake.getNFNotaInfo());
        nota.getInfo().getEmitente().setCpf("12345678901");
        nota.getInfo().getEmitente().setCnpj(null);

        final String chaveAcesso = new NFGeraChave(nota).getChaveAcesso();
        Assert.assertEquals("43101000012345678901559999999999991999999985", chaveAcesso);
        Assert.assertEquals(44, chaveAcesso.length());

        nota.getInfo().setIdentificador(chaveAcesso);
        Assert.assertEquals("NFe43101000012345678901559999999999991999999985", nota.getInfo().getIdentificador());
        Assert.assertEquals(47, nota.getInfo().getIdentificador().length());
    }

    @Test
    public void geraChaveDeAcessoComCNPJConformeEsperado() {
        final NFNota nota = new NFNota();
        nota.setInfo(FabricaDeObjetosFake.getNFNotaInfo());
        nota.getInfo().getEmitente().setCpf(null);
        nota.getInfo().getEmitente().setCnpj("12345678901234");

        final String chaveAcesso = new NFGeraChave(nota).getChaveAcesso();
        Assert.assertEquals("43101012345678901234559999999999991999999980", chaveAcesso);
        Assert.assertEquals(44, chaveAcesso.length());

        nota.getInfo().setIdentificador(chaveAcesso);
        Assert.assertEquals("NFe43101012345678901234559999999999991999999980", nota.getInfo().getIdentificador());
        Assert.assertEquals(47, nota.getInfo().getIdentificador().length());
    }

    @Test
    public void geraChaveDeAcessoRandomica() {
        final NFNota nota = new NFNota();
        nota.setInfo(FabricaDeObjetosFake.getNFNotaInfo());
        nota.getInfo().getEmitente().setCpf(null);
        nota.getInfo().getEmitente().setCnpj("12345678901234");

        final NFGeraChave geraChave = new NFGeraChave(nota);
        nota.getInfo().getIdentificacao().setCodigoRandomico(geraChave.geraCodigoRandomico());

        final String chaveAcesso = geraChave.getChaveAcesso();
        Assert.assertEquals("43101012345678901234559999999999991213984545", chaveAcesso);
        Assert.assertEquals(44, chaveAcesso.length());

        nota.getInfo().setIdentificador(chaveAcesso);
        Assert.assertEquals("NFe43101012345678901234559999999999991213984545", nota.getInfo().getIdentificador());
        Assert.assertEquals(47, nota.getInfo().getIdentificador().length());
    }

    @Test(expected = IllegalStateException.class)
    public void geraChaveDeAcessoSemCodigoRandomicoRetornaExcecao() {
        final NFNota nota = new NFNota();
        nota.setInfo(FabricaDeObjetosFake.getNFNotaInfo());
        nota.getInfo().getIdentificacao().setCodigoRandomico(null);
        new NFGeraChave(nota).getChaveAcesso();
    }
}