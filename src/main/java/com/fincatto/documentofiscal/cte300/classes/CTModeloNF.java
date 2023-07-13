package com.fincatto.documentofiscal.cte300.classes;

public enum CTModeloNF {

	NF_MODELO_01_OU_1_A_OU_AVULSA("01", "NF Modelo 01/1A e Avulsa"),
	NF_DE_PRODUTOR("04", "NF de Produtor");

    private final String codigo;
    private final String descricao;

    CTModeloNF(final String codigo, final String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public static CTModeloNF valueOfCodigo(final String codigo) {
        for (final CTModeloNF tipo : CTModeloNF.values()) {
            if (tipo.getCodigo().equals(codigo)) {
                return tipo;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return codigo + " - " + descricao;
    }
}