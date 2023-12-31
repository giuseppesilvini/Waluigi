package com.fincatto.documentofiscal.cte200.classes.cte;

import org.simpleframework.xml.Element;

import com.fincatto.documentofiscal.DFBase;
import com.fincatto.documentofiscal.nfe310.classes.NFNotaInfoImpostoTributacaoICMS;

public class CTInfoImpostoICMSOutraUF extends DFBase {
    private static final long serialVersionUID = -8437040268055848964L;

    @Element(name = "CST")
    private NFNotaInfoImpostoTributacaoICMS situacaoTributaria;

    @Element(name = "pRedBCOutraUF", required = false)
    private String percentualReducaoBaseCalculo;

    @Element(name = "vBCOutraUF")
    private String valorBaseCalculo;

    @Element(name = "pICMSOutraUF")
    private String percentualAliquota;

    @Element(name = "vICMSOutraUF")
    private String valorTributo;

    public NFNotaInfoImpostoTributacaoICMS getSituacaoTributaria() {
        return this.situacaoTributaria;
    }

    public void setSituacaoTributaria(final NFNotaInfoImpostoTributacaoICMS situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public String getPercentualReducaoBaseCalculo() {
        return this.percentualReducaoBaseCalculo;
    }

    public void setPercentualReducaoBaseCalculo(final String percentualReducaoBaseCalculo) {
        this.percentualReducaoBaseCalculo = percentualReducaoBaseCalculo;
    }

    public String getValorBaseCalculo() {
        return this.valorBaseCalculo;
    }

    public void setValorBaseCalculo(final String valorBaseCalculo) {
        this.valorBaseCalculo = valorBaseCalculo;
    }

    public String getPercentualAliquota() {
        return this.percentualAliquota;
    }

    public void setPercentualAliquota(final String percentualAliquota) {
        this.percentualAliquota = percentualAliquota;
    }

    public String getValorTributo() {
        return this.valorTributo;
    }

    public void setValorTributo(final String valorTributo) {
        this.valorTributo = valorTributo;
    }

}
