package com.fincatto.documentofiscal.mdfe3.utils;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoIdentificacao;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFe;
import org.apache.commons.lang3.StringUtils;

import java.security.SecureRandom;
import java.time.format.DateTimeFormatter;

public class MDFGeraChave {

    private final MDFe mdfe;

    public MDFGeraChave(MDFe nota) {
        this.mdfe = nota;
    }

    public String geraCodigoRandomico() {
        long seed = this.mdfe.getInfo().getIdentificacao().getDataEmissao().toInstant().toEpochMilli();
        final SecureRandom random = new SecureRandom();
        random.setSeed(seed);
        int randomInt = random.nextInt(100000000);
        String randomIntString = Integer.toString(randomInt);
        return StringUtils.leftPad(randomIntString , 8, "0");
    }

    public String getChaveAcesso() {
        return String.format("%s%s", this.geraChaveAcessoSemDV(), this.getDV());
    }

    public Integer getDV() {
        final char[] valores = this.geraChaveAcessoSemDV().toCharArray();
        final int[] valoresInt = {2, 3, 4, 5, 6, 7, 8, 9};
        int indice = 0;
        int soma = 0;
        int valorTemp;
        int multTemp;
        for (int i = valores.length; i > 0; i--) {
            if (indice >= valoresInt.length) {
                indice = 0;
            }

            valorTemp = Integer.parseInt(String.valueOf(valores[i - 1]));
            multTemp = valoresInt[indice++];
            soma += valorTemp * multTemp;
        }
        final int dv = 11 - (soma % 11);
        return ((dv == 11) || (dv == 10)) ? 0 : dv;
    }

    private String geraChaveAcessoSemDV() {
        if (StringUtils.isBlank(this.mdfe.getInfo().getIdentificacao().getCodigoNumerico())) {
            throw new IllegalStateException("Codigo numerico deve estar presente para gerar a chave de acesso");
        }
        return StringUtils.leftPad(this.mdfe.getInfo().getIdentificacao().getCodigoUF().getCodigoIbge(), 2, "0") + StringUtils.leftPad(DateTimeFormatter.ofPattern("yyMM").format(this.mdfe.getInfo().getIdentificacao().getDataEmissao()), 4, "0") + StringUtils.leftPad(this.mdfe.getInfo().getEmitente().getCpfj(), 14, "0") + StringUtils.leftPad(MDFInfoIdentificacao.MOD.getCodigo(), 2, "0") + StringUtils.leftPad(this.mdfe.getInfo().getIdentificacao().getSerie() + "", 3, "0") + StringUtils.leftPad(this.mdfe.getInfo().getIdentificacao().getNumero() + "", 9, "0") + StringUtils.leftPad(this.mdfe.getInfo().getIdentificacao().getTipoEmissao().getCodigo(), 1, "0") + StringUtils.leftPad(this.mdfe.getInfo().getIdentificacao().getCodigoNumerico(), 8, "0");
    }
}
