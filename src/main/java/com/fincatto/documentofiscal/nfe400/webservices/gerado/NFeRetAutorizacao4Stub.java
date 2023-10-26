package com.fincatto.documentofiscal.nfe400.webservices.gerado;

import org.apache.axis2.client.Stub;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import com.fincatto.documentofiscal.DFConfig;
import com.fincatto.documentofiscal.utils.MessageContextFactory;
import org.apache.axis2.databinding.ADBException;

/*
 * NFeRetAutorizacao4Stub java implementation
 */
public class NFeRetAutorizacao4Stub extends org.apache.axis2.client.Stub {

    private static final String UNEXPECTED_SUBELEMENT = "Unexpected subelement ";
    private static final String HTTP_WWW_W3_ORG_2001_XML_SCHEMA_INSTANCE = "http://www.w3.org/2001/XMLSchema-instance";
    private static final String UTILITY_CLASS = "Utility class";
    private static final String NFE_RET_AUTORIZACAO_LOTE = "nfeRetAutorizacaoLote";
    private static final String HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_N_FE_RET_AUTORIZACAO4 = "http://www.portalfiscal.inf.br/nfe/wsdl/NFeRetAutorizacao4";
    public static final String NFE_RESULT_MSG = "nfeResultMsg";
    private static int counter = 0;
    protected org.apache.axis2.description.AxisOperation[] operations;

    // hashmaps to keep the fault mapping
    @SuppressWarnings("rawtypes")
    private final java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    @SuppressWarnings("rawtypes")
    private final java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    @SuppressWarnings("rawtypes")
    private final java.util.HashMap faultMessageMap = new java.util.HashMap();
    private final DFConfig config;

