package com.fincatto.documentofiscal.nfe310.webservices.gerado;

import org.apache.axiom.om.OMAttribute;
import org.apache.axis2.client.Stub;
import org.apache.axis2.databinding.utils.Constants;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

import javax.xml.stream.XMLStreamException;

import com.fincatto.documentofiscal.DFConfig;
import com.fincatto.documentofiscal.utils.MessageContextFactory;

/*
 * CadConsultaCadastro2Stub java implementation
 */

public class CadConsultaCadastro2Stub extends org.apache.axis2.client.Stub {

    private static final String EXTRA_ELEMENT_CANNOT_BE_NULL = "extraElement cannot be null!!";
    private static final String UTILITY_CLASS = "Utility class";
    public static final String CONSULTA_CADASTRO_2_RESULT = "consultaCadastro2Result";
    public static final String NFE_DADOS_MSG = "nfeDadosMsg";
    public static final String XMLSCHEMA_INSTANCE = "http://www.w3.org/2001/XMLSchema-instance";
    public static final String NFE_CABEC_MSG = "nfeCabecMsg";
    public static final String HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_2 = "http://www.portalfiscal.inf.br/nfe/wsdl/CadConsultaCadastro2";
    public static final String CONSULTA_CADASTRO_2 = "consultaCadastro2";
    public static final String UNEXPECTED_SUBELEMENT = "Unexpected subelement ";
    public static final String VERSAO_DADOS = "versaoDados";
    protected org.apache.axis2.description.AxisOperation[] operations;

    // hashmaps to keep the fault mapping
    @SuppressWarnings("rawtypes")
    private final java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    @SuppressWarnings("rawtypes")
    private final java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    @SuppressWarnings("rawtypes")
    private final java.util.HashMap faultMessageMap = new java.util.HashMap();

