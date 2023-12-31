package com.fincatto.documentofiscal.nfe.webservices.distribuicao;

import com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub;

import org.apache.axis2.client.Stub;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import com.fincatto.documentofiscal.DFConfig;
import com.fincatto.documentofiscal.utils.MessageContextFactory;

@SuppressWarnings({"rawtypes", "unchecked", "deprecation", "unused"})
public class NFeDistribuicaoDFeSoapStub extends org.apache.axis2.client.Stub {

    private static final String EXTRA_ELEMENT_CANNOT_BE_NULL = "extraElement cannot be null!!";
    private static final String UTILITY_CLASS = "Utility class";
    private static final String NFE_DIST_D_FE_INTERESSE = "nfeDistDFeInteresse";
    public static final String NFE_RESULT_MSG = "nfeDadosMsg";
    public static final String NFE_DADOS_MSG_TYPE_0 = "nfeDadosMsg_type0";
    public static final String NFE_DIST_D_FE_INTERESSE_RESPONSE = "nfeDistDFeInteresseResponse";
    public static final String NFE_DIST_D_FE_INTERESSE_RESULT = "nfeDistDFeInteresseResult";
    public static final String NFE_DIST_DFE_INTERESSE_RESULT_TYPE_0 = "nfeDistDFeInteresseResult_type0";
    public static final String HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DISTRIBUICAO_DFE = "http://www.portalfiscal.inf.br/nfe/wsdl/NFeDistribuicaoDFe";
    public static final String XMLSCHEMA_INSTANCE = "http://www.w3.org/2001/XMLSchema-instance";
    public static final String UNEXPECTED_SUBELEMENT = "Unexpected subelement ";
    protected org.apache.axis2.description.AxisOperation[] operations;

    // hashmaps to keep the fault mapping
    private final java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private final java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private final java.util.HashMap faultMessageMap = new java.util.HashMap();

    private static final javax.xml.namespace.QName[] opNameArray = null;
    private final DFConfig config;

