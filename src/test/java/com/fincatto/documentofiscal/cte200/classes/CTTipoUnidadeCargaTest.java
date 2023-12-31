package com.fincatto.documentofiscal.cte200.classes;

import org.junit.Assert;
import org.junit.Test;

public class CTTipoUnidadeCargaTest {

    @Test
    public void deveRepresentarOCodigoCorretamente() {
        Assert.assertEquals("1", CTTipoUnidadeCarga.CONTAINER.getCodigo());
        Assert.assertEquals("2", CTTipoUnidadeCarga.ULD.getCodigo());
        Assert.assertEquals("3", CTTipoUnidadeCarga.PALLET.getCodigo());
        Assert.assertEquals("4", CTTipoUnidadeCarga.OUTROS.getCodigo());
    }

}
