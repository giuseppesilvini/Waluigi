package com.fincatto.documentofiscal.nfe310.classes.nota;

import com.fincatto.documentofiscal.nfe310.FabricaDeObjetosFake;
import org.junit.Assert;
import org.junit.Test;

public class NFNotaInfoItemImpostoICMSTest {

    @Test
    public void deveObterIcms00ComoFoiSetado() {
        final NFNotaInfoItemImpostoICMS icms = new NFNotaInfoItemImpostoICMS();
        final NFNotaInfoItemImpostoICMS00 icms00 = FabricaDeObjetosFake.getNFNotaInfoItemImpostoICMS00();
        icms.setIcms00(icms00);
        Assert.assertEquals(icms00, icms.getIcms00());
    }

    @Test
    public void deveObterIcms10ComoFoiSetado() {
        final NFNotaInfoItemImpostoICMS icms = new NFNotaInfoItemImpostoICMS();
        final NFNotaInfoItemImpostoICMS10 icms10 = new NFNotaInfoItemImpostoICMS10();
        icms.setIcms10(icms10);
        Assert.assertEquals(icms10, icms.getIcms10());
    }

    @Test
    public void deveObterIcms20ComoFoiSetado() {
        final NFNotaInfoItemImpostoICMS icms = new NFNotaInfoItemImpostoICMS();
        final NFNotaInfoItemImpostoICMS20 icms20 = new NFNotaInfoItemImpostoICMS20();
        icms.setIcms20(icms20);
        Assert.assertEquals(icms20, icms.getIcms20());
    }

    @Test
    public void deveObterIcms30ComoFoiSetado() {
        final NFNotaInfoItemImpostoICMS icms = new NFNotaInfoItemImpostoICMS();
        final NFNotaInfoItemImpostoICMS30 icmsSetado = new NFNotaInfoItemImpostoICMS30();
        icms.setIcms30(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcms30());
    }

    @Test
    public void deveObterIcms40ComoFoiSetado() {
        final NFNotaInfoItemImpostoICMS icms = new NFNotaInfoItemImpostoICMS();
        final NFNotaInfoItemImpostoICMS40 icmsSetado = new NFNotaInfoItemImpostoICMS40();
        icms.setIcms40(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcms40());
    }

    @Test
    public void deveObterIcms51ComoFoiSetado() {
        final NFNotaInfoItemImpostoICMS icms = new NFNotaInfoItemImpostoICMS();
        final NFNotaInfoItemImpostoICMS51 icmsSetado = new NFNotaInfoItemImpostoICMS51();
        icms.setIcms51(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcms51());
    }

    @Test
    public void deveObterIcms60ComoFoiSetado() {
        final NFNotaInfoItemImpostoICMS icms = new NFNotaInfoItemImpostoICMS();
        final NFNotaInfoItemImpostoICMS60 icmsSetado = new NFNotaInfoItemImpostoICMS60();
        icms.setIcms60(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcms60());
    }

    @Test
    public void deveObterIcms70ComoFoiSetado() {
        final NFNotaInfoItemImpostoICMS icms = new NFNotaInfoItemImpostoICMS();
        final NFNotaInfoItemImpostoICMS70 icmsSetado = new NFNotaInfoItemImpostoICMS70();
        icms.setIcms70(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcms70());
    }

    @Test
    public void deveObterIcms90ComoFoiSetado() {
        final NFNotaInfoItemImpostoICMS icms = new NFNotaInfoItemImpostoICMS();
        final NFNotaInfoItemImpostoICMS90 icmsSetado = new NFNotaInfoItemImpostoICMS90();
        icms.setIcms90(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcms90());
    }

    @Test
    public void deveObterIcmsPartilhadoComoFoiSetado() {
        final NFNotaInfoItemImpostoICMS icms = new NFNotaInfoItemImpostoICMS();
        final NFNotaInfoItemImpostoICMSPartilhado icmsSetado = new NFNotaInfoItemImpostoICMSPartilhado();
        icms.setIcmsPartilhado(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcmsPartilhado());
    }

    @Test
    public void deveObterIcmsSN101ComoFoiSetado() {
        final NFNotaInfoItemImpostoICMS icms = new NFNotaInfoItemImpostoICMS();
        final NFNotaInfoItemImpostoICMSSN101 icmsSetado = new NFNotaInfoItemImpostoICMSSN101();
        icms.setIcmssn101(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcmssn101());
    }

    @Test
    public void deveObterIcmsSN102ComoFoiSetado() {
        final NFNotaInfoItemImpostoICMS icms = new NFNotaInfoItemImpostoICMS();
        final NFNotaInfoItemImpostoICMSSN102 icmsSetado = new NFNotaInfoItemImpostoICMSSN102();
        icms.setIcmssn102(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcmssn102());
    }

