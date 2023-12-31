/*
  NfeConsultaStub.java This file was auto-generated from WSDL by the Apache Axis2 version: 1.7.4 Built on : Oct 21, 2016 (10:47:34 BST)
 */
package com.fincatto.documentofiscal.nfe310.webservices.nota.consulta;

import org.apache.axiom.om.OMAttribute;
import org.apache.axis2.client.Stub;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import com.fincatto.documentofiscal.DFConfig;
import com.fincatto.documentofiscal.utils.MessageContextFactory;

/*
 * NfeConsultaStub java implementation
 */
@SuppressWarnings({"rawtypes", "unchecked", "deprecation", "unused"})
public class NfeConsultaStub extends org.apache.axis2.client.Stub {

    private static final String UTILITY_CLASS = "Utility class";
    public static final String VERSAO_DADOS = "versaoDados";
    public static final String NFE_CABEC_MSG = "nfeCabecMsg";
    public static final String UNEXPECTED_SUBELEMENT = "Unexpected subelement ";
    public static final String EXTRA_ELEMENT_CANNOT_BE_NULL = "extraElement cannot be null!!";
    public static final String ORG_2001_XMLSCHEMA_INSTANCE = "http://www.w3.org/2001/XMLSchema-instance";
    public static final String NFE_CONSULTA_NF_RESULT = "nfeConsultaNFResult";
    public static final String NFE_CONSULTA_NF = "nfeConsultaNF";
    public static final String WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_CONSULTA = "http://www.portalfiscal.inf.br/nfe/wsdl/NfeConsulta";
    public static final String NFE_DADOS_MSG = "nfeDadosMsg";
    private static int counter = 0;
    protected org.apache.axis2.description.AxisOperation[] operations;

    // hashmaps to keep the fault mapping
    private final java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private final java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private final java.util.HashMap faultMessageMap = new java.util.HashMap();
    private static final javax.xml.namespace.QName[] opNameArray = null;
    private final DFConfig config;

