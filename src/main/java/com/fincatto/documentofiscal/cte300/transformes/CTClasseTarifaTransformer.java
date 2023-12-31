package com.fincatto.documentofiscal.cte300.transformes;

import org.simpleframework.xml.transform.Transform;

import com.fincatto.documentofiscal.cte300.classes.CTClasseTarifa;

public class CTClasseTarifaTransformer implements Transform<CTClasseTarifa> {

	@Override
    public CTClasseTarifa read(String arg0) {
		return CTClasseTarifa.valueOfCodigo(arg0);
	}

	@Override
    public String write(CTClasseTarifa arg0) {
		return arg0.getCodigo();
	}
}