    private static int counter = 0;

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (NFeDistribuicaoDFeSoapStub.counter > 99999) {
            NFeDistribuicaoDFeSoapStub.counter = 0;
        }
        NFeDistribuicaoDFeSoapStub.counter = NFeDistribuicaoDFeSoapStub.counter + 1;
        return System.currentTimeMillis() + "_" + NFeDistribuicaoDFeSoapStub.counter;
    }

    private void populateAxisService() {
        this._service = new org.apache.axis2.description.AxisService("NFeDistribuicaoDFe" + NFeDistribuicaoDFeSoapStub.getUniqueSuffix());
        this.addAnonymousOperations();
        // creating the operations
        org.apache.axis2.description.AxisOperation operation;
        this.operations = new org.apache.axis2.description.AxisOperation[1];
        operation = new org.apache.axis2.description.OutInAxisOperation();
        operation.setName(new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DISTRIBUICAO_DFE, NFE_DIST_D_FE_INTERESSE));
        this._service.addOperation(operation);
        this.operations[0] = operation;
    }

    // populates the faults
    private void populateFaults() {
        // Empty Method
    }

    public NFeDistribuicaoDFeSoapStub(final org.apache.axis2.context.ConfigurationContext configurationContext, final java.lang.String targetEndpoint, DFConfig config) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false, config);
    }

    public NFeDistribuicaoDFeSoapStub(final org.apache.axis2.context.ConfigurationContext configurationContext, final java.lang.String targetEndpoint, final boolean useSeparateListener, DFConfig config) throws org.apache.axis2.AxisFault {
        // To populate AxisService
        this.populateAxisService();
        this.populateFaults();
        this._serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, this._service);
        this._serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
        this._serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        this.config = config;
    }

    public NFeDistribuicaoDFeSoapStub(final java.lang.String targetEndpoint, DFConfig config) throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint, config);
    }

    public NFeDistDFeInteresseResponse nfeDistDFeInteresse(final NFeDistDFeInteresse nfeDistDFeInteresse) throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext messageContext = null;
        try {
            final org.apache.axis2.client.OperationClient operationClient = this._serviceClient.createClient(this.operations[0].getName());
            operationClient.getOptions().setAction("http://www.portalfiscal.inf.br/nfe/wsdl/NFeDistribuicaoDFe/nfeDistDFeInteresse");
            operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);
            this.addPropertyToOperationClient(operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");
            // create a message context
            messageContext = MessageContextFactory.INSTANCE.create(config);
            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env;
            env = this.toEnvelope(Stub.getFactory(operationClient.getOptions().getSoapVersionURI()), nfeDistDFeInteresse);
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
            final java.lang.Object object = this.fromOM(returnEnv.getBody().getFirstElement(), NFeDistDFeInteresseResponse.class);
            return (NFeDistDFeInteresseResponse) object;
        } catch (final org.apache.axis2.AxisFault f) {
            final org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (this.faultExceptionNameMap.containsKey(faultElt.getQName())) {
                    // make the fault by reflection
                    try {
                        final java.lang.String exceptionClassName = (java.lang.String) this.faultExceptionClassNameMap.get(faultElt.getQName());
                        final java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        final java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        // message class
                        final java.lang.String messageClassName = (java.lang.String) this.faultMessageMap.get(faultElt.getQName());
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

    private boolean optimizeContent = false;

    // https://www1.nfe.fazenda.gov.br/NFeDistribuicaoDFe/NFeDistribuicaoDFe.asmx
    public static class NFeDistDFeInteresse implements org.apache.axis2.databinding.ADBBean {
        private static final long serialVersionUID = 2957376822838111021L;

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DISTRIBUICAO_DFE, NFE_DIST_D_FE_INTERESSE, "ns1");

        private static java.lang.String generatePrefix(final java.lang.String namespace) {
            if (namespace.equals(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DISTRIBUICAO_DFE)) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * field for NFeDadosMsg
         */

        protected NFeDadosMsgType0 localNFeDadosMsg;

        /*
         * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to determine whether to include this field in the serialized XML
         */
        protected boolean localNFeDadosMsgTracker = false;

        /**
         * Auto generated getter method
         *
         * @return NFeDadosMsg_type0
         */
        public NFeDadosMsgType0 getNFeDadosMsg() {
            return this.localNFeDadosMsg;
        }

        /**
         * Auto generated setter method
         *
         * @param param NFeDadosMsg
         */
        public void setNFeDadosMsg(final NFeDadosMsgType0 param) {
            // update the setting tracker
            this.localNFeDadosMsgTracker = param != null;
            this.localNFeDadosMsg = param;
        }

        /**
         * isReaderMTOMAware
         *
         * @return true if the reader supports MTOM
         */
        public static boolean isReaderMTOMAware(final javax.xml.stream.XMLStreamReader reader) {
            boolean isReaderMTOMAware;
            try {
                isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
            } catch (final java.lang.IllegalArgumentException e) {
                isReaderMTOMAware = false;
            }
            return isReaderMTOMAware;
        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        @Override
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) {
            final org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, NFeDistDFeInteresse.MY_QNAME) {

                @Override
                public void serialize(final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                    NFeDistDFeInteresse.this.serialize(NFeDistDFeInteresse.MY_QNAME, xmlWriter);
                }
            };
            return factory.createOMElement(dataSource, NFeDistDFeInteresse.MY_QNAME);
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
            if (prefix == null) {
                prefix = NFeDistDFeInteresse.generatePrefix(namespace);
            }
            if ((namespace != null) && (namespace.trim().length() > 0)) {
                final java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                if (writerPrefix != null) {
                    xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                } else {
                    xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }
            } else {
                xmlWriter.writeStartElement(parentQName.getLocalPart());
            }
            if (serializeType) {
                final java.lang.String namespacePrefix = this.registerPrefix(xmlWriter, HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DISTRIBUICAO_DFE);
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    this.writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", namespacePrefix + ":nfeDistDFeInteresse", xmlWriter);
                } else {
                    this.writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", NFE_DIST_D_FE_INTERESSE, xmlWriter);
                }
            }
            if (this.localNFeDadosMsgTracker) {
                if (this.localNFeDadosMsg == null) {
                    throw new org.apache.axis2.databinding.ADBException("nfeDadosMsg cannot be null!!");
                }
                this.localNFeDadosMsg.serialize(new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DISTRIBUICAO_DFE, NFE_RESULT_MSG), xmlWriter);
            }
            xmlWriter.writeEndElement();
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

        private void writeQName(final javax.xml.namespace.QName qname, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            final java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = NFeDistDFeInteresse.generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix, namespaceURI);
                }
                if (prefix.trim().length() > 0) {
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
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
                prefix = NFeDistDFeInteresse.generatePrefix(namespace);
                while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
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
            if (this.localNFeDadosMsgTracker) {
                elementList.add(new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DISTRIBUICAO_DFE, NFE_RESULT_MSG));
                if (this.localNFeDadosMsg == null) {
                    throw new org.apache.axis2.databinding.ADBException("nfeDadosMsg cannot be null!!");
                }
                elementList.add(this.localNFeDadosMsg);
            }
            return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
        }

        public static class Factory {

            private Factory() {
                throw new IllegalStateException(UTILITY_CLASS);
            }

            public static NFeDistDFeInteresse parse(final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                final NFeDistDFeInteresse object = new NFeDistDFeInteresse();
                final int event;
                final java.lang.String nillableValue = null;
                final java.lang.String prefix = "";
                final java.lang.String namespaceuri = "";
                try {
                    while (isNotStartOrEndElement(reader)) {
                        reader.next();
                    }
                    NFeDistDFeInteresse varParse = parsePart1(reader);
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
                    if (reader.isStartElement() && new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DISTRIBUICAO_DFE, NFE_RESULT_MSG).equals(reader.getName())) {
                        object.setNFeDadosMsg(NFeDadosMsgType0.Factory.parse(reader));
                        reader.next();
                    } // End of if for expected property start element
                    while (isNotStartOrEndElement(reader)) {
                        reader.next();
                    }
                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(UNEXPECTED_SUBELEMENT + reader.getLocalName());
                    }
                } catch (final javax.xml.stream.XMLStreamException e) {
                    throw new javax.xml.stream.XMLStreamException(e);
                }
                return object;
            }

            private static boolean isNotStartOrEndElement(javax.xml.stream.XMLStreamReader reader) {
                return !reader.isStartElement() && !reader.isEndElement();
            }

            private static NFeDistDFeInteresse parsePart1(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                if (reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type") != null) {
                    final java.lang.String fullTypeName = reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.contains(":")) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = nsPrefix == null ? "" : nsPrefix;
                        final java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);
                        if (!NFE_DIST_D_FE_INTERESSE.equals(type)) {
                            // find namespace for the prefix
                            final java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (NFeDistDFeInteresse) ExtensionMapper.getTypeObject(nsUri, type, reader);
                        }
                    }
                }
                return null;
            }
        }// end of factory class
    }

    public static class NFeDadosMsgType0 implements org.apache.axis2.databinding.ADBBean {

        private static final long serialVersionUID = -979080383028520937L;
        /*
         * This type was generated from the piece of schema that had name = NFeDadosMsg_type0 Namespace URI = http://www.portalfiscal.inf.br/nfe/wsdl/NFeDistribuicaoDFe Namespace Prefix = ns1
         */

        private static java.lang.String generatePrefix(final java.lang.String namespace) {
            if (namespace.equals(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DISTRIBUICAO_DFE)) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

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
         * isReaderMTOMAware
         *
         * @return true if the reader supports MTOM
         */
        public static boolean isReaderMTOMAware(final javax.xml.stream.XMLStreamReader reader) {
            boolean isReaderMTOMAware;
            try {
                isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
            } catch (final java.lang.IllegalArgumentException e) {
                isReaderMTOMAware = false;
            }
            return isReaderMTOMAware;
        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        @Override
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) {
            final org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, parentQName) {

                @Override
                public void serialize(final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                    NFeDadosMsgType0.this.serialize(this.parentQName, xmlWriter);
                }
            };
            return factory.createOMElement(dataSource, parentQName);
        }

        @Override
        public void serialize(final javax.xml.namespace.QName parentQName, final javax.xml.stream.XMLStreamWriter xmlWriter, final boolean serializeType) {
            this.serialize(parentQName, xmlWriter, serializeType);
        }

        @Override
        public void serialize(final javax.xml.namespace.QName parentQName, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            this.serialize(parentQName, xmlWriter, false);
        }

        public void serialize2(final javax.xml.namespace.QName parentQName, final javax.xml.stream.XMLStreamWriter xmlWriter, final boolean serializeType) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix;
            java.lang.String namespace;
            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            if (prefix == null) {
                prefix = NFeDadosMsgType0.generatePrefix(namespace);
            }
            if ((namespace != null) && (namespace.trim().length() > 0)) {
                final java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                if (writerPrefix != null) {
                    xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                } else {
                    xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }
            } else {
                xmlWriter.writeStartElement(parentQName.getLocalPart());
            }
            if (serializeType) {
                final java.lang.String namespacePrefix = this.registerPrefix(xmlWriter, HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DISTRIBUICAO_DFE);
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    this.writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", namespacePrefix + ":nfeDadosMsg_type0", xmlWriter);
                } else {
                    this.writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", NFE_DADOS_MSG_TYPE_0, xmlWriter);
                }
            }
            if (this.localExtraElement != null) {
                this.localExtraElement.serialize(xmlWriter);
            } else {
                throw new org.apache.axis2.databinding.ADBException(EXTRA_ELEMENT_CANNOT_BE_NULL);
            }
            xmlWriter.writeEndElement();
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
                    prefix = NFeDadosMsgType0.generatePrefix(namespaceURI);
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
                prefix = NFeDadosMsgType0.generatePrefix(namespace);
                while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
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
            public static NFeDadosMsgType0 parse(final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                final NFeDadosMsgType0 object = new NFeDadosMsgType0();
                final int event;
                final java.lang.String nillableValue = null;
                final java.lang.String prefix = "";
                final java.lang.String namespaceuri = "";
                try {
                    while (isNotStartOrEndElement(reader)) {
                        reader.next();
                    }
                    NFeDadosMsgType0 varParse = parsePart1(reader);
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
                        throw new org.apache.axis2.databinding.ADBException(UNEXPECTED_SUBELEMENT + reader.getLocalName());
                    }
                    while (isNotStartOrEndElement(reader)) {
                        reader.next();
                    }
                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(UNEXPECTED_SUBELEMENT + reader.getLocalName());
                    }
                } catch (final javax.xml.stream.XMLStreamException e) {
                    throw new javax.xml.stream.XMLStreamException(e);
                }
                return object;
            }

            private static boolean isNotStartOrEndElement(javax.xml.stream.XMLStreamReader reader) {
                return !reader.isStartElement() && !reader.isEndElement();
            }

            private static NFeDadosMsgType0 parsePart1(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                if (reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type") != null) {
                    final java.lang.String fullTypeName = reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.contains(":")) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = nsPrefix == null ? "" : nsPrefix;
                        final java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);
                        if (!NFE_DADOS_MSG_TYPE_0.equals(type)) {
                            // find namespace for the prefix
                            final java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (NFeDadosMsgType0) ExtensionMapper.getTypeObject(nsUri, type, reader);
                        }
                    }
                }
                return null;
            }
        }// end of factory class
    }

    public static class NFeDistDFeInteresseResponse implements org.apache.axis2.databinding.ADBBean {
        private static final long serialVersionUID = -7734346985786228491L;

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DISTRIBUICAO_DFE, NFE_DIST_D_FE_INTERESSE_RESPONSE, "ns1");

        private static java.lang.String generatePrefix(final java.lang.String namespace) {
            if (namespace.equals(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DISTRIBUICAO_DFE)) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * field for NFeDistDFeInteresseResult
         */

        protected NFeDistDFeInteresseResultType0 localNFeDistDFeInteresseResult;

        /*
         * This tracker boolean wil be used to detect whether the user called the set method for this attribute. It will be used to determine whether to include this field in the serialized XML
         */
        protected boolean localNFeDistDFeInteresseResultTracker = false;

        /**
         * Auto generated getter method
         *
         * @return NFeDistDFeInteresseResult_type0
         */
        public NFeDistDFeInteresseResultType0 getNFeDistDFeInteresseResult() {
            return this.localNFeDistDFeInteresseResult;
        }

        /**
         * Auto generated setter method
         *
         * @param param NFeDistDFeInteresseResult
         */
        public void setNFeDistDFeInteresseResult(final NFeDistDFeInteresseResultType0 param) {
            // update the setting tracker
            this.localNFeDistDFeInteresseResultTracker = param != null;
            this.localNFeDistDFeInteresseResult = param;
        }

        /**
         * isReaderMTOMAware
         *
         * @return true if the reader supports MTOM
         */
        public static boolean isReaderMTOMAware(final javax.xml.stream.XMLStreamReader reader) {
            boolean isReaderMTOMAware;
            try {
                isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
            } catch (final java.lang.IllegalArgumentException e) {
                isReaderMTOMAware = false;
            }
            return isReaderMTOMAware;
        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        @Override
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) {
            final org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, NFeDistDFeInteresseResponse.MY_QNAME) {

                @Override
                public void serialize(final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                    NFeDistDFeInteresseResponse.this.serialize(NFeDistDFeInteresseResponse.MY_QNAME, xmlWriter);
                }
            };
            return factory.createOMElement(dataSource, NFeDistDFeInteresseResponse.MY_QNAME);
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
            if (prefix == null) {
                prefix = NFeDistDFeInteresseResponse.generatePrefix(namespace);
            }
            if ((namespace != null) && (namespace.trim().length() > 0)) {
                final java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                if (writerPrefix != null) {
                    xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                } else {
                    xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }
            } else {
                xmlWriter.writeStartElement(parentQName.getLocalPart());
            }
            if (serializeType) {
                final java.lang.String namespacePrefix = this.registerPrefix(xmlWriter, HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DISTRIBUICAO_DFE);
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    this.writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", namespacePrefix + ":nfeDistDFeInteresseResponse", xmlWriter);
                } else {
                    this.writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", NFE_DIST_D_FE_INTERESSE_RESPONSE, xmlWriter);
                }
            }
            if (this.localNFeDistDFeInteresseResultTracker) {
                if (this.localNFeDistDFeInteresseResult == null) {
                    throw new org.apache.axis2.databinding.ADBException("nfeDistDFeInteresseResult cannot be null!!");
                }
                this.localNFeDistDFeInteresseResult.serialize(new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DISTRIBUICAO_DFE, NFE_DIST_D_FE_INTERESSE_RESULT), xmlWriter);
            }
            xmlWriter.writeEndElement();
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
                    prefix = NFeDistDFeInteresseResponse.generatePrefix(namespaceURI);
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
                prefix = NFeDistDFeInteresseResponse.generatePrefix(namespace);
                while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
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
            if (this.localNFeDistDFeInteresseResultTracker) {
                elementList.add(new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DISTRIBUICAO_DFE, NFE_DIST_D_FE_INTERESSE_RESULT));
                if (this.localNFeDistDFeInteresseResult == null) {
                    throw new org.apache.axis2.databinding.ADBException("nfeDistDFeInteresseResult cannot be null!!");
                }
                elementList.add(this.localNFeDistDFeInteresseResult);
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
            public static NFeDistDFeInteresseResponse parse(final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                final NFeDistDFeInteresseResponse object = new NFeDistDFeInteresseResponse();
                final int event;
                final java.lang.String nillableValue = null;
                final java.lang.String prefix = "";
                final java.lang.String namespaceuri = "";
                try {
                    while (isNotStartOrEndElement(reader)) {
                        reader.next();
                    }
                    NFeDistDFeInteresseResponse varParse = parsePart1(reader);
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
                    if (reader.isStartElement() && new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DISTRIBUICAO_DFE, NFE_DIST_D_FE_INTERESSE_RESULT).equals(reader.getName())) {
                        object.setNFeDistDFeInteresseResult(NFeDistDFeInteresseResultType0.Factory.parse(reader));
                        reader.next();
                    } // End of if for expected property start element
                    while (isNotStartOrEndElement(reader)) {
                        reader.next();
                    }
                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(UNEXPECTED_SUBELEMENT + reader.getLocalName());
                    }
                } catch (final javax.xml.stream.XMLStreamException e) {
                    throw new javax.xml.stream.XMLStreamException(e);
                }
                return object;
            }

            private static boolean isNotStartOrEndElement(javax.xml.stream.XMLStreamReader reader) {
                return !reader.isStartElement() && !reader.isEndElement();
            }

            private static NFeDistDFeInteresseResponse parsePart1(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                if (reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type") != null) {
                    final java.lang.String fullTypeName = reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.contains(":")) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = nsPrefix == null ? "" : nsPrefix;
                        final java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);
                        if (!NFE_DIST_D_FE_INTERESSE_RESPONSE.equals(type)) {
                            // find namespace for the prefix
                            final java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (NFeDistDFeInteresseResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
                        }
                    }
                }
                return null;
            }
        }// end of factory class
    }

    public static class ExtensionMapper {

        private ExtensionMapper() {
            throw new IllegalStateException(UTILITY_CLASS);
        }

        public static java.lang.Object getTypeObject(final java.lang.String namespaceURI, final java.lang.String typeName, final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            if (HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DISTRIBUICAO_DFE.equals(namespaceURI) && NFE_DIST_DFE_INTERESSE_RESULT_TYPE_0.equals(typeName)) {
                return NFeDistDFeInteresseResultType0.Factory.parse(reader);
            }
            if (HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DISTRIBUICAO_DFE.equals(namespaceURI) && NFE_DADOS_MSG_TYPE_0.equals(typeName)) {
                return NFeDadosMsgType0.Factory.parse(reader);
            }
            throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
        }
    }

    public static class NFeDistDFeInteresseResultType0 implements org.apache.axis2.databinding.ADBBean {
        private static final long serialVersionUID = -3193367638280166354L;

        /*
         * This type was generated from the piece of schema that had name = NFeDistDFeInteresseResult_type0 Namespace URI = http://www.portalfiscal.inf.br/nfe/wsdl/NFeDistribuicaoDFe Namespace Prefix = ns1
         */
        private static java.lang.String generatePrefix(final java.lang.String namespace) {
            if (namespace.equals(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DISTRIBUICAO_DFE)) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

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
         * isReaderMTOMAware
         *
         * @return true if the reader supports MTOM
         */
        public static boolean isReaderMTOMAware(final javax.xml.stream.XMLStreamReader reader) {
            boolean isReaderMTOMAware;
            try {
                isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
            } catch (final java.lang.IllegalArgumentException e) {
                isReaderMTOMAware = false;
            }
            return isReaderMTOMAware;
        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        @Override
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) {
            final org.apache.axiom.om.OMDataSource dataSource = new org.apache.axis2.databinding.ADBDataSource(this, parentQName) {

                @Override
                public void serialize(final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                    NFeDistDFeInteresseResultType0.this.serialize(this.parentQName, xmlWriter);
                }
            };
            return factory.createOMElement(dataSource, parentQName);
        }

        @Override
        public void serialize(final javax.xml.namespace.QName parentQName, final javax.xml.stream.XMLStreamWriter xmlWriter, final boolean serializeType) {
            this.serialize(parentQName, xmlWriter, serializeType);
        }

        @Override
        public void serialize(final javax.xml.namespace.QName parentQName, final javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            this.serialize(parentQName, xmlWriter, false);
        }

        public void serialize2(final javax.xml.namespace.QName parentQName, final javax.xml.stream.XMLStreamWriter xmlWriter, final boolean serializeType) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix;
            java.lang.String namespace;
            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            if (prefix == null) {
                prefix = NFeDistDFeInteresseResultType0.generatePrefix(namespace);
            }
            if ((namespace != null) && (namespace.trim().length() > 0)) {
                final java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                if (writerPrefix != null) {
                    xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                } else {
                    xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }
            } else {
                xmlWriter.writeStartElement(parentQName.getLocalPart());
            }
            if (serializeType) {
                final java.lang.String namespacePrefix = this.registerPrefix(xmlWriter, HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_DISTRIBUICAO_DFE);
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    this.writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", namespacePrefix + ":nfeDistDFeInteresseResult_type0", xmlWriter);
                } else {
                    this.writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", NFE_DIST_DFE_INTERESSE_RESULT_TYPE_0, xmlWriter);
                }
            }
            if (this.localExtraElement != null) {
                this.localExtraElement.serialize(xmlWriter);
            } else {
                throw new org.apache.axis2.databinding.ADBException(EXTRA_ELEMENT_CANNOT_BE_NULL);
            }
            xmlWriter.writeEndElement();
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
                    prefix = NFeDistDFeInteresseResultType0.generatePrefix(namespaceURI);
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
                prefix = NFeDistDFeInteresseResultType0.generatePrefix(namespace);
                while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
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
            public static NFeDistDFeInteresseResultType0 parse(final javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                final NFeDistDFeInteresseResultType0 object = new NFeDistDFeInteresseResultType0();
                final int event;
                final java.lang.String nillableValue = null;
                final java.lang.String prefix = "";
                final java.lang.String namespaceuri = "";
                try {
                    while (isNotStartOrEndElement(reader)) {
                        reader.next();
                    }
                    NFeDistDFeInteresseResultType0 varParse = parsePart1(reader);
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
                        throw new org.apache.axis2.databinding.ADBException(UNEXPECTED_SUBELEMENT + reader.getLocalName());
                    }
                    while (isNotStartOrEndElement(reader)) {
                        reader.next();
                    }
                    if (reader.isStartElement()) {
                        // A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(UNEXPECTED_SUBELEMENT + reader.getLocalName());
                    }
                } catch (final javax.xml.stream.XMLStreamException e) {
                    throw new javax.xml.stream.XMLStreamException(e);
                }
                return object;
            }

            private static boolean isNotStartOrEndElement(javax.xml.stream.XMLStreamReader reader) {
                return !reader.isStartElement() && !reader.isEndElement();
            }

            private static NFeDistDFeInteresseResultType0 parsePart1(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                if (reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type") != null) {
                    final java.lang.String fullTypeName = reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.contains(":")) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = nsPrefix == null ? "" : nsPrefix;
                        final java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);
                        if (!NFE_DIST_DFE_INTERESSE_RESULT_TYPE_0.equals(type)) {
                            // find namespace for the prefix
                            final java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (NFeDistDFeInteresseResultType0) ExtensionMapper.getTypeObject(nsUri, type, reader);
                        }
                    }
                }
                return null;
            }
        }// end of factory class
    }

    private org.apache.axiom.om.OMElement toOM(final NFeDistDFeInteresse param) {
        return param.getOMElement(NFeDistDFeInteresse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    }

    private org.apache.axiom.om.OMElement toOM(final NFeDistDFeInteresseResponse param) {
        return param.getOMElement(NFeDistDFeInteresseResponse.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(final org.apache.axiom.soap.SOAPFactory factory, final NFeDistDFeInteresse param) {
        final org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
        emptyEnvelope.getBody().addChild(param.getOMElement(NFeDistDFeInteresse.MY_QNAME, factory));
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
            if (NFeDistDFeInteresse.class.equals(type)) {
                return NFeDistDFeInteresse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
            if (NFeDistDFeInteresseResponse.class.equals(type)) {
                return NFeDistDFeInteresseResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (final java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
    }
}
