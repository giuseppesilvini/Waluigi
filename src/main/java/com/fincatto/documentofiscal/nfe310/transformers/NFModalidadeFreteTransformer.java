package com.fincatto.documentofiscal.nfe310.transformers;

import com.fincatto.documentofiscal.nfe310.classes.NFModalidadeFrete;
import org.simpleframework.xml.transform.Transform;

public class NFModalidadeFreteTransformer implements Transform<NFModalidadeFrete> {

    @Override
    public NFModalidadeFrete read(final String codigo) {
        return NFModalidadeFrete.valueOfCodigo(codigo);
    }

    @Override
    public String write(final NFModalidadeFrete modalidadeFrete) {
        return modalidadeFrete.getCodigo();
    }
}