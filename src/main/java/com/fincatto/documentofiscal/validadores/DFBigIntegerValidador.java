package com.fincatto.documentofiscal.validadores;

import java.math.BigInteger;

public abstract class DFBigIntegerValidador {

    private DFBigIntegerValidador() {
        throw new IllegalStateException("Utility class");
    }

    public static void tamanho12(final BigInteger valor, final String info) {
        if (valor != null && valor.compareTo(BigInteger.valueOf(999999999999L)) > 0) {
            throw new NumberFormatException(String.format("%s com tamanho maior que 12", info));
        }
    }

    public static void tamanho11(final BigInteger valor, final String info) {
        if (valor != null && valor.compareTo(BigInteger.valueOf(99999999999L)) > 0) {
            throw new NumberFormatException(String.format("%s com tamanho maior que 11", info));
        }
    }
}