    /**
     * Constructor that takes in a configContext
     */
    public NFeRetAutorizacao4Stub(final org.apache.axis2.context.ConfigurationContext configurationContext, final java.lang.String targetEndpoint, DFConfig config) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false, config);
    }

    /**
     * Constructor that takes in a configContext and useseperate listner
     */
    public NFeRetAutorizacao4Stub(final org.apache.axis2.context.ConfigurationContext configurationContext, final java.lang.String targetEndpoint, final boolean useSeparateListener, DFConfig config) throws org.apache.axis2.AxisFault {
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
    public NFeRetAutorizacao4Stub(final java.lang.String targetEndpoint, DFConfig config) throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint, config);
    }

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (NFeRetAutorizacao4Stub.counter > 99999) {
            NFeRetAutorizacao4Stub.counter = 0;
        }
        NFeRetAutorizacao4Stub.counter = NFeRetAutorizacao4Stub.counter + 1;
        return System.currentTimeMillis() + "_" + NFeRetAutorizacao4Stub.counter;
    }

    private void populateAxisService() {
        // creating the Service with a unique name
        this._service = new org.apache.axis2.description.AxisService("NFeRetAutorizacao4" + NFeRetAutorizacao4Stub.getUniqueSuffix());
        this.addAnonymousOperations();
        // creating the operations
        org.apache.axis2.description.AxisOperation operation;
        this.operations = new org.apache.axis2.description.AxisOperation[1];
        operation = new org.apache.axis2.description.OutInAxisOperation();
        operation.setName(new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_N_FE_RET_AUTORIZACAO4, NFE_RET_AUTORIZACAO_LOTE));
        this._service.addOperation(operation);
        this.operations[0] = operation;
    }

    // populates the faults
    private void populateFaults() {
        //Empty Method
    }

    /**
     * Auto generated method signature
     *
     * @param nfeDadosMsg0
     */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public NfeResultMsg nfeRetAutorizacaoLote(final NfeDadosMsg nfeDadosMsg0) throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext messageContext = null;
        try {
            final org.apache.axis2.client.OperationClient operationClient = this._serviceClient.createClient(this.operations[0].getName());
            operationClient.getOptions().setAction("http://www.portalfiscal.inf.br/nfe/wsdl/NFeRetAutorizacao4/nfeRetAutorizacaoLote");
            operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);
            this.addPropertyToOperationClient(operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");
            // create a message context
            messageContext = MessageContextFactory.INSTANCE.create(config);
            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env;
            env = this.toEnvelope(Stub.getFactory(operationClient.getOptions().getSoapVersionURI()), nfeDadosMsg0);
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
            final java.lang.Object object = this.fromOM(returnEnv.getBody().getFirstElement(), NfeResultMsg.class);
            return (NfeResultMsg) object;
        } catch (final org.apache.axis2.AxisFault f) {
            final org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (this.faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), NFE_RET_AUTORIZACAO_LOTE))) {
                    // make the fault by reflection
                    try {
                        final java.lang.String exceptionClassName = (java.lang.String) this.faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), NFE_RET_AUTORIZACAO_LOTE));
                        final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        final java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        // message class
                        final java.lang.String messageClassName = (java.lang.String) this.faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), NFE_RET_AUTORIZACAO_LOTE));
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

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(final org.apache.axiom.soap.SOAPFactory factory, final NfeDadosMsg param) {
        final org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
        emptyEnvelope.getBody().addChild(param.getOMElement(NfeDadosMsg.MY_QNAME, factory));
        return emptyEnvelope;
    }

    @SuppressWarnings("rawtypes")
    private java.lang.Object fromOM(final org.apache.axiom.om.OMElement param, final java.lang.Class type) throws org.apache.axis2.AxisFault {
        try {
            if (NfeDadosMsg.class.equals(type)) {
                return NfeDadosMsg.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
            if (NfeResultMsg.class.equals(type)) {
                return NfeResultMsg.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (final java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
    }

    public static class ExtensionMapper {

        private ExtensionMapper() {
            throw new IllegalStateException(UTILITY_CLASS);
        }
        public static java.lang.Object getTypeObject(final java.lang.String namespaceURI, final java.lang.String typeName, final javax.xml.stream.XMLStreamReader reader) throws ADBException {
            throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
        }
    }

    @SuppressWarnings("serial")
    public static class NfeDadosMsg implements org.apache.axis2.databinding.ADBBean {

        private static final String NFE_DADOS_MSG = "nfeDadosMsg";

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_N_FE_RET_AUTORIZACAO4, NFE_DADOS_MSG, "ns1");

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
                final java.lang.String namespacePrefix = this.registerPrefix(xmlWriter, HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_N_FE_RET_AUTORIZACAO4);
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    this.writeAttribute("xsi", HTTP_WWW_W3_ORG_2001_XML_SCHEMA_INSTANCE, "type", namespacePrefix + ":nfeDadosMsg", xmlWriter);
                } else {
                    this.writeAttribute("xsi", HTTP_WWW_W3_ORG_2001_XML_SCHEMA_INSTANCE, "type", NFE_DADOS_MSG, xmlWriter);
                }
            }
            if (this.localExtraElement != null) {
                this.localExtraElement.serialize(xmlWriter);
            } else {
                throw new org.apache.axis2.databinding.ADBException("extraElement cannot be null!!");
            }
            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(final java.lang.String namespace) {
            if (namespace.equals(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_N_FE_RET_AUTORIZACAO4)) {
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

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {

            private Factory() {
                throw new IllegalStateException(UTILITY_CLASS);
            }
            @SuppressWarnings("unused")
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at its end element If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            @SuppressWarnings({"unused", "rawtypes"})
            public static NfeDadosMsg parse(final javax.xml.stream.XMLStreamReader reader) throws XMLStreamException {
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

            private static NfeDadosMsg parsePart1(javax.xml.stream.XMLStreamReader reader) throws XMLStreamException {
                if (reader.getAttributeValue(HTTP_WWW_W3_ORG_2001_XML_SCHEMA_INSTANCE, "type") != null) {
                    final java.lang.String fullTypeName = reader.getAttributeValue(HTTP_WWW_W3_ORG_2001_XML_SCHEMA_INSTANCE, "type");
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

        @Override
        public XMLStreamReader getPullParser(final QName arg0) {
            return null;
        }
    }

    @SuppressWarnings("serial")
    public static class NfeResultMsg implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_N_FE_RET_AUTORIZACAO4, NFE_RESULT_MSG, "ns1");

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
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this, NfeResultMsg.MY_QNAME));
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
                final java.lang.String namespacePrefix = this.registerPrefix(xmlWriter, HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_N_FE_RET_AUTORIZACAO4);
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    this.writeAttribute("xsi", HTTP_WWW_W3_ORG_2001_XML_SCHEMA_INSTANCE, "type", namespacePrefix + ":nfeResultMsg", xmlWriter);
                } else {
                    this.writeAttribute("xsi", HTTP_WWW_W3_ORG_2001_XML_SCHEMA_INSTANCE, "type", NFE_RESULT_MSG, xmlWriter);
                }
            }
            if (this.localExtraElement != null) {
                this.localExtraElement.serialize(xmlWriter);
            } else {
                throw new org.apache.axis2.databinding.ADBException("extraElement cannot be null!!");
            }
            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(final java.lang.String namespace) {
            if (namespace.equals(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_N_FE_RET_AUTORIZACAO4)) {
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
                    prefix = NfeResultMsg.generatePrefix(namespace);
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
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(final javax.xml.stream.XMLStreamWriter xmlWriter, final java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = NfeResultMsg.generatePrefix(namespace);
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

        /**
         * Factory class that keeps the parse method
         */
        public static class Factory {
            private Factory() {
                throw new IllegalStateException(UTILITY_CLASS);
            }
            @SuppressWarnings("unused")
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object Precondition: If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable If this object is not an element, it is a complex type and the reader is at the event just after the outer start element Postcondition: If this object is an element, the reader is positioned at its end element If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            @SuppressWarnings({"unused", "rawtypes"})
            public static NfeResultMsg parse(final javax.xml.stream.XMLStreamReader reader) throws XMLStreamException {
                final NfeResultMsg object = new NfeResultMsg();
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
                    nillableValue = reader.getAttributeValue(HTTP_WWW_W3_ORG_2001_XML_SCHEMA_INSTANCE, "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        // Skip the element and report the null value. It cannot have subelements.
                        while (!reader.isEndElement()) {
                            reader.next();
                        }
                        return null;
                    }
                    NfeResultMsg varParse = parsePart1(reader);
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

            private static NfeResultMsg parsePart1(javax.xml.stream.XMLStreamReader reader) throws ADBException {
                if (reader.getAttributeValue(HTTP_WWW_W3_ORG_2001_XML_SCHEMA_INSTANCE, "type") != null) {
                    final java.lang.String fullTypeName = reader.getAttributeValue(HTTP_WWW_W3_ORG_2001_XML_SCHEMA_INSTANCE, "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.contains(":")) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;
                        final java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);
                        if (!NFE_RESULT_MSG.equals(type)) {
                            // find namespace for the prefix
                            final java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (NfeResultMsg) ExtensionMapper.getTypeObject(nsUri, type, reader);
                        }
                    }
                }
                return null;
            }
        } // end of factory class

        @Override
        public XMLStreamReader getPullParser(final QName arg0) {
            return null;
        }
    }
}
