package com.fincatto.documentofiscal.cte300.transformes;

import org.simpleframework.xml.transform.Transform;

import com.fincatto.documentofiscal.cte300.classes.CTTipoUnidadeCarga;

public class CTTipoUnidadeCargaTransformer implements Transform<CTTipoUnidadeCarga> {
    
    @Override
    public CTTipoUnidadeCarga read(String arg0) {
        return CTTipoUnidadeCarga.valueOfCodigo(arg0);
    }
    
    @Override
    public String write(CTTipoUnidadeCarga arg0) {
        return arg0.getCodigo();
    }
}