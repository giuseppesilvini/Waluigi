package com.fincatto.documentofiscal.mdfe3.classes.nota.evento.cancelamento;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.validadores.DFBigDecimalValidador;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;

import java.math.BigDecimal;

public class MDFeDetalhamentoEventoCancelamento extends DFBase {
    private static final long serialVersionUID = 3638398807163771387L;

    @Attribute(name = "versaoEvento", required = false)
    private String versaoEvento;

    @Element(name = "evCancMDFe")
    private MDFeEnviaEventoCancelamento eventoCancelamento;

    public void setVersaoEvento(final BigDecimal versaoEvento) {
        this.versaoEvento = DFBigDecimalValidador.tamanho5Com2CasasDecimais(versaoEvento, "Versao do Evento");
    }

    public String getVersaoEvento() {
        return this.versaoEvento;
    }

    public MDFeEnviaEventoCancelamento getEventoCancelamento() {
        return this.eventoCancelamento;
    }

    public void setEventoCancelamento(final MDFeEnviaEventoCancelamento eventoCancelamento) {
        this.eventoCancelamento = eventoCancelamento;
    }
}