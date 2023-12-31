package com.fincatto.documentofiscal.cte300.webservices;

import java.io.IOException;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import com.fincatto.documentofiscal.DFModelo;
import com.fincatto.documentofiscal.cte300.CTeConfig;
import com.fincatto.documentofiscal.cte300.classes.CTAutorizador31;
import com.fincatto.documentofiscal.cte300.classes.evento.inutilizacao.CTEnviaEventoInutilizacao;
import com.fincatto.documentofiscal.cte300.classes.evento.inutilizacao.CTEventoInutilizacaoDados;
import com.fincatto.documentofiscal.cte300.classes.evento.inutilizacao.CTeRetornoEventoInutilizacao;
import com.fincatto.documentofiscal.cte300.webservices.inutilizacao.CteInutilizacaoStub;
import com.fincatto.documentofiscal.cte300.webservices.inutilizacao.CteInutilizacaoStub.CteCabecMsg;
import com.fincatto.documentofiscal.cte300.webservices.inutilizacao.CteInutilizacaoStub.CteCabecMsgE;
import com.fincatto.documentofiscal.cte300.webservices.inutilizacao.CteInutilizacaoStub.CteInutilizacaoCTResult;
import com.fincatto.documentofiscal.utils.DFAssinaturaDigital;
import com.fincatto.documentofiscal.utils.DFPersister;

import javax.naming.InvalidNameException;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;

class WSInutilizacao {

    private static final String VERSAO_SERVICO = "3.00";
    private static final String NOME_SERVICO = "INUTILIZAR";
    private static final Logger LOGGER = LoggerFactory.getLogger(WSInutilizacao.class);
    private final CTeConfig config;

    WSInutilizacao(final CTeConfig config) {
        this.config = config;
    }

    CTeRetornoEventoInutilizacao inutilizaNotaAssinada(final String eventoAssinadoXml) throws Exception {
        final OMElement omElementResult = this.efetuaInutilizacao(eventoAssinadoXml);
        return new DFPersister().read(CTeRetornoEventoInutilizacao.class, omElementResult.toString());
    }

    CTeRetornoEventoInutilizacao inutilizaNota(final int anoInutilizacaoNumeracao, final String cnpjEmitente, final String serie, final String numeroInicial, final String numeroFinal, final String justificativa, final DFModelo modelo) throws Exception {
        final String inutilizacaoXMLAssinado = getXmlAssinado(anoInutilizacaoNumeracao, cnpjEmitente, serie, numeroInicial, numeroFinal, justificativa, modelo);
        final OMElement omElementResult = this.efetuaInutilizacao(inutilizacaoXMLAssinado);
        return new DFPersister().read(CTeRetornoEventoInutilizacao.class, omElementResult.toString());
    }

    String getXmlAssinado(final int anoInutilizacaoNumeracao, final String cnpjEmitente, final String serie, final String numeroInicial, final String numeroFinal, final String justificativa, final DFModelo modelo) 
        throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableEntryException, InvalidNameException, InvalidAlgorithmParameterException, ParserConfigurationException, IOException, XMLSignatureException, SAXException, TransformerException, javax.xml.crypto.MarshalException
    {
    	final String inutilizacaoXML = this.geraDadosInutilizacao(anoInutilizacaoNumeracao, cnpjEmitente, serie, numeroInicial, numeroFinal, justificativa, modelo).toString();
        return new DFAssinaturaDigital(this.config).assinarDocumento(inutilizacaoXML);
    }

    private OMElement efetuaInutilizacao(final String inutilizacaoXMLAssinado) throws XMLStreamException, RemoteException {
        final CteInutilizacaoStub.CteDadosMsg dados = new CteInutilizacaoStub.CteDadosMsg();
        final CteCabecMsgE cabec = new CteInutilizacaoStub.CteCabecMsgE();
        CteCabecMsg param = new CteCabecMsg();
        param.setCUF(this.config.getCUF().getCodigoIbge());
        param.setVersaoDados(VERSAO_SERVICO);
		cabec.setCteCabecMsg(param);
        final OMElement omElement = AXIOMUtil.stringToOM(inutilizacaoXMLAssinado);
        if(WSInutilizacao.LOGGER.isDebugEnabled()) {
            WSInutilizacao.LOGGER.debug(omElement.toString());
        }
        dados.setExtraElement(omElement);

        final CTAutorizador31 autorizador = CTAutorizador31.valueOfCodigoUF(this.config.getCUF());
        final String urlWebService = autorizador.getCteInutilizacao(this.config.getAmbiente());
        final CteInutilizacaoCTResult nf4Result = new CteInutilizacaoStub(urlWebService, config).cteInutilizacaoCT(dados, cabec);
        final OMElement dadosRetorno = nf4Result.getExtraElement();
        if(WSInutilizacao.LOGGER.isDebugEnabled()) {
            WSInutilizacao.LOGGER.debug(dadosRetorno.toString());
        }
        return dadosRetorno;
    }

    private CTEnviaEventoInutilizacao geraDadosInutilizacao(final int anoInutilizacaoNumeracao, final String cnpjEmitente, final String serie, final String numeroInicial, final String numeroFinal, final String justificativa, final DFModelo modelo) {
        final CTEnviaEventoInutilizacao inutilizacao = new CTEnviaEventoInutilizacao();
        final CTEventoInutilizacaoDados dados = new CTEventoInutilizacaoDados();
        dados.setAmbiente(this.config.getAmbiente());
        dados.setAno(anoInutilizacaoNumeracao);
        dados.setCnpj(cnpjEmitente);
        dados.setJustificativa(justificativa);
        dados.setModeloDocumentoFiscal(modelo.getCodigo());
        dados.setNomeServico(WSInutilizacao.NOME_SERVICO);
        dados.setNumeroCTInicial(numeroInicial);
        dados.setNumeroCTFinal(numeroFinal);
        dados.setSerie(serie);
        dados.setUf(this.config.getCUF());
        final String numeroInicialTamanhoMaximo = StringUtils.leftPad(numeroInicial, 9, "0");
        final String numeroFinalTamanhoMaximo = StringUtils.leftPad(numeroFinal, 9, "0");
        final String serieTamanhoMaximo = StringUtils.leftPad(serie, 3, "0");
        dados.setIdentificador("ID" + this.config.getCUF().getCodigoIbge() + cnpjEmitente + modelo.getCodigo() + serieTamanhoMaximo + numeroInicialTamanhoMaximo + numeroFinalTamanhoMaximo);
        inutilizacao.setVersao(new BigDecimal(WSInutilizacao.VERSAO_SERVICO));
        inutilizacao.setDados(dados);
        return inutilizacao;
    }
}