package com.fincatto.documentofiscal.cte300.transformes;

import org.simpleframework.xml.transform.Transform;

import com.fincatto.documentofiscal.cte300.classes.CTTipoFerrovia;

public class CTTipoFerroviaTransformer implements Transform<CTTipoFerrovia> {

	@Override
    public CTTipoFerrovia read(String arg0) {
		return CTTipoFerrovia.valueOfCodigo(arg0);
	}

	@Override
    public String write(CTTipoFerrovia arg0) {
		return arg0.getCodigo();
	}
}