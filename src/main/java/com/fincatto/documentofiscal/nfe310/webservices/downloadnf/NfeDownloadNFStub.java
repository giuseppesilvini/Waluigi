/*
  NfeDownloadNFStub.java This file was auto-generated from WSDL by the Apache Axis2 version: 1.6.2 Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.fincatto.documentofiscal.nfe310.webservices.downloadnf;

import com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub;
import org.apache.axiom.om.OMAttribute;
import org.apache.axis2.client.Stub;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import com.fincatto.documentofiscal.DFConfig;
import com.fincatto.documentofiscal.utils.MessageContextFactory;

import java.util.Arrays;
import java.util.List;

/*
 * NfeDownloadNFStub java implementation
 */
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
public class NfeDownloadNFStub extends org.apache.axis2.client.Stub {

    private static final String EXTRA_ELEMENT_CANNOT_BE_NULL = "extraElement cannot be null!!";
    private static final String UTILITY_CLASS = "Utility class";
    public static final String NFE_DOWNLOAD_NF_RESULT = "nfeDownloadNFResult";
    public static final String VERSAO_DADOS = "versaoDados";
    public static final String NFE_CABEC_MSG = "nfeCabecMsg";
    public static final String XMLSCHEMA_INSTANCE = "http://www.w3.org/2001/XMLSchema-instance";
    public static final String NFE_DADOS_MSG = "nfeDadosMsg";

    public static final String WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DOWNLOAD_NF = "http://www.portalfiscal.inf.br/nfe/wsdl/NfeDownloadNF";
    public static final String NFE_DOWNLOAD_NF = "nfeDownloadNF";
    public static final String UNEXPECTED_SUBELEMENT = "Unexpected subelement ";
    protected org.apache.axis2.description.AxisOperation[] operations;

    // hashmaps to keep the fault mapping
    private final java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private final java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private final java.util.HashMap faultMessageMap = new java.util.HashMap();