    /**
     * Constructor that takes in a configContext
     */
    public NfeConsultaStub(final org.apache.axis2.context.ConfigurationContext configurationContext, final java.lang.String targetEndpoint, DFConfig config) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false, config);
    }

    /**
     * Constructor that takes in a configContext and useseperate listner
     */
    public NfeConsultaStub(final org.apache.axis2.context.ConfigurationContext configurationContext, final java.lang.String targetEndpoint, final boolean useSeparateListener, DFConfig config) throws org.apache.axis2.AxisFault {
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
    public NfeConsultaStub(final java.lang.String targetEndpoint, DFConfig config) throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint, config);
    }

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (NfeConsultaStub.counter > 99999) {
            NfeConsultaStub.counter = 0;
        }
        NfeConsultaStub.counter = NfeConsultaStub.counter + 1;
        return System.currentTimeMillis() + "_" + NfeConsultaStub.counter;
    }

    private void populateAxisService() {
        // creating the Service with a unique name
        this._service = new org.apache.axis2.description.AxisService("NfeConsulta" + NfeConsultaStub.getUniqueSuffix());
        this.addAnonymousOperations();
        // creating the operations
        org.apache.axis2.description.AxisOperation operation;
        this.operations = new org.apache.axis2.description.AxisOperation[1];
        operation = new org.apache.axis2.description.OutInAxisOperation();
        operation.setName(new javax.xml.namespace.QName(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_CONSULTA, NFE_CONSULTA_NF));
        this._service.addOperation(operation);
        this.operations[0] = operation;
    }

    // populates the faults
    private void populateFaults() {
        // Empty Method
    }

    /**
     * Auto generated method signature Serviço destinado à consulta da NF-e.
     *
     * @param nfeDadosMsg0
     * @param nfeCabecMsg1
     */
    public com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub.NfeConsultaNFResult nfeConsultaNF(final com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub.NfeDadosMsg nfeDadosMsg0, final com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub.NfeCabecMsgE nfeCabecMsg1) throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext messageContext = null;
        try {
            final org.apache.axis2.client.OperationClient operationClient = this._serviceClient.createClient(this.operations[0].getName());
            operationClient.getOptions().setAction("http://www.portalfiscal.inf.br/nfe/wsdl/NfeConsulta/nfeConsultaNF");
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
            final java.lang.Object object = this.fromOM(returnEnv.getBody().getFirstElement(), com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub.NfeConsultaNFResult.class);
            return (com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub.NfeConsultaNFResult) object;
        } catch (final org.apache.axis2.AxisFault f) {
            final org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (this.faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), NFE_CONSULTA_NF))) {
                    // make the fault by reflection
                    try {
                        final java.lang.String exceptionClassName = (java.lang.String) this.faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), NFE_CONSULTA_NF));
                        final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        final java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        // message class
                        final java.lang.String messageClassName = (java.lang.String) this.faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), NFE_CONSULTA_NF));
                        final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        final java.lang.Object messageObject = this.fromOM(faultElt, messageClass);
                        final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
                        m.invoke(ex, messageObject);
                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (final ClassCastException | InstantiationException | IllegalAccessException | java.lang.reflect.InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if(messageContext != null && messageContext.getTransportOut() != null) {
                messageContext.getTransportOut().getSender().cleanup(messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations Serviço destinado à consulta da NF-e.
     *
     * @param nfeDadosMsg0
     * @param nfeCabecMsg1
     */
    public void startnfeConsultaNF(final com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub.NfeDadosMsg nfeDadosMsg0, final com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub.NfeCabecMsgE nfeCabecMsg1, final com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaCallbackHandler callback) throws java.rmi.RemoteException {
        final org.apache.axis2.client.OperationClient operationClient = this._serviceClient.createClient(this.operations[0].getName());
        operationClient.getOptions().setAction("http://www.portalfiscal.inf.br/nfe/wsdl/NfeConsulta/nfeConsultaNF");
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
        if ((this.operations[0].getMessageReceiver() == null) && operationClient.getOptions().isUseSeparateListener()) {
            callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            this.operations[0].setMessageReceiver(callbackReceiver);
        }
        // execute the operation client
        operationClient.execute(false);
    }

    private org.apache.axis2.client.async.AxisCallback createCallback(com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaCallbackHandler callback, org.apache.axis2.context.MessageContext messageContext) {
        return new org.apache.axis2.client.async.AxisCallback() {
            @Override
            public void onMessage(final org.apache.axis2.context.MessageContext resultContext) {
                try {
                    final org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();
                    final java.lang.Object object = NfeConsultaStub.this.fromOM(resultEnv.getBody().getFirstElement(), com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub.NfeConsultaNFResult.class);
                    callback.receiveResultnfeConsultaNF((com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub.NfeConsultaNFResult) object);
                } catch (final org.apache.axis2.AxisFault e) {
                    callback.receiveErrornfeConsultaNF(e);
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
                    callback.receiveErrornfeConsultaNF(axisFault);
                }
            }
        };
    }

    private void callbackError(java.lang.Exception error, com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaCallbackHandler callback) {
        if (error instanceof org.apache.axis2.AxisFault) {
            final org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
            final org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (NfeConsultaStub.this.faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), NFE_CONSULTA_NF))) {
                    // make the fault by reflection
                    try {
                        final java.lang.String exceptionClassName = (java.lang.String) NfeConsultaStub.this.faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), NFE_CONSULTA_NF));
                        final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        final java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        // message class
                        final java.lang.String messageClassName = (java.lang.String) NfeConsultaStub.this.faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), NFE_CONSULTA_NF));
                        final java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        final java.lang.Object messageObject = NfeConsultaStub.this.fromOM(faultElt, messageClass);
                        final java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
                        m.invoke(ex, messageObject);
                        callback.receiveErrornfeConsultaNF(new java.rmi.RemoteException(ex.getMessage(), ex));
                    } catch (final ClassCastException | org.apache.axis2.AxisFault | InstantiationException | IllegalAccessException | java.lang.reflect.InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        callback.receiveErrornfeConsultaNF(f);
                    }
                } else {
                    callback.receiveErrornfeConsultaNF(f);
                }
            } else {
                callback.receiveErrornfeConsultaNF(f);
            }
        } else {
            callback.receiveErrornfeConsultaNF(error);
        }
    }

    private boolean optimizeContent(final javax.xml.namespace.QName opName) {
        for (final QName element : opNameArray) {
            if (opName.equals(element)) {
                return true;
            }
        }
        return false;
    }

    private org.apache.axiom.om.OMElement toOM(final com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub.NfeDadosMsg param) {
        return param.getOMElement(com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub.NfeDadosMsg.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    }

    private org.apache.axiom.om.OMElement toOM(final com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub.NfeConsultaNFResult param) {
        return param.getOMElement(com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub.NfeConsultaNFResult.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    }

    private org.apache.axiom.om.OMElement toOM(final com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub.NfeCabecMsgE param) {
        return param.getOMElement(com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub.NfeCabecMsgE.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(final org.apache.axiom.soap.SOAPFactory factory, final com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub.NfeDadosMsg param) {
        final org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
        emptyEnvelope.getBody().addChild(param.getOMElement(com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub.NfeDadosMsg.MY_QNAME, factory));
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
            if (com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub.NfeCabecMsgE.class.equals(type)) {
                return com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub.NfeCabecMsgE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
            if (com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub.NfeConsultaNFResult.class.equals(type)) {
                return com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub.NfeConsultaNFResult.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
            if (com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub.NfeDadosMsg.class.equals(type)) {
                return com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub.NfeDadosMsg.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (final java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
    }

    // https://nfe.sefaz.ba.gov.br/webservices/NfeConsulta/NfeConsulta.asmx
    public static class NfeConsultaNFResult implements org.apache.axis2.databinding.ADBBean {
        private static final long serialVersionUID = 2729727702061603854L;

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_CONSULTA, NFE_CONSULTA_NF_RESULT, "ns1");

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
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this, NfeConsultaNFResult.MY_QNAME));
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
                final java.lang.String namespacePrefix = this.registerPrefix(xmlWriter, WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_CONSULTA);
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    this.writeAttribute("xsi", ORG_2001_XMLSCHEMA_INSTANCE, "type", namespacePrefix + ":nfeConsultaNFResult", xmlWriter);
                } else {
                    this.writeAttribute("xsi", ORG_2001_XMLSCHEMA_INSTANCE, "type", NFE_CONSULTA_NF_RESULT, xmlWriter);
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
            if (namespace.equals(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_CONSULTA)) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, final java.lang.String namespace, final java.lang.String localPart, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = NfeConsultaNFResult.generatePrefix(namespace);
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
            final java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(this.registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
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
                xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
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
                    prefix = NfeConsultaNFResult.generatePrefix(namespaceURI);
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
                    prefix = NfeCabecMsgE.generatePrefix(namespaceURI);
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
                prefix = NfeConsultaNFResult.generatePrefix(namespace);
                final javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    final java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

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

            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at its end element If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static NfeConsultaNFResult parse(final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                final NfeConsultaNFResult object = new NfeConsultaNFResult();
                final int event;
                javax.xml.namespace.QName currentQName = null;
                final java.lang.String nillableValue = null;
                final java.lang.String prefix = "";
                final java.lang.String namespaceuri = "";
                try {
                    while (isNotStartOrEndElement(reader)) {
                        reader.next();
                    }
                    currentQName = reader.getName();
                    NfeConsultaNFResult varParse = parsePart1(reader);
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
                        // 1 - A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(UNEXPECTED_SUBELEMENT + reader.getName());
                    }
                    while (isNotStartOrEndElement(reader)) {
                        reader.next();
                    }
                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
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

            private static NfeConsultaNFResult parsePart1(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                if (reader.getAttributeValue(ORG_2001_XMLSCHEMA_INSTANCE, "type") != null) {
                    final java.lang.String fullTypeName = reader.getAttributeValue(ORG_2001_XMLSCHEMA_INSTANCE, "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.contains(":")) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;
                        final java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);
                        if (!NFE_CONSULTA_NF_RESULT.equals(type)) {
                            // find namespace for the prefix
                            final java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (NfeConsultaNFResult) ExtensionMapper.getTypeObject(nsUri, type, reader);
                        }
                    }
                }
                return null;
            }
        } // end of factory class
    }

    public static class NfeCabecMsg implements org.apache.axis2.databinding.ADBBean {
        private static final long serialVersionUID = -1918082550536352073L;
        /*
         * This type was generated from the piece of schema that had name = nfeCabecMsg Namespace URI = http://www.portalfiscal.inf.br/nfe/wsdl/NfeConsulta Namespace Prefix = ns1
         */
        /**
         * field for VersaoDados
         */
        protected java.lang.String localVersaoDados;

        /*
         * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to determine whether to include this field in the serialized XML
         */
        protected boolean localVersaoDadosTracker = false;

        /**
         * field for CUF
         */
        protected java.lang.String localCUF;

        /*
         * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to determine whether to include this field in the serialized XML
         */
        protected boolean localCUFTracker = false;

        /**
         * field for ExtraAttributes This was an Attribute! This was an Array!
         */
        protected transient org.apache.axiom.om.OMAttribute[] localExtraAttributes;

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
                throw new IllegalArgumentException("Input values do not follow defined XSD restrictions");
            }
            if ((param != null) && (param.length < 1)) {
                throw new IllegalArgumentException("Input values do not follow defined XSD restrictions");
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
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
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
                final java.lang.String namespacePrefix = this.registerPrefix(xmlWriter, WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_CONSULTA);
                serializeCheckPrefix(namespacePrefix, xmlWriter);
            }
            if (this.localExtraAttributes != null) {
                for (final OMAttribute localExtraAttribute : this.localExtraAttributes) {
                    this.writeAttribute(localExtraAttribute.getNamespace().getName(), localExtraAttribute.getLocalName(), localExtraAttribute.getAttributeValue(), xmlWriter);
                }
            }
            if (this.localVersaoDadosTracker) {
                namespace = WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_CONSULTA;
                this.writeStartElement(null, namespace, VERSAO_DADOS, xmlWriter);
                if (this.localVersaoDados == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException("versaoDados cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(this.localVersaoDados);
                }
                xmlWriter.writeEndElement();
            }
            if (this.localCUFTracker) {
                namespace = WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_CONSULTA;
                this.writeStartElement(null, namespace, "cUF", xmlWriter);
                if (this.localCUF == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException("cUF cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(this.localCUF);
                }
                xmlWriter.writeEndElement();
            }
            xmlWriter.writeEndElement();
        }

        private void serializeCheckPrefix(final java.lang.String namespacePrefix, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                this.writeAttribute("xsi", ORG_2001_XMLSCHEMA_INSTANCE, "type", namespacePrefix + ":nfeCabecMsg", xmlWriter);
            } else {
                this.writeAttribute("xsi", ORG_2001_XMLSCHEMA_INSTANCE, "type", NFE_CABEC_MSG, xmlWriter);
            }
        }

        private static java.lang.String generatePrefix(final java.lang.String namespace) {
            if (namespace.equals(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_CONSULTA)) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, final java.lang.String namespace, final java.lang.String localPart, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
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
            final java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(this.registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
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
                xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
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
                    prefix = NfeCabecMsgE.generatePrefix(namespaceURI);
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
                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

        @Override
        public javax.xml.stream.XMLStreamReader getPullParser(final javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {
            final java.util.ArrayList elementList = new java.util.ArrayList();
            final java.util.ArrayList attribList = new java.util.ArrayList();
            if (this.localCUFTracker) {
                elementList.add(new javax.xml.namespace.QName(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_CONSULTA, "cUF"));
                if (this.localCUF != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localCUF));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("cUF cannot be null!!");
                }
            }
            if (this.localVersaoDadosTracker) {
                elementList.add(new javax.xml.namespace.QName(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_CONSULTA, VERSAO_DADOS));
                if (this.localVersaoDados != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localVersaoDados));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("versaoDados cannot be null!!");
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

            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at its end element If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static NfeCabecMsg parse(final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                NfeCabecMsg object = new NfeCabecMsg();
                final int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue;
                final java.lang.String prefix = "";
                final java.lang.String namespaceuri = "";
                try {
                    while (isNotStartOrEndElement(reader)) {
                        reader.next();
                    }
                    currentQName = reader.getName();
                    
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
                        // 2 - A start element we are not expecting indicates a trailing invalid property
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

            private static NfeCabecMsg parsePart1(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                if (reader.getAttributeValue(ORG_2001_XMLSCHEMA_INSTANCE, "type") != null) {
                    final java.lang.String fullTypeName = reader.getAttributeValue(ORG_2001_XMLSCHEMA_INSTANCE, "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.contains(":")) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;
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

            private static NfeCabecMsg parsePart2(NfeCabecMsg object, javax.xml.stream.XMLStreamReader reader) throws XMLStreamException {
                java.lang.String nillableValue;
                while (isNotStartOrEndElement(reader)) {
                    reader.next();
                }
                if ((reader.isStartElement() && new javax.xml.namespace.QName(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_CONSULTA, VERSAO_DADOS).equals(reader.getName())) || new javax.xml.namespace.QName("", VERSAO_DADOS).equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue(ORG_2001_XMLSCHEMA_INSTANCE, "nil");
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
                java.lang.String nillableValue;
                while (isNotStartOrEndElement(reader)) {
                    reader.next();
                }
                if ((reader.isStartElement() && new javax.xml.namespace.QName(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_CONSULTA, "cUF").equals(reader.getName())) || new javax.xml.namespace.QName("", "cUF").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue(ORG_2001_XMLSCHEMA_INSTANCE, "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "cUF" + "  cannot be null");
                    }
                    final java.lang.String content = reader.getElementText();
                    object.setCUF(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                    reader.next();
                } // End of if for expected property start element
                return object;
            }
        } // end of factory class
    }

    public static class ExtensionMapper {

        private ExtensionMapper() {
            throw new IllegalStateException(UTILITY_CLASS);
        }

        public static java.lang.Object getTypeObject(final java.lang.String namespaceURI, final java.lang.String typeName, final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            if (WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_CONSULTA.equals(namespaceURI) && NFE_CABEC_MSG.equals(typeName)) {
                return NfeCabecMsg.Factory.parse(reader);
            }
            throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
        }
    }

    public static class NfeDadosMsg implements org.apache.axis2.databinding.ADBBean {
        private static final long serialVersionUID = 1705520115890695657L;

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_CONSULTA, NFE_DADOS_MSG, "ns1");

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
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this, NfeDadosMsg.MY_QNAME));
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
                final java.lang.String namespacePrefix = this.registerPrefix(xmlWriter, WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_CONSULTA);
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    this.writeAttribute("xsi", ORG_2001_XMLSCHEMA_INSTANCE, "type", namespacePrefix + ":nfeDadosMsg", xmlWriter);
                } else {
                    this.writeAttribute("xsi", ORG_2001_XMLSCHEMA_INSTANCE, "type", NFE_DADOS_MSG, xmlWriter);
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
            if (namespace.equals(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_CONSULTA)) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, final java.lang.String namespace, final java.lang.String localPart, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
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
            final java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(this.registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
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
                xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
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
                    prefix = NfeCabecMsgE.generatePrefix(namespaceURI);
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
                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

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

            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at its end element If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static NfeDadosMsg parse(final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                final NfeDadosMsg object = new NfeDadosMsg();
                final int event;
                javax.xml.namespace.QName currentQName = null;
                final java.lang.String nillableValue = null;
                final java.lang.String prefix = "";
                final java.lang.String namespaceuri = "";
                try {
                    while (isNotStartOrEndElement(reader)) {
                        reader.next();
                    }
                    currentQName = reader.getName();
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
                        // 1 - A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(UNEXPECTED_SUBELEMENT + reader.getName());
                    }
                    while (isNotStartOrEndElement(reader)) {
                        reader.next();
                    }
                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
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
                if (reader.getAttributeValue(ORG_2001_XMLSCHEMA_INSTANCE, "type") != null) {
                    final java.lang.String fullTypeName = reader.getAttributeValue(ORG_2001_XMLSCHEMA_INSTANCE, "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.contains(":")) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;
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
        } // end of factory class
    }

    public static class NfeCabecMsgE implements org.apache.axis2.databinding.ADBBean {
        private static final long serialVersionUID = -2890786547466882892L;

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_CONSULTA, NFE_CABEC_MSG, "ns1");

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
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this, NfeCabecMsgE.MY_QNAME));
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

        public static java.lang.String generatePrefix(final java.lang.String namespace) {
            if (namespace.equals(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_CONSULTA)) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, final java.lang.String namespace, final java.lang.String localPart, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
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
            final java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(this.registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
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
                xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
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
                    prefix = NfeCabecMsgE.generatePrefix(namespaceURI);
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
                    if ((uri == null) || (uri.length() == 0)) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }

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
            
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at its end element If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static NfeCabecMsgE parse(final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                final NfeCabecMsgE object = new NfeCabecMsgE();
                final int event;
                javax.xml.namespace.QName currentQName = null;
                final java.lang.String nillableValue = null;
                final java.lang.String prefix = "";
                final java.lang.String namespaceuri = "";
                try {
                    while (!reader.isStartElement() && !reader.isEndElement()) {
                        reader.next();
                    }
                    currentQName = reader.getName();
                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    final java.util.ArrayList<String> handledAttributes = new java.util.ArrayList<>();
                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {
                            if ((reader.isStartElement() && new javax.xml.namespace.QName(WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_CONSULTA, NFE_CABEC_MSG).equals(reader.getName())) || new javax.xml.namespace.QName("", NFE_CABEC_MSG).equals(reader.getName())) {
                                object.setNfeCabecMsg(NfeCabecMsg.Factory.parse(reader));
                            } // End of if for expected property start element
                            else {
                                // 3 - A start element we are not expecting indicates an invalid parameter was passed
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
        } // end of factory class
    }
}