    @Test
    public void deveObterIcmsSN201ComoFoiSetado() {
        final NFNotaInfoItemImpostoICMS icms = new NFNotaInfoItemImpostoICMS();
        final NFNotaInfoItemImpostoICMSSN201 icmsSetado = new NFNotaInfoItemImpostoICMSSN201();
        icms.setIcmssn201(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcmssn201());
    }

    @Test
    public void deveObterIcmsSN202ComoFoiSetado() {
        final NFNotaInfoItemImpostoICMS icms = new NFNotaInfoItemImpostoICMS();
        final NFNotaInfoItemImpostoICMSSN202 icmsSetado = new NFNotaInfoItemImpostoICMSSN202();
        icms.setIcmssn202(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcmssn202());
    }

    @Test
    public void deveObterIcmsSN500ComoFoiSetado() {
        final NFNotaInfoItemImpostoICMS icms = new NFNotaInfoItemImpostoICMS();
        final NFNotaInfoItemImpostoICMSSN500 icmsSetado = new NFNotaInfoItemImpostoICMSSN500();
        icms.setIcmssn500(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcmssn500());
    }

    @Test
    public void deveObterIcmsSN900ComoFoiSetado() {
        final NFNotaInfoItemImpostoICMS icms = new NFNotaInfoItemImpostoICMS();
        final NFNotaInfoItemImpostoICMSSN900 icmsSetado = new NFNotaInfoItemImpostoICMSSN900();
        icms.setIcmssn900(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcmssn900());
    }

    @Test
    public void deveObterIcmsSTComoFoiSetado() {
        final NFNotaInfoItemImpostoICMS icms = new NFNotaInfoItemImpostoICMS();
        final NFNotaInfoItemImpostoICMSST icmsSetado = new NFNotaInfoItemImpostoICMSST();
        icms.setIcmsst(icmsSetado);
        Assert.assertEquals(icmsSetado, icms.getIcmsst());
    }

    @Test
    public void devePermitirApenasUmICMSSelecionado() {
        final NFNotaInfoItemImpostoICMS icms = new NFNotaInfoItemImpostoICMS();
        icms.setIcms00(new NFNotaInfoItemImpostoICMS00());

        NFNotaInfoItemImpostoICMS10 test1 = new NFNotaInfoItemImpostoICMS10();
        try {
            icms.setIcms10(test1);
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoICMS20 test2 = new NFNotaInfoItemImpostoICMS20();
        try {
            icms.setIcms20(test2);
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoICMS30 test3 = new NFNotaInfoItemImpostoICMS30();
        try {
            icms.setIcms30(test3);
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoICMS40 test4 = new NFNotaInfoItemImpostoICMS40();
        try {
            icms.setIcms40(test4);
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoICMS51 test5 = new NFNotaInfoItemImpostoICMS51();
        try {
            icms.setIcms51(test5);
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoICMS60 test6 = new NFNotaInfoItemImpostoICMS60();
        try {
            icms.setIcms60(test6);
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoICMS70 test7 = new NFNotaInfoItemImpostoICMS70();
        try {
            icms.setIcms70(test7);
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoICMS90 test8 = new NFNotaInfoItemImpostoICMS90();
        try {
            icms.setIcms90(test8);
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoICMSPartilhado test9 = new NFNotaInfoItemImpostoICMSPartilhado();
        try {
            icms.setIcmsPartilhado(test9);
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoICMSSN101 test10 = new NFNotaInfoItemImpostoICMSSN101();
        try {
            icms.setIcmssn101(test10);
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoICMSSN102 test11 = new NFNotaInfoItemImpostoICMSSN102();
        try {
            icms.setIcmssn102(test11);
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoICMSSN201 test12 = new NFNotaInfoItemImpostoICMSSN201();
        try {
            icms.setIcmssn201(test12);
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoICMSSN202 test13 = new NFNotaInfoItemImpostoICMSSN202();
        try {
            icms.setIcmssn202(test13);
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoICMSSN500 test14 = new NFNotaInfoItemImpostoICMSSN500();
        try {
            icms.setIcmssn500(test14);
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException ignored) {
        }
        NFNotaInfoItemImpostoICMSSN900 test15 = new NFNotaInfoItemImpostoICMSSN900();
        try {
            icms.setIcmssn900(test15);
            Assert.fail("So pode permitir um icms cadastrado");
        } catch (final IllegalStateException ignored) {
        }
    }

    @Test
    public void deveEstarSelecionadoCasoTenhaUmICMSSetado() {
        final NFNotaInfoItemImpostoICMS icms = new NFNotaInfoItemImpostoICMS();
        icms.setIcms00(new NFNotaInfoItemImpostoICMS00());
        Assert.assertTrue(icms.isSelecionado());
    }

    @Test
    public void naoDeveEstarSelecionadoCasoNaoTenhaICMSSetado() {
        final NFNotaInfoItemImpostoICMS icms = new NFNotaInfoItemImpostoICMS();
        Assert.assertFalse(icms.isSelecionado());
    }
}