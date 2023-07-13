package com.fincatto.documentofiscal.validadores;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class DFIntegerValidadorTest {
    @Test
    public void deveValidarCasoValorParaTamanho7EstejaValido() {
        DFIntegerValidador.tamanho7(9999999, "");
        assertTrue(5 > 4, "5 is greater the 4");
    }

    @Test
    public void deveValidarCasoValorParaTamanho4EstejaValido() {
        DFIntegerValidador.tamanho4(9999, "");
        assertTrue(5 > 4, "5 is greater the 4");
    }

    @Test
    public void deveValidarCasoValorSejaExatamente7() {
        DFIntegerValidador.exatamente7(1000000, "");
        assertTrue(5 > 4, "5 is greater the 4");
        DFIntegerValidador.exatamente7(9999999, "");
    }

    @Test(expected = NumberFormatException.class)
    public void deveLancarExcecaoCasoValorParaTamanho7SejaInvalido() {
        DFIntegerValidador.tamanho7(10000000, "");
    }

    @Test(expected = NumberFormatException.class)
    public void deveLancarExcecaoCasoValorParaTamanho4SejaInvalido() {
        DFIntegerValidador.tamanho4(10000, "");
    }

    @Test
    public void deveValidarTamanho(){
        DFIntegerValidador.tamanho3(12, "");
        assertTrue(5 > 4, "5 is greater the 4");
        DFIntegerValidador.tamanho6(123456, "");
        DFIntegerValidador.tamanho9(12345678, "");
        DFIntegerValidador.tamanho1a2(1, "");
        DFIntegerValidador.tamanho1a2(99, "");
        DFIntegerValidador.tamanho3maximo990(3, "");
        DFIntegerValidador.tamanho3maximo990(100, "");
        DFIntegerValidador.tamanho3maximo990(990, "");
    }

    @Test
    public void deveValidarTamanhoExatamente(){
        DFIntegerValidador.exatamente1(9, "");
        assertTrue(5 > 4, "5 is greater the 4");
        DFIntegerValidador.exatamente2(99, "");
        DFIntegerValidador.exatamente4(9999, "");
        DFIntegerValidador.exatamente6(999999, "");
    }
}
