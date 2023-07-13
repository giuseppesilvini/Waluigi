package com.fincatto.documentofiscal.cte300.classes;

import org.junit.Assert;
import org.junit.Test;

public class CTModeloNFTest {

    @Test
    public void deveRepresentarOCodigoCorretamente() {
    	Assert.assertNull(CTModeloNF.valueOfCodigo(null));
    	Assert.assertEquals("01", CTModeloNF.NF_MODELO_01_OU_1_A_OU_AVULSA.getCodigo());
    	Assert.assertEquals("04", CTModeloNF.NF_DE_PRODUTOR.getCodigo());
    }

}