    private static int counter = 0;

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (NfeDownloadNFStub.counter > 99999) {
            NfeDownloadNFStub.counter = 0;
        }
        NfeDownloadNFStub.counter = NfeDownloadNFStub.counter + 1;
        return System.currentTimeMillis() + "_" + NfeDownloadNFStub.counter;
    }

    private void populateAxisService() {
        // creating the Service with a unique name
        this._service = new org.apache.axis2.description.AxisService(NFE_DOWNLOAD_NF + NfeDownloadNFStub.getUniqueSuffix());
        this.addAnonymousOperations();
        // creating the operations
        org.apache.axis2.description.AxisOperation operation;
        this.operations = new org.apache.axis2.description.AxisOperation[1];
        operation = new org.apache.axis2.description.OutInAxisOperation();
        operation.setName(new javax.xml.namespace.QName(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DOWNLOAD_NF, NFE_DOWNLOAD_NF));
        this._service.addOperation(operation);
        this.operations[0] = operation;
    }

    // populates the faults
    private void populateFaults() {
        // Empty Method
    }

    /**
     * Constructor that takes in a configContext
     */

    public NfeDownloadNFStub(final org.apache.axis2.context.ConfigurationContext configurationContext, final java.lang.String targetEndpoint, DFConfig config) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false, config);
    }

    /**
     * Constructor that takes in a configContext and useseperate listner
     */
    public NfeDownloadNFStub(final org.apache.axis2.context.ConfigurationContext configurationContext, final java.lang.String targetEndpoint, final boolean useSeparateListener, DFConfig config) throws org.apache.axis2.AxisFault {
        // To populate AxisService
        this.populateAxisService();
        this.populateFaults();
        this._serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, this._service);
        this._serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
        this._serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        // Set the soap version
        this._serviceClient.getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
        this.config = config;
    }

    /**
     * Constructor taking the target endpoint
     */
    public NfeDownloadNFStub(final java.lang.String targetEndpoint, DFConfig config) throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint, config);
    }

    /**
     * Auto generated method signature Serviço destinado ao atendimento de solicitações de download de Notas Fiscais Eletrônicas por seus destinatários.
     *
     * @param nfeDadosMsg0
     * @param nfeCabecMsg1
     */

    public com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeDownloadNFResult nfeDownloadNF(final com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeDadosMsg nfeDadosMsg0, final com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeCabecMsgE nfeCabecMsg1) throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext messageContext = null;
        try {
            final org.apache.axis2.client.OperationClient operationClient = this._serviceClient.createClient(this.operations[0].getName());
            operationClient.getOptions().setAction("http://www.portalfiscal.inf.br/nfe/wsdl/NfeDownloadNF/nfeDownloadNF");
            operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);
            this.addPropertyToOperationClient(operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");
            // create a message context
            messageContext = MessageContextFactory.INSTANCE.create(config);
            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env;
            env = this.toEnvelope(Stub.getFactory(operationClient.getOptions().getSoapVersionURI()), nfeDadosMsg0);
            env.build();
            // add the children only if the parameter is not null
            if (nfeCabecMsg1 != null) {
                final org.apache.axiom.om.OMElement omElementnfeCabecMsg1 = this.toOM(nfeCabecMsg1);
                this.addHeader(omElementnfeCabecMsg1, env);
            }
            // adding SOAP soap_headers
            this._serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            messageContext.setEnvelope(env);
            // add the message contxt to the operation client
            operationClient.addMessageContext(messageContext);
            // execute the operation client
            operationClient.execute(true);
            final org.apache.axis2.context.MessageContext returnMessageContext = operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            final org.apache.axiom.soap.SOAPEnvelope returnEnv = returnMessageContext.getEnvelope();
            final java.lang.Object object = this.fromOM(returnEnv.getBody().getFirstElement(), com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeDownloadNFResult.class);
            return (com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeDownloadNFResult) object;
        } catch (final org.apache.axis2.AxisFault f) {
            final org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt == null) {
                throw f;
            }
            if (!this.faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), NFE_DOWNLOAD_NF))) {
                throw f;
            }
            // make the fault by reflection
            try {
                final java.lang.String exceptionClassName = (java.lang.String) this.faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), NFE_DOWNLOAD_NF));
                final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                final java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                // message class
                final java.lang.String messageClassName = (java.lang.String) this.faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), NFE_DOWNLOAD_NF));
                final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                final java.lang.Object messageObject = this.fromOM(faultElt, messageClass);
                final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
                m.invoke(ex, messageObject);
                throw new java.rmi.RemoteException(ex.getMessage(), ex);
            } catch (final ClassCastException | InstantiationException | IllegalAccessException | java.lang.reflect.InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
                // we cannot intantiate the class - throw the original Axis fault
                throw f;
            }
        } finally {
            if(messageContext != null && messageContext.getTransportOut() != null) {
                messageContext.getTransportOut().getSender().cleanup(messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations Serviço destinado ao atendimento de solicitações de download de Notas Fiscais Eletrônicas por seus destinatários.
     *
     * @param nfeDadosMsg0
     * @param nfeCabecMsg1
     */
    public void startnfeDownloadNF(final com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeDadosMsg nfeDadosMsg0, final com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeCabecMsgE nfeCabecMsg1, final com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFCallbackHandler callback) throws java.rmi.RemoteException {
        final org.apache.axis2.client.OperationClient operationClient = this._serviceClient.createClient(this.operations[0].getName());
        operationClient.getOptions().setAction("http://www.portalfiscal.inf.br/nfe/wsdl/NfeDownloadNF/nfeDownloadNF");
        operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);
        this.addPropertyToOperationClient(operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");
        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env;
        final org.apache.axis2.context.MessageContext messageContext = MessageContextFactory.INSTANCE.create(config);
        // Style is Doc.
        env = this.toEnvelope(Stub.getFactory(operationClient.getOptions().getSoapVersionURI()), nfeDadosMsg0);
        // add the soap_headers only if they are not null
        if (nfeCabecMsg1 != null) {
            final org.apache.axiom.om.OMElement omElementnfeCabecMsg1 = this.toOM(nfeCabecMsg1);
            this.addHeader(omElementnfeCabecMsg1, env);
        }
        // adding SOAP soap_headers
        this._serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        messageContext.setEnvelope(env);
        // add the message context to the operation client
        operationClient.addMessageContext(messageContext);
        operationClient.setCallback(createCallback(callback, messageContext));
        org.apache.axis2.util.CallbackReceiver callbackReceiver;
        if (this.operations[0].getMessageReceiver() == null && operationClient.getOptions().isUseSeparateListener()) {
            callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            this.operations[0].setMessageReceiver(callbackReceiver);
        }
        // execute the operation client
        operationClient.execute(false);
    }

    private org.apache.axis2.client.async.AxisCallback createCallback(com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFCallbackHandler callback, org.apache.axis2.context.MessageContext messageContext) {
        return new org.apache.axis2.client.async.AxisCallback() {
            @Override
            public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
                try {
                    final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                    final java.lang.Object object = NfeDownloadNFStub.this.fromOM(resultEnv.getBody().getFirstElement(), com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeDownloadNFResult.class);
                    callback.receiveResultnfeDownloadNF((com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeDownloadNFResult) object);
                } catch (final org.apache.axis2.AxisFault e) {
                    callback.receiveErrornfeDownloadNF(e);
                }
            }

            @Override
            public void onError(final java.lang.Exception error) {
                callbackError(error, callback);
            }

            @Override
            public void onFault(final org.apache.axis2.context.MessageContext faultContext) {
                final org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                this.onError(fault);
            }

            @Override
            public void onComplete() {
                try {
                    messageContext.getTransportOut().getSender().cleanup(messageContext);
                } catch (final org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrornfeDownloadNF(axisFault);
                }
            }
        };
    }

    private void callbackError(java.lang.Exception error, com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFCallbackHandler callback) {
        if (error instanceof org.apache.axis2.AxisFault) {
            final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
            final org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null &&
                        NfeDownloadNFStub.this.faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), NFE_DOWNLOAD_NF))) {
                // make the fault by reflection
                try {
                    final java.lang.String exceptionClassName = (java.lang.String) NfeDownloadNFStub.this.faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), NFE_DOWNLOAD_NF));
                    final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    final java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(String.class);
                    final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                    // message class
                    final java.lang.String messageClassName = (java.lang.String) NfeDownloadNFStub.this.faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), NFE_DOWNLOAD_NF));
                    final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    final java.lang.Object messageObject = NfeDownloadNFStub.this.fromOM(faultElt, messageClass);
                    final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
                    m.invoke(ex, messageObject);
                    callback.receiveErrornfeDownloadNF(new java.rmi.RemoteException(ex.getMessage(), ex));
                } catch (final ClassCastException | org.apache.axis2.AxisFault | InstantiationException | IllegalAccessException | java.lang.reflect.InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    callback.receiveErrornfeDownloadNF(f);
                }
            } else {
                callback.receiveErrornfeDownloadNF(f);
            }
        } else {
            callback.receiveErrornfeDownloadNF(error);
        }
    }

    /**
     * A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(final org.apache.axiom.soap.SOAPEnvelope env) {
        final java.util.Map returnMap = new java.util.HashMap();
        final java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            final org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }
        return returnMap;
    }

    private static final javax.xml.namespace.QName[] opNameArray = null;
    private final DFConfig config;

    private boolean optimizeContent(final javax.xml.namespace.QName opName) {
        for (final QName element : opNameArray) {
            if (opName.equals(element)) {
                return true;
            }
        }
        return false;
    }

    // https://www.nfe.fazenda.gov.br/NfeDownloadNF/NfeDownloadNF.asmx
    public static class NfeDadosMsg implements org.apache.axis2.databinding.ADBBean {

        private static final long serialVersionUID = -6125867823526921405L;

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DOWNLOAD_NF, NFE_DADOS_MSG, "");

        /**
         * field for ExtraElement
         */

        protected transient org.apache.axiom.om.OMElement localExtraElement;

        /**
         * Auto generated getter method
         *
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getExtraElement() {
            return this.localExtraElement;
        }

        /**
         * Auto generated setter method
         *
         * @param param ExtraElement
         */
        public void setExtraElement(final org.apache.axiom.om.OMElement param) {
            this.localExtraElement = param;
        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        @Override
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) {
            final org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, NfeDadosMsg.MY_QNAME);
            return factory.createOMElement(dataSource, NfeDadosMsg.MY_QNAME);
        }

        @Override
        public void serialize(final javax.xml.namespace.QName parentQName, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            this.serialize(parentQName, xmlWriter, false);
        }

        @Override
        public void serialize(final javax.xml.namespace.QName parentQName, final javax.xml.stream.XMLStreamWriter xmlWriter, final boolean serializeType) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix;
            java.lang.String namespace;
            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            this.writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
            if (serializeType) {
                final java.lang.String namespacePrefix = this.registerPrefix(xmlWriter, WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DOWNLOAD_NF);
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    this.writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", namespacePrefix + ":nfeDadosMsg", xmlWriter);
                } else {
                    this.writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", NFE_DADOS_MSG, xmlWriter);
                }
            }
            if (this.localExtraElement != null) {
                this.localExtraElement.serialize(xmlWriter);
            } else {
                throw new org.apache.axis2.databinding.ADBException(EXTRA_ELEMENT_CANNOT_BE_NULL);
            }
            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(final java.lang.String namespace) {
            if (namespace.equals(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DOWNLOAD_NF)) {
                return "";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, final java.lang.String namespace, final java.lang.String localPart, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = NfeDadosMsg.generatePrefix(namespace);
                }
                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(final java.lang.String prefix, final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                this.registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(final java.lang.String namespace, final java.lang.String attName, final javax.xml.namespace.QName qname, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = this.registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                this.registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(final javax.xml.namespace.QName qname, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = NfeDadosMsg.generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }
                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(final javax.xml.namespace.QName[] qnames, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                final StringBuilder stringToWrite = new StringBuilder();
                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    String strToWrite = getStringToWrite(qnames[i], xmlWriter);
                    stringToWrite.append(strToWrite);
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        private String getStringToWrite(QName qname, XMLStreamWriter xmlWriter) throws XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            String prefix;
            StringBuilder stringToWrite = new StringBuilder();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = NfeConsultaStub.NfeCabecMsgE.generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }
                if (prefix.trim().length() > 0) {
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
            return stringToWrite.toString();
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(final javax.xml.stream.XMLStreamWriter xmlWriter, final java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = NfeDadosMsg.generatePrefix(namespace);
                final javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    final java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        @Override
        public javax.xml.stream.XMLStreamReader getPullParser(final javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {
            final java.util.ArrayList elementList = new java.util.ArrayList();
            final java.util.ArrayList attribList = new java.util.ArrayList();
            if (this.localExtraElement != null) {
                elementList.add(org.apache.axis2.databinding.utils.Constants.OM_ELEMENT_KEY);
                elementList.add(this.localExtraElement);
            } else {
                throw new org.apache.axis2.databinding.ADBException(EXTRA_ELEMENT_CANNOT_BE_NULL);
            }
            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            private Factory() {
                throw new IllegalStateException(UTILITY_CLASS);
            }

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at its end element If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static NfeDadosMsg parse(final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                final NfeDadosMsg object = new NfeDadosMsg();
                final int event;
                final java.lang.String nillableValue = null;
                final java.lang.String prefix = "";
                final java.lang.String namespaceuri = "";
                try {
                    while (isNotStartOrEndElement(reader)) {
                        reader.next();
                    }
                    NfeDadosMsg varParse = parsePart1(reader);
                    if(varParse != null) {
                        return varParse;
                    }
                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    final java.util.ArrayList<String> handledAttributes = new java.util.ArrayList<>();
                    reader.next();
                    while (isNotStartOrEndElement(reader)) {
                        reader.next();
                    }
                    if (reader.isStartElement()) {
                        // use the QName from the parser as the name for the builder
                        final javax.xml.namespace.QName startQname1 = reader.getName();
                        // We need to wrap the reader so that it produces a fake START_DOCUMENT event
                        // this is needed by the builder classes
                        final org.apache.axis2.databinding.utils.NamedStaxOMBuilder builder1 = new org.apache.axis2.databinding.utils.NamedStaxOMBuilder(new org.apache.axis2.util.StreamWrapper(reader), startQname1);
                        object.setExtraElement(builder1.getOMElement());
                        reader.next();
                    } // End of if for expected property start element
                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(UNEXPECTED_SUBELEMENT + reader.getName());
                    }
                    while (isNotStartOrEndElement(reader)) {
                        reader.next();
                    }
                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(UNEXPECTED_SUBELEMENT + reader.getName());
                    }
                } catch (final javax.xml.stream.XMLStreamException e) {
                    throw new javax.xml.stream.XMLStreamException(e);
                }
                return object;
            }

            private static boolean isNotStartOrEndElement(javax.xml.stream.XMLStreamReader reader) {
                return !reader.isStartElement() && !reader.isEndElement();
            }

            private static NfeDadosMsg parsePart1(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                if (reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type") != null) {
                    final java.lang.String fullTypeName = reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.contains(":")) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = nsPrefix == null ? "" : nsPrefix;
                        final java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);
                        if (!NFE_DADOS_MSG.equals(type)) {
                            // find namespace for the prefix
                            final java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (NfeDadosMsg) ExtensionMapper.getTypeObject(nsUri, type, reader);
                        }
                    }
                }
                return null;
            }
        }// end of factory class
    }

    public static class NfeCabecMsgE implements org.apache.axis2.databinding.ADBBean {
        private static final long serialVersionUID = -1490720242895283052L;

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DOWNLOAD_NF, NFE_CABEC_MSG, "");

        /**
         * field for NfeCabecMsg
         */

        protected NfeCabecMsg localNfeCabecMsg;

        /**
         * Auto generated getter method
         *
         * @return NfeCabecMsg
         */
        public NfeCabecMsg getNfeCabecMsg() {
            return this.localNfeCabecMsg;
        }

        /**
         * Auto generated setter method
         *
         * @param param NfeCabecMsg
         */
        public void setNfeCabecMsg(final NfeCabecMsg param) {
            this.localNfeCabecMsg = param;
        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        @Override
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) {
            final org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, NfeCabecMsgE.MY_QNAME);
            return factory.createOMElement(dataSource, NfeCabecMsgE.MY_QNAME);
        }

        @Override
        public void serialize(final javax.xml.namespace.QName parentQName, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            this.serialize(parentQName, xmlWriter, false);
        }

        @Override
        public void serialize(final javax.xml.namespace.QName parentQName, final javax.xml.stream.XMLStreamWriter xmlWriter, final boolean serializeType) throws javax.xml.stream.XMLStreamException {
            // We can safely assume an element has only one type associated with it
            if (this.localNfeCabecMsg == null) {
                throw new org.apache.axis2.databinding.ADBException("nfeCabecMsg cannot be null!");
            }
            this.localNfeCabecMsg.serialize(NfeCabecMsgE.MY_QNAME, xmlWriter);
        }

        private static java.lang.String generatePrefix(final java.lang.String namespace) {
            if (namespace.equals(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DOWNLOAD_NF)) {
                return "";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, final java.lang.String namespace, final java.lang.String localPart, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = NfeCabecMsgE.generatePrefix(namespace);
                }
                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(final java.lang.String prefix, final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                this.registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(final java.lang.String namespace, final java.lang.String attName, final javax.xml.namespace.QName qname, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = this.registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                this.registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(final javax.xml.namespace.QName qname, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = NfeCabecMsgE.generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }
                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(final javax.xml.namespace.QName[] qnames, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                final StringBuilder stringToWrite = new StringBuilder();
                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    String strToWrite = getStringToWrite(qnames[i], xmlWriter);
                    stringToWrite.append(strToWrite);
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        private String getStringToWrite(QName qname, XMLStreamWriter xmlWriter) throws XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            String prefix;
            StringBuilder stringToWrite = new StringBuilder();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = NfeConsultaStub.NfeCabecMsgE.generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }
                if (prefix.trim().length() > 0) {
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
            return stringToWrite.toString();
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(final javax.xml.stream.XMLStreamWriter xmlWriter, final java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = NfeCabecMsgE.generatePrefix(namespace);
                final javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    final java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        @Override
        public javax.xml.stream.XMLStreamReader getPullParser(final javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {
            // We can safely assume an element has only one type associated with it
            return this.localNfeCabecMsg.getPullParser(NfeCabecMsgE.MY_QNAME);
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            private Factory() {
                throw new IllegalStateException(UTILITY_CLASS);
            }

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at its end element If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static NfeCabecMsgE parse(final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                final NfeCabecMsgE object = new NfeCabecMsgE();
                final int event;
                final java.lang.String nillableValue = null;
                final java.lang.String prefix = "";
                final java.lang.String namespaceuri = "";
                try {
                    while (!reader.isStartElement() && !reader.isEndElement()) {
                        reader.next();
                    }
                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    final java.util.ArrayList<String> handledAttributes = new java.util.ArrayList<>();
                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {
                            if (reader.isStartElement() && new javax.xml.namespace.QName(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DOWNLOAD_NF, NFE_CABEC_MSG).equals(reader.getName())) {
                                object.setNfeCabecMsg(NfeCabecMsg.Factory.parse(reader));
                            } // End of if for expected property start element
                            else {
                                // A start element we are not expecting indicates an invalid parameter was passed
                                throw new org.apache.axis2.databinding.ADBException(UNEXPECTED_SUBELEMENT + reader.getName());
                            }
                        } else {
                            reader.next();
                        }
                    } // end of while loop
                } catch (final javax.xml.stream.XMLStreamException e) {
                    throw new javax.xml.stream.XMLStreamException(e);
                }
                return object;
            }
        }// end of factory class
    }

    public static class ExtensionMapper {

        private ExtensionMapper() {
            throw new IllegalStateException(UTILITY_CLASS);
        }

        public static java.lang.Object getTypeObject(final java.lang.String namespaceURI, final java.lang.String typeName, final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            if (WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DOWNLOAD_NF.equals(namespaceURI) && NFE_CABEC_MSG.equals(typeName)) {
                return NfeCabecMsg.Factory.parse(reader);
            }
            throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
        }
    }

    public static class NfeCabecMsg implements org.apache.axis2.databinding.ADBBean {
        private static final long serialVersionUID = -5336928686307679891L;
        /*
         * This type was generated from the piece of schema that had name = nfeCabecMsg Namespace URI = http://www.portalfiscal.inf.br/nfe/wsdl/NfeDownloadNF Namespace Prefix =
         */

        /**
         * field for VersaoDados
         */

        protected java.lang.String localVersaoDados;

        /*
         * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to determine whether to include this field in the serialized XML
         */
        protected boolean localVersaoDadosTracker = false;

        public boolean isVersaoDadosSpecified() {
            return this.localVersaoDadosTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getVersaoDados() {
            return this.localVersaoDados;
        }

        /**
         * Auto generated setter method
         *
         * @param param VersaoDados
         */
        public void setVersaoDados(final java.lang.String param) {
            this.localVersaoDadosTracker = param != null;
            this.localVersaoDados = param;
        }

        /**
         * field for CUF
         */

        protected java.lang.String localCUF;

        /*
         * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to determine whether to include this field in the serialized XML
         */
        protected boolean localCUFTracker = false;

        public boolean isCUFSpecified() {
            return this.localCUFTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getCUF() {
            return this.localCUF;
        }

        /**
         * Auto generated setter method
         *
         * @param param CUF
         */
        public void setCUF(final java.lang.String param) {
            this.localCUFTracker = param != null;
            this.localCUF = param;
        }

        /**
         * field for ExtraAttributes This was an Attribute! This was an Array!
         */

        protected transient org.apache.axiom.om.OMAttribute[] localExtraAttributes;

        /**
         * Auto generated getter method
         *
         * @return org.apache.axiom.om.OMAttribute[]
         */
        public org.apache.axiom.om.OMAttribute[] getExtraAttributes() {
            return this.localExtraAttributes;
        }

        /**
         * validate the array for ExtraAttributes
         */
        protected void validateExtraAttributes(final org.apache.axiom.om.OMAttribute[] param) {
            if ((param != null) && (param.length > 1)) {
                throw new IllegalArgumentException();
            }
            if ((param != null) && (param.length < 1)) {
                throw new IllegalArgumentException();
            }
        }

        /**
         * Auto generated setter method
         *
         * @param param ExtraAttributes
         */
        public void setExtraAttributes(final org.apache.axiom.om.OMAttribute[] param) {
            this.validateExtraAttributes(param);
            this.localExtraAttributes = param;
        }

        /**
         * Auto generated add method for the array for convenience
         *
         * @param param org.apache.axiom.om.OMAttribute
         */
        public void addExtraAttributes(final org.apache.axiom.om.OMAttribute param) {
            if (this.localExtraAttributes == null) {
                this.localExtraAttributes = new org.apache.axiom.om.OMAttribute[]{};
            }
            final java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(this.localExtraAttributes);
            list.add(param);
            this.localExtraAttributes = (org.apache.axiom.om.OMAttribute[]) list.toArray(new OMAttribute[0]);
        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        @Override
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) {
            final org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
            return factory.createOMElement(dataSource, parentQName);
        }

        @Override
        public void serialize(final javax.xml.namespace.QName parentQName, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            this.serialize(parentQName, xmlWriter, false);
        }

        @Override
        public void serialize(final javax.xml.namespace.QName parentQName, final javax.xml.stream.XMLStreamWriter xmlWriter, final boolean serializeType) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix;
            java.lang.String namespace;
            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            this.writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
            if (serializeType) {
                final java.lang.String namespacePrefix = this.registerPrefix(xmlWriter, WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DOWNLOAD_NF);
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    this.writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", namespacePrefix + ":nfeCabecMsg", xmlWriter);
                } else {
                    this.writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", NFE_CABEC_MSG, xmlWriter);
                }
            }
            if (this.localExtraAttributes != null) {
                writeExtraAttributes(xmlWriter, Arrays.asList(this.localExtraAttributes));
            }
            if (this.localVersaoDadosTracker) {
                namespace = WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DOWNLOAD_NF;
                writeElements(xmlWriter, namespace, VERSAO_DADOS, this.localVersaoDados);
            }
            if (this.localCUFTracker) {
                namespace = WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DOWNLOAD_NF;
                writeElements(xmlWriter, namespace, "cUF", this.localCUF);
            }
            xmlWriter.writeEndElement();
        }

        private void writeExtraAttributes(javax.xml.stream.XMLStreamWriter xmlWriter, List<OMAttribute> extraAttributes) throws javax.xml.stream.XMLStreamException {
            for (final OMAttribute localExtraAttribute : extraAttributes) {
                this.writeAttribute(localExtraAttribute.getNamespace().getNamespaceURI(), localExtraAttribute.getLocalName(), localExtraAttribute.getAttributeValue(), xmlWriter);
            }
        }
        private void writeElements(javax.xml.stream.XMLStreamWriter xmlWriter, String namespace, String localName, String value) throws javax.xml.stream.XMLStreamException {
            this.writeStartElement(null, namespace, localName, xmlWriter);
            if (value == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(localName + " cannot be null!!");
            } else {
                xmlWriter.writeCharacters(value);
            }
            xmlWriter.writeEndElement();
        }


        private static java.lang.String generatePrefix(final java.lang.String namespace) {
            if (namespace.equals(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DOWNLOAD_NF)) {
                return "";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, final java.lang.String namespace, final java.lang.String localPart, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = NfeCabecMsg.generatePrefix(namespace);
                }
                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(final java.lang.String prefix, final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                this.registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(final java.lang.String namespace, final java.lang.String attName, final javax.xml.namespace.QName qname, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = this.registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                this.registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(final javax.xml.namespace.QName qname, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = NfeCabecMsg.generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }
                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(final javax.xml.namespace.QName[] qnames, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                final StringBuilder stringToWrite = new StringBuilder();
                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    String strToWrite = getStringToWrite(qnames[i], xmlWriter);
                    stringToWrite.append(strToWrite);
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        private String getStringToWrite(QName qname, XMLStreamWriter xmlWriter) throws XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            String prefix;
            StringBuilder stringToWrite = new StringBuilder();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = NfeConsultaStub.NfeCabecMsgE.generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }
                if (prefix.trim().length() > 0) {
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
            return stringToWrite.toString();
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(final javax.xml.stream.XMLStreamWriter xmlWriter, final java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = NfeCabecMsg.generatePrefix(namespace);
                final javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    final java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        @Override
        public javax.xml.stream.XMLStreamReader getPullParser(final javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {
            final java.util.ArrayList elementList = new java.util.ArrayList();
            final java.util.ArrayList attribList = new java.util.ArrayList();
            if (this.localVersaoDadosTracker) {
                elementList.add(new javax.xml.namespace.QName(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DOWNLOAD_NF, VERSAO_DADOS));
                if (this.localVersaoDados != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localVersaoDados));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("versaoDados cannot be null!!");
                }
            }
            if (this.localCUFTracker) {
                elementList.add(new javax.xml.namespace.QName(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DOWNLOAD_NF, "cUF"));
                if (this.localCUF != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localCUF));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("cUF cannot be null!!");
                }
            }
            for (final OMAttribute localExtraAttribute : this.localExtraAttributes) {
                attribList.add(org.apache.axis2.databinding.utils.Constants.OM_ATTRIBUTE_KEY);
                attribList.add(localExtraAttribute);
            }
            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            private Factory() {
                throw new IllegalStateException(UTILITY_CLASS);
            }

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at its end element If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static NfeCabecMsg parse(final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                NfeCabecMsg object = new NfeCabecMsg();
                final int event;
                java.lang.String nillableValue;
                final java.lang.String prefix = "";
                final java.lang.String namespaceuri = "";
                try {
                    while (isNotStartOrEndElement(reader)) {
                        reader.next();
                    }

                    NfeCabecMsg varParse = parsePart1(reader);
                    if(varParse != null) {
                        return varParse;
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    final java.util.ArrayList<String> handledAttributes = new java.util.ArrayList<>();
                    // now run through all any or extra attributes
                    // which were not reflected until now
                    for (int i = 0; i < reader.getAttributeCount(); i++) {
                        if (!handledAttributes.contains(reader.getAttributeLocalName(i))) {
                            // this is an anyAttribute and we create
                            // an OMAttribute for this
                            final org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();
                            final org.apache.axiom.om.OMAttribute attr = factory.createOMAttribute(reader.getAttributeLocalName(i), factory.createOMNamespace(reader.getAttributeNamespace(i), reader.getAttributePrefix(i)), reader.getAttributeValue(i));
                            // and add it to the extra attributes
                            object.addExtraAttributes(attr);
                        }
                    }
                    reader.next();
                    object = parsePart2(object, reader);
                    object = parsePart3(object, reader);
                    while (isNotStartOrEndElement(reader)) {
                        reader.next();
                    }
                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(UNEXPECTED_SUBELEMENT + reader.getName());
                    }
                } catch (final javax.xml.stream.XMLStreamException e) {
                    throw new javax.xml.stream.XMLStreamException(e);
                }
                return object;
            }

            private static boolean isNotStartOrEndElement(javax.xml.stream.XMLStreamReader reader) {
                return !reader.isStartElement() && !reader.isEndElement();
            }

            private static NfeCabecMsg parsePart1 (javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                if (reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type") != null) {
                    final java.lang.String fullTypeName = reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.contains(":")) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = nsPrefix == null ? "" : nsPrefix;
                        final java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);
                        if (!NFE_CABEC_MSG.equals(type)) {
                            // find namespace for the prefix
                            final java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (NfeCabecMsg) ExtensionMapper.getTypeObject(nsUri, type, reader);
                        }
                    }
                }
                return null;
            }

            private static NfeCabecMsg parsePart2 (NfeCabecMsg object, javax.xml.stream.XMLStreamReader reader) throws XMLStreamException {
                String nillableValue;
                while (isNotStartOrEndElement(reader)) {
                    reader.next();
                }
                if (reader.isStartElement() && new javax.xml.namespace.QName(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DOWNLOAD_NF, VERSAO_DADOS).equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue(XMLSCHEMA_INSTANCE, "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + VERSAO_DADOS + "  cannot be null");
                    }
                    final java.lang.String content = reader.getElementText();
                    object.setVersaoDados(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                    reader.next();
                } // End of if for expected property start element
                return object;
            }

            private static NfeCabecMsg parsePart3 (NfeCabecMsg object, javax.xml.stream.XMLStreamReader reader) throws XMLStreamException {
                String nillableValue;
                while (isNotStartOrEndElement(reader)) {
                    reader.next();
                }
                if (reader.isStartElement() && new javax.xml.namespace.QName(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DOWNLOAD_NF, "cUF").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue(XMLSCHEMA_INSTANCE, "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "cUF" + "  cannot be null");
                    }
                    final java.lang.String content = reader.getElementText();
                    object.setCUF(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                    reader.next();
                } // End of if for expected property start element
                return object;
            }
        }// end of factory class
    }

    public static class NfeDownloadNFResult implements org.apache.axis2.databinding.ADBBean {
        private static final long serialVersionUID = -7391446359804967778L;

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DOWNLOAD_NF, NFE_DOWNLOAD_NF_RESULT, "");

        /**
         * field for ExtraElement
         */

        protected transient org.apache.axiom.om.OMElement localExtraElement;

        /**
         * Auto generated getter method
         *
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getExtraElement() {
            return this.localExtraElement;
        }

        /**
         * Auto generated setter method
         *
         * @param param ExtraElement
         */
        public void setExtraElement(final org.apache.axiom.om.OMElement param) {
            this.localExtraElement = param;
        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        @Override
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) {
            final org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, NfeDownloadNFResult.MY_QNAME);
            return factory.createOMElement(dataSource, NfeDownloadNFResult.MY_QNAME);
        }

        @Override
        public void serialize(final javax.xml.namespace.QName parentQName, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            this.serialize(parentQName, xmlWriter, false);
        }

        @Override
        public void serialize(final javax.xml.namespace.QName parentQName, final javax.xml.stream.XMLStreamWriter xmlWriter, final boolean serializeType) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix;
            java.lang.String namespace;
            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            this.writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
            if (serializeType) {
                final java.lang.String namespacePrefix = this.registerPrefix(xmlWriter, WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DOWNLOAD_NF);
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    this.writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", namespacePrefix + ":nfeDownloadNFResult", xmlWriter);
                } else {
                    this.writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", NFE_DOWNLOAD_NF_RESULT, xmlWriter);
                }
            }
            if (this.localExtraElement != null) {
                this.localExtraElement.serialize(xmlWriter);
            } else {
                throw new org.apache.axis2.databinding.ADBException(EXTRA_ELEMENT_CANNOT_BE_NULL);
            }
            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(final java.lang.String namespace) {
            if (namespace.equals(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DOWNLOAD_NF)) {
                return "";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, final java.lang.String namespace, final java.lang.String localPart, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = NfeDownloadNFResult.generatePrefix(namespace);
                }
                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(final java.lang.String prefix, final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                this.registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(final java.lang.String namespace, final java.lang.String attName, final javax.xml.namespace.QName qname, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = this.registerPrefix(xmlWriter, attributeNamespace);
            }
            java.lang.String attributeValue;
            if (attributePrefix.trim().length() > 0) {
                attributeValue = attributePrefix + ":" + qname.getLocalPart();
            } else {
                attributeValue = qname.getLocalPart();
            }
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attributeValue);
            } else {
                this.registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */

        private void writeQName(final javax.xml.namespace.QName qname, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = NfeDownloadNFResult.generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }
                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(final javax.xml.namespace.QName[] qnames, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                final StringBuilder stringToWrite = new StringBuilder();
                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    String strToWrite = getStringToWrite(qnames[i], xmlWriter);
                    stringToWrite.append(strToWrite);
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }
        }

        private String getStringToWrite(QName qname, XMLStreamWriter xmlWriter) throws XMLStreamException {
            String namespaceURI = qname.getNamespaceURI();
            String prefix;
            StringBuilder stringToWrite = new StringBuilder();
            if (namespaceURI != null) {
                prefix = xmlWriter.getPrefix(namespaceURI);
                if ((prefix == null) || (prefix.length() == 0)) {
                    prefix = NfeConsultaStub.NfeCabecMsgE.generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }
                if (prefix.trim().length() > 0) {
                    stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }
            } else {
                stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
            return stringToWrite.toString();
        }

        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(final javax.xml.stream.XMLStreamWriter xmlWriter, final java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = NfeDownloadNFResult.generatePrefix(namespace);
                final javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    final java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        /**
         * databinding method to get an XML representation of this object
         */
        @Override
        public javax.xml.stream.XMLStreamReader getPullParser(final javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {
            final java.util.ArrayList elementList = new java.util.ArrayList();
            final java.util.ArrayList attribList = new java.util.ArrayList();
            if (this.localExtraElement != null) {
                elementList.add(org.apache.axis2.databinding.utils.Constants.OM_ELEMENT_KEY);
                elementList.add(this.localExtraElement);
            } else {
                throw new org.apache.axis2.databinding.ADBException(EXTRA_ELEMENT_CANNOT_BE_NULL);
            }
            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
        }

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            private Factory() {
                throw new IllegalStateException(UTILITY_CLASS);
            }

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at its end element If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static NfeDownloadNFResult parse(final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                final NfeDownloadNFResult object = new NfeDownloadNFResult();
                final int event;
                final java.lang.String nillableValue = null;
                final java.lang.String prefix = "";
                final java.lang.String namespaceuri = "";
                try {
                    while (isNotStartOrEndElement(reader)) {
                        reader.next();
                    }
                    NfeDownloadNFResult varParse = parsePart1(reader);
                    if(varParse != null) {
                        return varParse;
                    }
                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    final java.util.ArrayList<String> handledAttributes = new java.util.ArrayList<>();
                    reader.next();
                    while (isNotStartOrEndElement(reader)) {
                        reader.next();
                    }
                    if (reader.isStartElement()) {
                        // use the QName from the parser as the name for the builder
                        final javax.xml.namespace.QName startQname1 = reader.getName();
                        // We need to wrap the reader so that it produces a fake START_DOCUMENT event
                        // this is needed by the builder classes
                        final org.apache.axis2.databinding.utils.NamedStaxOMBuilder builder1 = new org.apache.axis2.databinding.utils.NamedStaxOMBuilder(new org.apache.axis2.util.StreamWrapper(reader), startQname1);
                        object.setExtraElement(builder1.getOMElement());
                        reader.next();
                    } // End of if for expected property start element
                    else {
                        // A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(UNEXPECTED_SUBELEMENT + reader.getName());
                    }
                    while (isNotStartOrEndElement(reader)) {
                        reader.next();
                    }
                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(UNEXPECTED_SUBELEMENT + reader.getName());
                    }
                } catch (final javax.xml.stream.XMLStreamException e) {
                    throw new javax.xml.stream.XMLStreamException(e);
                }
                return object;
            }

            private static boolean isNotStartOrEndElement(javax.xml.stream.XMLStreamReader reader) {
                return !reader.isStartElement() && !reader.isEndElement();
            }

            private static NfeDownloadNFResult parsePart1(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                if (reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type") != null) {
                    final java.lang.String fullTypeName = reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.contains(":")) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = nsPrefix == null ? "" : nsPrefix;
                        final java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);
                        if (!NFE_DOWNLOAD_NF_RESULT.equals(type)) {
                            // find namespace for the prefix
                            final java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (NfeDownloadNFResult) ExtensionMapper.getTypeObject(nsUri, type, reader);
                        }
                    }
                }
                return null;
            }
        }// end of factory class
    }

    private org.apache.axiom.om.OMElement toOM(final com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeDadosMsg param) {
            return param.getOMElement(com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeDadosMsg.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    }

    private org.apache.axiom.om.OMElement toOM(final com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeDownloadNFResult param) {
            return param.getOMElement(com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeDownloadNFResult.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    }

    private org.apache.axiom.om.OMElement toOM(final com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeCabecMsgE param) {
            return param.getOMElement(com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeCabecMsgE.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(final org.apache.axiom.soap.SOAPFactory factory, final com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeDadosMsg param) {
            final org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeDadosMsg.MY_QNAME, factory));
            return emptyEnvelope;
    }

    /* methods to provide back word compatibility */

    /**
     * get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(final org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(final org.apache.axiom.om.OMElement param, final java.lang.Class type) throws org.apache.axis2.AxisFault {
        try {
            if (com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeDadosMsg.class.equals(type)) {
                return com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeDadosMsg.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
            if (com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeDownloadNFResult.class.equals(type)) {
                return com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeDownloadNFResult.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
            if (com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeCabecMsgE.class.equals(type)) {
                return com.fincatto.documentofiscal.nfe310.webservices.downloadnf.NfeDownloadNFStub.NfeCabecMsgE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (final java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
    }
}
