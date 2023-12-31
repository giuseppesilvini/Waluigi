package com.fincatto.documentofiscal.cte300.classes.nota;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * @author Caio
 * @info Informações do CT-e Globalizado
 */

@Root(name = "infGlobalizado")
@Namespace(reference = "http://www.portalfiscal.inf.br/cte")
public class CTeNotaInfoCTeNormalInfoGlobalizado extends DFBase {
    private static final long serialVersionUID = -2117514135660749569L;
    
    @Element(name = "xObs")
    private String observacao;

    public CTeNotaInfoCTeNormalInfoGlobalizado() {
        this.observacao = null;
    }

    public String getObservacao() {
        return this.observacao;
    }

    /**
     * Preencher com informações adicionais, legislação do regime especial, etc
     */
    public void setObservacao(final String observacao) {
        DFStringValidador.tamanho15a256(observacao, "Preencher com informações adicionais, legislação do regime especial, etc");
        this.observacao = observacao;
    }
}