    private static int counter = 0;

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (CadConsultaCadastro2Stub.counter > 99999) {
            CadConsultaCadastro2Stub.counter = 0;
        }
        CadConsultaCadastro2Stub.counter = CadConsultaCadastro2Stub.counter + 1;
        return System.currentTimeMillis() + "_" + CadConsultaCadastro2Stub.counter;
    }

    private void populateAxisService() {
        // creating the Service with a unique name
        this._service = new org.apache.axis2.description.AxisService("CadConsultaCadastro2" + CadConsultaCadastro2Stub.getUniqueSuffix());
        this.addAnonymousOperations();
        // creating the operations
        org.apache.axis2.description.AxisOperation operation;
        this.operations = new org.apache.axis2.description.AxisOperation[1];
        operation = new org.apache.axis2.description.OutInAxisOperation();
        operation.setName(new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_2, CONSULTA_CADASTRO_2));
        this._service.addOperation(operation);
        this.operations[0] = operation;
    }

    // populates the faults
    private void populateFaults() {
        // Empty Method
    }

    public CadConsultaCadastro2Stub(final org.apache.axis2.context.ConfigurationContext configurationContext, final java.lang.String targetEndpoint, DFConfig config) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false, config);
    }

    public CadConsultaCadastro2Stub(final org.apache.axis2.context.ConfigurationContext configurationContext, final java.lang.String targetEndpoint, final boolean useSeparateListener, DFConfig config) throws org.apache.axis2.AxisFault {
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

    public CadConsultaCadastro2Stub(final java.lang.String targetEndpoint, DFConfig config) throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint, config);
    }

    public CadConsultaCadastro2Stub.ConsultaCadastro2Result consultaCadastro2(final CadConsultaCadastro2Stub.NfeDadosMsg nfeDadosMsg, final CadConsultaCadastro2Stub.NfeCabecMsgE nfeCabecMsg) throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext messageContext = null;
        try {
            final org.apache.axis2.client.OperationClient operationClient = this._serviceClient.createClient(this.operations[0].getName());
            operationClient.getOptions().setAction("http://www.portalfiscal.inf.br/nfe/wsdl/CadConsultaCadastro2/consultaCadastro2");
            operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);
            this.addPropertyToOperationClient(operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");
            // create a message context
            messageContext = MessageContextFactory.INSTANCE.create(config);
            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env;
            env = this.toEnvelope(Stub.getFactory(operationClient.getOptions().getSoapVersionURI()), nfeDadosMsg);
            env.build();
            // add the children only if the parameter is not null
            if (nfeCabecMsg != null) {
                final org.apache.axiom.om.OMElement omElementnfeCabecMsg = this.toOM(nfeCabecMsg);
                this.addHeader(omElementnfeCabecMsg, env);
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
            final java.lang.Object object = this.fromOM(returnEnv.getBody().getFirstElement(), CadConsultaCadastro2Stub.ConsultaCadastro2Result.class);
            return (CadConsultaCadastro2Stub.ConsultaCadastro2Result) object;
        } catch (final org.apache.axis2.AxisFault f) {
            final org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (this.faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), CONSULTA_CADASTRO_2))) {
                    // make the fault by reflection
                    try {
                        final java.lang.String exceptionClassName = (java.lang.String) this.faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), CONSULTA_CADASTRO_2));
                        final Class<?> exceptionClass = java.lang.Class.forName(exceptionClassName);
                        final Constructor<?> constructor = exceptionClass.getConstructor(String.class);
                        final java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                        // message class
                        final java.lang.String messageClassName = (java.lang.String) this.faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), CONSULTA_CADASTRO_2));
                        final Class<?> messageClass = java.lang.Class.forName(messageClassName);
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

    private final DFConfig config;

    public static class NfeCabecMsg implements org.apache.axis2.databinding.ADBBean {

        private static final String VERSAO_DADOS_CANNOT_BE_NULL = "versaoDados cannot be null!!";
        private static final long serialVersionUID = -4687573298709123080L;
        protected java.lang.String localVersaoDados;

        /*
         * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to determine whether to include this field in the serialized XML
         */
        protected boolean localVersaoDadosTracker = false;

        public boolean isVersaoDadosSpecified() {
            return this.localVersaoDadosTracker;
        }

        public java.lang.String getVersaoDados() {
            return this.localVersaoDados;
        }

        public void setVersaoDados(final java.lang.String param) {
            this.localVersaoDadosTracker = param != null;
            this.localVersaoDados = param;
        }

        protected java.lang.String localCUF;

        /*
         * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to determine whether to include this field in the serialized XML
         */
        protected boolean localCUFTracker = false;

        public boolean isCUFSpecified() {
            return this.localCUFTracker;
        }

        public java.lang.String getCUF() {
            return this.localCUF;
        }

        public void setCUF(final java.lang.String param) {
            this.localCUFTracker = param != null;
            this.localCUF = param;
        }

        protected transient org.apache.axiom.om.OMAttribute[] localExtraAttributes;

        public org.apache.axiom.om.OMAttribute[] getExtraAttributes() {
            return this.localExtraAttributes;
        }

        protected void validateExtraAttributes(final org.apache.axiom.om.OMAttribute[] param) {
            if ((param != null) && (param.length > 1)) {
                throw new IllegalArgumentException();
            }
            if ((param != null) && (param.length < 1)) {
                throw new IllegalArgumentException();
            }
        }

        public void setExtraAttributes(final org.apache.axiom.om.OMAttribute[] param) {
            this.validateExtraAttributes(param);
            this.localExtraAttributes = param;
        }

        public void addExtraAttributes(final org.apache.axiom.om.OMAttribute param) {
            if (this.localExtraAttributes == null) {
                this.localExtraAttributes = new org.apache.axiom.om.OMAttribute[]{};
            }
            @SuppressWarnings("unchecked") final java.util.List<OMAttribute> list = org.apache.axis2.databinding.utils.ConverterUtil.toList(this.localExtraAttributes);
            list.add(param);
            this.localExtraAttributes = list.toArray(new OMAttribute[0]);
        }

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
                final java.lang.String namespacePrefix = this.registerPrefix(xmlWriter, HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_2);
                serializeCheckPrefix(namespacePrefix, xmlWriter);
            }
            if (this.localExtraAttributes != null) {
                for (OMAttribute localExtraAttribute : this.localExtraAttributes) {
                    this.writeAttribute(localExtraAttribute.getNamespace().getNamespaceURI(), localExtraAttribute.getLocalName(), localExtraAttribute.getAttributeValue(), xmlWriter);
                }
            }
            if (this.localVersaoDadosTracker) {
                namespace = HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_2;
                this.writeStartElement(null, namespace, VERSAO_DADOS, xmlWriter);
                if (this.localVersaoDados == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException(VERSAO_DADOS_CANNOT_BE_NULL);
                } else {
                    xmlWriter.writeCharacters(this.localVersaoDados);
                }
                xmlWriter.writeEndElement();
            }
            if (this.localCUFTracker) {
                namespace = HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_2;
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
                this.writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", namespacePrefix + ":nfeCabecMsg", xmlWriter);
            } else {
                this.writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", NFE_CABEC_MSG, xmlWriter);
            }
        }

        private static java.lang.String generatePrefix(final java.lang.String namespace) {
            if (namespace.equals(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_2)) {
                return "";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

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

        private void writeAttribute(final java.lang.String prefix, final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        private void writeAttribute(final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                this.registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace, attName, attValue);
            }
        }

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

        @Override
        public javax.xml.stream.XMLStreamReader getPullParser(final javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {
            final java.util.ArrayList<Serializable> elementList = new java.util.ArrayList<>();
            final java.util.ArrayList<Object> attribList = new java.util.ArrayList<>();
            if (this.localVersaoDadosTracker) {
                elementList.add(new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_2, VERSAO_DADOS));
                if (this.localVersaoDados != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localVersaoDados));
                } else {
                    throw new org.apache.axis2.databinding.ADBException(VERSAO_DADOS_CANNOT_BE_NULL);
                }
            }
            if (this.localCUFTracker) {
                elementList.add(new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_2, "cUF"));
                if (this.localCUF != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localCUF));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("cUF cannot be null!!");
                }
            }
            for (OMAttribute localExtraAttribute : this.localExtraAttributes) {
                attribList.add(Constants.OM_ATTRIBUTE_KEY);
                attribList.add(localExtraAttribute);
            }
            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
        }

        public static class Factory {

            private Factory() {
                throw new IllegalStateException(UTILITY_CLASS);
            }

            public static NfeCabecMsg parse(final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                NfeCabecMsg object = new NfeCabecMsg();
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
                    final ArrayList<String> handledAttributes = new ArrayList<>();
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

            private static NfeCabecMsg parsePart1(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
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

            private static NfeCabecMsg parsePart2(NfeCabecMsg object, javax.xml.stream.XMLStreamReader reader) throws XMLStreamException {
                String nillableValue;
                while (isNotStartOrEndElement(reader)) {
                    reader.next();
                }
                if (reader.isStartElement() && new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_2, VERSAO_DADOS).equals(reader.getName())) {
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

            private static NfeCabecMsg parsePart3(NfeCabecMsg object, javax.xml.stream.XMLStreamReader reader) throws XMLStreamException {
                String nillableValue;
                while (isNotStartOrEndElement(reader)) {
                    reader.next();
                }
                if (reader.isStartElement() && new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_2, "cUF").equals(reader.getName())) {
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

    public static class NfeCabecMsgE implements org.apache.axis2.databinding.ADBBean {
        private static final long serialVersionUID = 147700344211352494L;

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_2, NFE_CABEC_MSG, "");

        protected NfeCabecMsg localNfeCabecMsg;

        public NfeCabecMsg getNfeCabecMsg() {
            return this.localNfeCabecMsg;
        }

        public void setNfeCabecMsg(final NfeCabecMsg param) {
            this.localNfeCabecMsg = param;
        }

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

        @Override
        public javax.xml.stream.XMLStreamReader getPullParser(final javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {
            // We can safely assume an element has only one type associated with it
            return this.localNfeCabecMsg.getPullParser(NfeCabecMsgE.MY_QNAME);
        }

        public static class Factory {

            private Factory() {
                throw new IllegalStateException(UTILITY_CLASS);
            }

            public static NfeCabecMsgE parse(final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                final NfeCabecMsgE object = new NfeCabecMsgE();
                try {
                    while (!reader.isStartElement() && !reader.isEndElement()) {
                        reader.next();
                    }
                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {
                            if (reader.isStartElement() && new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_2, NFE_CABEC_MSG).equals(reader.getName())) {
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

    public static class ConsultaCadastro2Result implements org.apache.axis2.databinding.ADBBean {

        private static final long serialVersionUID = -2645890959338742015L;

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_2, CONSULTA_CADASTRO_2_RESULT, "");

        protected transient org.apache.axiom.om.OMElement localExtraElement;

        public org.apache.axiom.om.OMElement getExtraElement() {
            return this.localExtraElement;
        }

        public void setExtraElement(final org.apache.axiom.om.OMElement param) {
            this.localExtraElement = param;
        }

        @Override
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) {
            final org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, ConsultaCadastro2Result.MY_QNAME);
            return factory.createOMElement(dataSource, ConsultaCadastro2Result.MY_QNAME);
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
                final java.lang.String namespacePrefix = this.registerPrefix(xmlWriter, HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_2);
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    this.writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", namespacePrefix + ":consultaCadastro2Result", xmlWriter);
                } else {
                    this.writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", CONSULTA_CADASTRO_2_RESULT, xmlWriter);
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
            if (namespace.equals(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_2)) {
                return "";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        private void writeStartElement(java.lang.String prefix, final java.lang.String namespace, final java.lang.String localPart, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = ConsultaCadastro2Result.generatePrefix(namespace);
                }
                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        private void writeAttribute(final java.lang.String prefix, final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

        private java.lang.String registerPrefix(final javax.xml.stream.XMLStreamWriter xmlWriter, final java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = ConsultaCadastro2Result.generatePrefix(namespace);
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

        @Override
        public javax.xml.stream.XMLStreamReader getPullParser(final javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {
            final java.util.ArrayList<Object> elementList = new java.util.ArrayList<>();
            final java.util.ArrayList<Object> attribList = new java.util.ArrayList<>();
            if (this.localExtraElement != null) {
                elementList.add(org.apache.axis2.databinding.utils.Constants.OM_ELEMENT_KEY);
                elementList.add(this.localExtraElement);
            } else {
                throw new org.apache.axis2.databinding.ADBException(EXTRA_ELEMENT_CANNOT_BE_NULL);
            }
            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
        }

        public static class Factory {

            private Factory() {
                throw new IllegalStateException(UTILITY_CLASS);
            }

            public static ConsultaCadastro2Result parse(final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                final ConsultaCadastro2Result object = new ConsultaCadastro2Result();
                try {
                    nextReader(reader);
                    if (reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type") != null) {
                        final java.lang.String fullTypeName = reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type");
                        return fullTypeNameNotNull(fullTypeName, reader);
                    }
                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    reader.next();
                    nextReader(reader);
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
                    nextReader(reader);
                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(UNEXPECTED_SUBELEMENT + reader.getName());
                    }
                } catch (final javax.xml.stream.XMLStreamException e) {
                    throw new javax.xml.stream.XMLStreamException(e);
                }
                return object;
            }

            private static void nextReader(javax.xml.stream.XMLStreamReader reader) throws XMLStreamException {
                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }
            }

            private static ConsultaCadastro2Result fullTypeNameNotNull(String fullTypeName, javax.xml.stream.XMLStreamReader reader) throws Exception {
                if (fullTypeName != null) {
                    String nsPrefix = getNsPrefix(fullTypeName);
                    final java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);
                    if (!CONSULTA_CADASTRO_2_RESULT.equals(type)) {
                        // find namespace for the prefix
                        final java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (ConsultaCadastro2Result) ExtensionMapper.getTypeObject(nsUri, type, reader);
                    }
                }
                return null;
            }

            private static String getNsPrefix(String fullTypeName) {
                java.lang.String nsPrefix = null;
                if (fullTypeName.contains(":")) {
                    nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                }
                nsPrefix = nsPrefix == null ? "" : nsPrefix;
                return nsPrefix;
            }

        }// end of factory class
    }

    public static class ExtensionMapper {

        private ExtensionMapper() {
            throw new IllegalStateException(UTILITY_CLASS);
        }

        public static java.lang.Object getTypeObject(final java.lang.String namespaceURI, final java.lang.String typeName, final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            if (HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_2.equals(namespaceURI) && NFE_CABEC_MSG.equals(typeName)) {
                return NfeCabecMsg.Factory.parse(reader);
            }
            throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
        }
    }

    public static class NfeDadosMsg implements org.apache.axis2.databinding.ADBBean {
        private static final long serialVersionUID = 249980700063117388L;

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_2, NFE_DADOS_MSG, "");

        protected transient org.apache.axiom.om.OMElement localExtraElement;

        public org.apache.axiom.om.OMElement getExtraElement() {
            return this.localExtraElement;
        }

        public void setExtraElement(final org.apache.axiom.om.OMElement param) {
            this.localExtraElement = param;
        }

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
                final java.lang.String namespacePrefix = this.registerPrefix(xmlWriter, HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_2);
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
            if (namespace.equals(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_2)) {
                return "";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

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

        private void writeAttribute(final java.lang.String prefix, final java.lang.String namespace, final java.lang.String attName, final java.lang.String attValue, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }

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

        @Override
        public javax.xml.stream.XMLStreamReader getPullParser(final javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {
            final java.util.ArrayList<Object> elementList = new java.util.ArrayList<>();
            final java.util.ArrayList<Object> attribList = new java.util.ArrayList<>();
            if (this.localExtraElement != null) {
                elementList.add(org.apache.axis2.databinding.utils.Constants.OM_ELEMENT_KEY);
                elementList.add(this.localExtraElement);
            } else {
                throw new org.apache.axis2.databinding.ADBException(EXTRA_ELEMENT_CANNOT_BE_NULL);
            }
            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
        }

        public static class Factory {

            private Factory() {
                throw new IllegalStateException(UTILITY_CLASS);
            }

            public static NfeDadosMsg parse(final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                final NfeDadosMsg object = new NfeDadosMsg();
                try {
                    nextReader(reader);
                    if (reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type") != null) {
                        final java.lang.String fullTypeName = reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type");
                        return fullTypeNameNotNull(fullTypeName, reader);
                    }
                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    reader.next();
                    nextReader(reader);
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
                    nextReader(reader);
                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(UNEXPECTED_SUBELEMENT + reader.getName());
                    }
                } catch (final javax.xml.stream.XMLStreamException e) {
                    throw new javax.xml.stream.XMLStreamException(e);
                }
                return object;
            }

            private static void nextReader(javax.xml.stream.XMLStreamReader reader) throws XMLStreamException {
                while (!reader.isStartElement() && !reader.isEndElement()) {
                    reader.next();
                }
            }

            private static NfeDadosMsg fullTypeNameNotNull(String fullTypeName, javax.xml.stream.XMLStreamReader reader) throws Exception {
                if (fullTypeName != null) {
                    String nsPrefix = getNsPrefix(fullTypeName);
                    final java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);
                    if (!NFE_DADOS_MSG.equals(type)) {
                        // find namespace for the prefix
                        final java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                        return (NfeDadosMsg) ExtensionMapper.getTypeObject(nsUri, type, reader);
                    }
                }
                return null;
            }

            private static String getNsPrefix(String fullTypeName) {
                java.lang.String nsPrefix = null;
                if (fullTypeName.contains(":")) {
                    nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                }
                nsPrefix = nsPrefix == null ? "" : nsPrefix;
                return nsPrefix;
            }

        }// end of factory class
    }

    private org.apache.axiom.om.OMElement toOM(final CadConsultaCadastro2Stub.NfeCabecMsgE param) {
        return param.getOMElement(CadConsultaCadastro2Stub.NfeCabecMsgE.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(final org.apache.axiom.soap.SOAPFactory factory, final CadConsultaCadastro2Stub.NfeDadosMsg param) {
        final org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
        emptyEnvelope.getBody().addChild(param.getOMElement(CadConsultaCadastro2Stub.NfeDadosMsg.MY_QNAME, factory));
        return emptyEnvelope;
    }

    private java.lang.Object fromOM(final org.apache.axiom.om.OMElement param, final java.lang.Class<?> type) throws org.apache.axis2.AxisFault {
        try {
            if (CadConsultaCadastro2Stub.NfeDadosMsg.class.equals(type)) {
                return CadConsultaCadastro2Stub.NfeDadosMsg.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
            if (CadConsultaCadastro2Stub.ConsultaCadastro2Result.class.equals(type)) {
                return CadConsultaCadastro2Stub.ConsultaCadastro2Result.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
            if (CadConsultaCadastro2Stub.NfeCabecMsgE.class.equals(type)) {
                return CadConsultaCadastro2Stub.NfeCabecMsgE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (final java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
    }
}