package com.fincatto.documentofiscal.cte300.transformes;

import org.simpleframework.xml.transform.Transform;

import com.fincatto.documentofiscal.cte300.classes.CTTipoEmissao;

public class CTTipoEmissaoTransformer implements Transform<CTTipoEmissao> {
	
	@Override
    public CTTipoEmissao read(final String codigo) {
		return CTTipoEmissao.valueOfCodigo(codigo);
	}
	
	@Override
    public String write(final CTTipoEmissao tipo) {
		return tipo.getCodigo();
	}
}