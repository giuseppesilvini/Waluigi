package com.fincatto.documentofiscal.nfe310.webservices.statusservico.consulta;

import com.fincatto.documentofiscal.nfe310.webservices.nota.consulta.NfeConsultaStub;
import org.apache.axiom.om.OMAttribute;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

import com.fincatto.documentofiscal.DFConfig;
import com.fincatto.documentofiscal.utils.MessageContextFactory;

@SuppressWarnings({"rawtypes", "unchecked", "serial", "unused", "deprecation"})
public class NfeStatusServicoStub extends org.apache.axis2.client.Stub {

    private static final String EXTRA_ELEMENT_CANNOT_BE_NULL = "extraElement cannot be null!!";
    private static final String UTILITY_CLASS = "Utility class";
    public static final String NFE_STATUS_SERVICO_NF_RESULT = "nfeStatusServicoNFResult";
    public static final String XMLSCHEMA_INSTANCE = "http://www.w3.org/2001/XMLSchema-instance";
    public static final String HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_STATUS_SERVICO = "http://www.portalfiscal.inf.br/nfe/wsdl/NfeStatusServico";
    public static final String NFE_STATUS_SERVICO_NF = "nfeStatusServicoNF";
    public static final String NFE_CABEC_MSG = "nfeCabecMsg";
    public static final String UNEXPECTED_SUBELEMENT = "Unexpected subelement ";
    public static final String OPERATION_NAME = "versaoDados";
    private static int counter = 0;
    protected org.apache.axis2.description.AxisOperation[] operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();
    private javax.xml.namespace.QName[] opNameArray = null;

    private DFConfig config;

    /**
     * Constructor that takes in a configContext
     */
    public NfeStatusServicoStub(org.apache.axis2.context.ConfigurationContext configurationContext, java.lang.String targetEndpoint, DFConfig config) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false, config);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public NfeStatusServicoStub(org.apache.axis2.context.ConfigurationContext configurationContext, java.lang.String targetEndpoint, boolean useSeparateListener, DFConfig config) throws org.apache.axis2.AxisFault {
        //To populate AxisService
        populateAxisService();
        populateFaults();
        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        //Set the soap version
        _serviceClient.getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
        this.config = config;
    }

    /**
     * Constructor taking the target endpoint
     */
    public NfeStatusServicoStub(java.lang.String targetEndpoint, DFConfig config) throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint, config);
    }

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }
        counter = counter + 1;
        return System.currentTimeMillis() + "_" + counter;
    }

    private void populateAxisService() {
        //creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService("NfeStatusServico" + getUniqueSuffix());
        addAnonymousOperations();
        //creating the operations
        org.apache.axis2.description.AxisOperation operation;
        operations = new org.apache.axis2.description.AxisOperation[1];
        operation = new org.apache.axis2.description.OutInAxisOperation();
        operation.setName(new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_STATUS_SERVICO, NFE_STATUS_SERVICO_NF));
        _service.addOperation(operation);
        operations[0] = operation;
    }

    //populates the faults
    private void populateFaults() {
        // Empty Method
    }

    /**
     * Auto generated method signature
     * Serviço destinado à consulta do status do serviço da NF-e.
     *
     * @param nfeDadosMsg
     * @param nfeCabecMsg
     */
    public com.fincatto.documentofiscal.nfe310.webservices.statusservico.consulta.NfeStatusServicoStub.NfeStatusServicoNFResult nfeStatusServicoNF(com.fincatto.documentofiscal.nfe310.webservices.statusservico.consulta.NfeStatusServicoStub.NfeDadosMsg nfeDadosMsg, com.fincatto.documentofiscal.nfe310.webservices.statusservico.consulta.NfeStatusServicoStub.NfeCabecMsgE nfeCabecMsg) throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext messageContext = null;
        try {
            org.apache.axis2.client.OperationClient operationClient = _serviceClient.createClient(operations[0].getName());
            operationClient.getOptions().setAction("http://www.portalfiscal.inf.br/nfe/wsdl/NfeStatusServico/nfeStatusServicoNF");
            operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);
            addPropertyToOperationClient(operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");
            // create a message context
            messageContext = MessageContextFactory.INSTANCE.create(config);
            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env;
            env = toEnvelope(getFactory(operationClient.getOptions().getSoapVersionURI()), nfeDadosMsg);
            env.build();
            // add the children only if the parameter is not null
            if (nfeCabecMsg != null) {
                org.apache.axiom.om.OMElement omElementnfeCabecMsg = toOM(nfeCabecMsg);
                addHeader(omElementnfeCabecMsg, env);
            }
            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            messageContext.setEnvelope(env);
            // add the message contxt to the operation client
            operationClient.addMessageContext(messageContext);
            //execute the operation client
            operationClient.execute(true);
            org.apache.axis2.context.MessageContext returnMessageContext = operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope returnEnv = returnMessageContext.getEnvelope();
            java.lang.Object object = fromOM(returnEnv.getBody().getFirstElement(), com.fincatto.documentofiscal.nfe310.webservices.statusservico.consulta.NfeStatusServicoStub.NfeStatusServicoNFResult.class);
            return (com.fincatto.documentofiscal.nfe310.webservices.statusservico.consulta.NfeStatusServicoStub.NfeStatusServicoNFResult) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null &&
                        faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), NFE_STATUS_SERVICO_NF))) {
                //make the fault by reflection
                try {
                    java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), NFE_STATUS_SERVICO_NF));
                    java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                    java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                    java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
                    //message class
                    java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), NFE_STATUS_SERVICO_NF));
                    java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                    java.lang.Object messageObject = fromOM(faultElt, messageClass);
                    java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage", messageClass);
                    m.invoke(ex, messageObject);
                    throw new java.rmi.RemoteException(ex.getMessage(), ex);
                } catch (ClassCastException | InstantiationException | IllegalAccessException |
                            java.lang.reflect.InvocationTargetException | NoSuchMethodException |
                            ClassNotFoundException e) {
                    // we cannot intantiate the class - throw the original Axis fault
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (messageContext != null && messageContext.getTransportOut() != null) {
                messageContext.getTransportOut().getSender().cleanup(messageContext);
            }
        }
    }

    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        if (opNameArray == null) {
            return false;
        }
        for (QName anOpNameArray : opNameArray) {
            if (opName.equals(anOpNameArray)) {
                return true;
            }
        }
        return false;
    }

    private org.apache.axiom.om.OMElement toOM(com.fincatto.documentofiscal.nfe310.webservices.statusservico.consulta.NfeStatusServicoStub.NfeDadosMsg param) {
        return param.getOMElement(com.fincatto.documentofiscal.nfe310.webservices.statusservico.consulta.NfeStatusServicoStub.NfeDadosMsg.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    }

    private org.apache.axiom.om.OMElement toOM(com.fincatto.documentofiscal.nfe310.webservices.statusservico.consulta.NfeStatusServicoStub.NfeStatusServicoNFResult param) {
        return param.getOMElement(com.fincatto.documentofiscal.nfe310.webservices.statusservico.consulta.NfeStatusServicoStub.NfeStatusServicoNFResult.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    }

    private org.apache.axiom.om.OMElement toOM(com.fincatto.documentofiscal.nfe310.webservices.statusservico.consulta.NfeStatusServicoStub.NfeCabecMsgE param) {
        return param.getOMElement(com.fincatto.documentofiscal.nfe310.webservices.statusservico.consulta.NfeStatusServicoStub.NfeCabecMsgE.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, com.fincatto.documentofiscal.nfe310.webservices.statusservico.consulta.NfeStatusServicoStub.NfeDadosMsg param) {
        org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
        emptyEnvelope.getBody().addChild(param.getOMElement(com.fincatto.documentofiscal.nfe310.webservices.statusservico.consulta.NfeStatusServicoStub.NfeDadosMsg.MY_QNAME, factory));
        return emptyEnvelope;
    }

    /* methods to provide back word compatibility */

    /**
     * get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type) throws org.apache.axis2.AxisFault {
        try {
            if (com.fincatto.documentofiscal.nfe310.webservices.statusservico.consulta.NfeStatusServicoStub.NfeCabecMsgE.class.equals(type)) {
                return com.fincatto.documentofiscal.nfe310.webservices.statusservico.consulta.NfeStatusServicoStub.NfeCabecMsgE.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
            if (com.fincatto.documentofiscal.nfe310.webservices.statusservico.consulta.NfeStatusServicoStub.NfeDadosMsg.class.equals(type)) {
                return com.fincatto.documentofiscal.nfe310.webservices.statusservico.consulta.NfeStatusServicoStub.NfeDadosMsg.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
            if (com.fincatto.documentofiscal.nfe310.webservices.statusservico.consulta.NfeStatusServicoStub.NfeStatusServicoNFResult.class.equals(type)) {
                return com.fincatto.documentofiscal.nfe310.webservices.statusservico.consulta.NfeStatusServicoStub.NfeStatusServicoNFResult.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
    }

    //https://nfe.sefaz.ba.gov.br/webservices/NfeStatusServico/NfeStatusServico.asmx
    public static class NfeCabecMsg implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = nfeCabecMsg
           Namespace URI = http://www.portalfiscal.inf.br/nfe/wsdl/NfeStatusServico
           Namespace Prefix = ns1
         */

        /**
         * field for VersaoDados
         */
        protected java.lang.String localVersaoDados;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localVersaoDadosTracker = false;

        /**
         * field for CUF
         */
        protected java.lang.String localCUF;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localCUFTracker = false;

        /**
         * field for ExtraAttributes
         * This was an Attribute!
         * This was an Array!
         */
        protected transient org.apache.axiom.om.OMAttribute[] localExtraAttributes;

        public boolean isVersaoDadosSpecified() {
            return localVersaoDadosTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getVersaoDados() {
            return localVersaoDados;
        }

        /**
         * Auto generated setter method
         *
         * @param param VersaoDados
         */
        public void setVersaoDados(java.lang.String param) {
            localVersaoDadosTracker = param != null;
            this.localVersaoDados = param;
        }

        public boolean isCUFSpecified() {
            return localCUFTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return java.lang.String
         */
        public java.lang.String getCUF() {
            return localCUF;
        }

        /**
         * Auto generated setter method
         *
         * @param param CUF
         */
        public void setCUF(java.lang.String param) {
            localCUFTracker = param != null;
            this.localCUF = param;
        }

        /**
         * Auto generated getter method
         *
         * @return org.apache.axiom.om.OMAttribute[]
         */
        public org.apache.axiom.om.OMAttribute[] getExtraAttributes() {
            return localExtraAttributes;
        }

        /**
         * validate the array for ExtraAttributes
         */
        protected void validateExtraAttributes(org.apache.axiom.om.OMAttribute[] param) {
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
        public void setExtraAttributes(org.apache.axiom.om.OMAttribute[] param) {
            validateExtraAttributes(param);
            this.localExtraAttributes = param;
        }

        /**
         * Auto generated add method for the array for convenience
         *
         * @param param org.apache.axiom.om.OMAttribute
         */
        public void addExtraAttributes(org.apache.axiom.om.OMAttribute param) {
            if (localExtraAttributes == null) {
                localExtraAttributes = new org.apache.axiom.om.OMAttribute[]{};
            }
            java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localExtraAttributes);
            list.add(param);
            this.localExtraAttributes = (org.apache.axiom.om.OMAttribute[]) list.toArray(new OMAttribute[0]);
        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix;
            java.lang.String namespace;
            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter, HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_STATUS_SERVICO);
                serializeCheckPrefix(namespacePrefix, xmlWriter);
            }
            if (localExtraAttributes != null) {
                for (OMAttribute localExtraAttribute : localExtraAttributes) {
                    writeAttribute(localExtraAttribute.getNamespace().getName(), localExtraAttribute.getLocalName(), localExtraAttribute.getAttributeValue(), xmlWriter);
                }
            }
            if (localVersaoDadosTracker) {
                namespace = HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_STATUS_SERVICO;
                writeStartElement(null, namespace, OPERATION_NAME, xmlWriter);
                if (localVersaoDados == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException("versaoDados cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localVersaoDados);
                }
                xmlWriter.writeEndElement();
            }
            if (localCUFTracker) {
                namespace = HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_STATUS_SERVICO;
                writeStartElement(null, namespace, "cUF", xmlWriter);
                if (localCUF == null) {
                    // write the nil attribute
                    throw new org.apache.axis2.databinding.ADBException("cUF cannot be null!!");
                } else {
                    xmlWriter.writeCharacters(localCUF);
                }
                xmlWriter.writeEndElement();
            }
            xmlWriter.writeEndElement();
        }

        private void serializeCheckPrefix(java.lang.String namespacePrefix, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", namespacePrefix + ":nfeCabecMsg", xmlWriter);
            } else {
                writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", NFE_CABEC_MSG, xmlWriter);
            }
        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_STATUS_SERVICO)) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }
                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
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
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
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
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
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
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
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

            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static NfeCabecMsg parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                NfeCabecMsg object = new NfeCabecMsg();
                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {
                    while (isNotStartOrEndElement(reader)) reader.next();
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
                            org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();
                            org.apache.axiom.om.OMAttribute attr = factory.createOMAttribute(reader.getAttributeLocalName(i), factory.createOMNamespace(reader.getAttributeNamespace(i), reader.getAttributePrefix(i)), reader.getAttributeValue(i));
                            // and add it to the extra attributes
                            object.addExtraAttributes(attr);
                        }
                    }
                    reader.next();
                    object = parsePart2(object, reader);
                    object = parsePart3(object, reader);
                    while (isNotStartOrEndElement(reader)) reader.next();
                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(UNEXPECTED_SUBELEMENT + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new javax.xml.stream.XMLStreamException(e);
                }
                return object;
            }

            private static boolean isNotStartOrEndElement(javax.xml.stream.XMLStreamReader reader) {
                return !reader.isStartElement() && !reader.isEndElement();
            }

            private static NfeCabecMsg parsePart1(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                if (reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.contains(":")) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;
                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);
                        if (!NFE_CABEC_MSG.equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (NfeCabecMsg) ExtensionMapper.getTypeObject(nsUri, type, reader);
                        }
                    }
                }
                return null;
            }

            private static NfeCabecMsg parsePart2(NfeCabecMsg object, javax.xml.stream.XMLStreamReader reader) throws XMLStreamException{
                java.lang.String nillableValue;
                while (isNotStartOrEndElement(reader)) reader.next();
                if ((reader.isStartElement() && new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_STATUS_SERVICO, OPERATION_NAME).equals(reader.getName())) || new javax.xml.namespace.QName("", OPERATION_NAME).equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue(XMLSCHEMA_INSTANCE, "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + OPERATION_NAME + "  cannot be null");
                    }
                    java.lang.String content = reader.getElementText();
                    object.setVersaoDados(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                    reader.next();
                } // End of if for expected property start element
                return object;
            }

            private static NfeCabecMsg parsePart3(NfeCabecMsg object, javax.xml.stream.XMLStreamReader reader) throws XMLStreamException {
                java.lang.String nillableValue;
                while (isNotStartOrEndElement(reader)) reader.next();
                if ((reader.isStartElement() && new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_STATUS_SERVICO, "cUF").equals(reader.getName())) || new javax.xml.namespace.QName("", "cUF").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue(XMLSCHEMA_INSTANCE, "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "cUF" + "  cannot be null");
                    }
                    java.lang.String content = reader.getElementText();
                    object.setCUF(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                    reader.next();
                } // End of if for expected property start element
                return object;
            }
                        
        } //end of factory class

        @Override
        public javax.xml.stream.XMLStreamReader getPullParser(final javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {
            final java.util.ArrayList elementList = new java.util.ArrayList();
            final java.util.ArrayList attribList = new java.util.ArrayList();
            if (this.localCUFTracker) {
                elementList.add(new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_STATUS_SERVICO, "cUF"));
                if (this.localCUF != null) {
                    elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localCUF));
                } else {
                    throw new org.apache.axis2.databinding.ADBException("cUF cannot be null!!");
                }
            }
            if (this.localVersaoDadosTracker) {
                elementList.add(new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_STATUS_SERVICO, OPERATION_NAME));
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
    }

    public static class ExtensionMapper {

        private ExtensionMapper() {
            throw new IllegalStateException(UTILITY_CLASS);
        }

        public static java.lang.Object getTypeObject(java.lang.String namespaceURI, java.lang.String typeName, javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            if (HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_STATUS_SERVICO.equals(namespaceURI) && NFE_CABEC_MSG.equals(typeName)) {
                return NfeCabecMsg.Factory.parse(reader);
            }
            throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
        }
    }

    public static class NfeCabecMsgE implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_STATUS_SERVICO, NFE_CABEC_MSG, "ns1");

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
            return localNfeCabecMsg;
        }

        /**
         * Auto generated setter method
         *
         * @param param NfeCabecMsg
         */
        public void setNfeCabecMsg(NfeCabecMsg param) {
            this.localNfeCabecMsg = param;
        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType) throws javax.xml.stream.XMLStreamException {
            //We can safely assume an element has only one type associated with it
            if (localNfeCabecMsg == null) {
                throw new org.apache.axis2.databinding.ADBException("nfeCabecMsg cannot be null!");
            }
            localNfeCabecMsg.serialize(MY_QNAME, xmlWriter);
        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_STATUS_SERVICO)) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }
                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
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
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
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
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
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
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
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

            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static NfeCabecMsgE parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                NfeCabecMsgE object = new NfeCabecMsgE();
                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {
                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                    currentQName = reader.getName();
                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    final java.util.ArrayList<String> handledAttributes = new java.util.ArrayList<>();
                    while (!reader.isEndElement()) {
                        if (reader.isStartElement()) {
                            if ((reader.isStartElement() && new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_STATUS_SERVICO, NFE_CABEC_MSG).equals(reader.getName())) || new javax.xml.namespace.QName("", NFE_CABEC_MSG).equals(reader.getName())) {
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
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new javax.xml.stream.XMLStreamException(e);
                }
                return object;
            }
        } //end of factory class

        @Override
        public javax.xml.stream.XMLStreamReader getPullParser(final javax.xml.namespace.QName qName) throws org.apache.axis2.databinding.ADBException {
            // We can safely assume an element has only one type associated with it
            return this.localNfeCabecMsg.getPullParser(NfeCabecMsgE.MY_QNAME);
        }
    }

    public static class NfeDadosMsg implements org.apache.axis2.databinding.ADBBean {

        private static final String NFE_DADOS_MSG = "nfeDadosMsg";

        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_STATUS_SERVICO, NFE_DADOS_MSG, "ns1");

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
            return localExtraElement;
        }

        /**
         * Auto generated setter method
         *
         * @param param ExtraElement
         */
        public void setExtraElement(org.apache.axiom.om.OMElement param) {
            this.localExtraElement = param;
        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix;
            java.lang.String namespace;
            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter, HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_STATUS_SERVICO);
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", namespacePrefix + ":nfeDadosMsg", xmlWriter);
                } else {
                    writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", NFE_DADOS_MSG, xmlWriter);
                }
            }
            if (localExtraElement != null) {
                localExtraElement.serialize(xmlWriter);
            } else {
                throw new org.apache.axis2.databinding.ADBException(EXTRA_ELEMENT_CANNOT_BE_NULL);
            }
            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_STATUS_SERVICO)) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }
                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
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
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
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
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
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
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
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

            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static NfeDadosMsg parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                NfeDadosMsg object = new NfeDadosMsg();
                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {
                    while (isNotStartOrEndElement(reader)) reader.next();
                    currentQName = reader.getName();
                    NfeDadosMsg varParse = parsePart1(reader);
                    if(varParse != null) {
                        return varParse;
                    }
                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    final java.util.ArrayList<String> handledAttributes = new java.util.ArrayList<>();
                    reader.next();
                    while (isNotStartOrEndElement(reader)) reader.next();
                    if (reader.isStartElement()) {
                        //use the QName from the parser as the name for the builder
                        javax.xml.namespace.QName startQname1 = reader.getName();
                        // We need to wrap the reader so that it produces a fake START_DOCUMENT event
                        // this is needed by the builder classes
                        org.apache.axis2.databinding.utils.NamedStaxOMBuilder builder1 = new org.apache.axis2.databinding.utils.NamedStaxOMBuilder(new org.apache.axis2.util.StreamWrapper(reader), startQname1);
                        object.setExtraElement(builder1.getOMElement());
                        reader.next();
                    } // End of if for expected property start element
                    else {
                        // 1 - A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(UNEXPECTED_SUBELEMENT + reader.getName());
                    }
                    while (isNotStartOrEndElement(reader)) reader.next();
                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(UNEXPECTED_SUBELEMENT + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new javax.xml.stream.XMLStreamException(e);
                }
                return object;
            }

            private static boolean isNotStartOrEndElement(javax.xml.stream.XMLStreamReader reader) {
                return !reader.isStartElement() && !reader.isEndElement();
            }

            private static NfeDadosMsg parsePart1(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                if (reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.contains(":")) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;
                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);
                        if (!NFE_DADOS_MSG.equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (NfeDadosMsg) ExtensionMapper.getTypeObject(nsUri, type, reader);
                        }
                    }
                }
                return null;
            }
        } //end of factory class

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
    }

    public static class NfeStatusServicoNFResult implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_STATUS_SERVICO, NFE_STATUS_SERVICO_NF_RESULT, "ns1");

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
            return localExtraElement;
        }

        /**
         * Auto generated setter method
         *
         * @param param ExtraElement
         */
        public void setExtraElement(org.apache.axiom.om.OMElement param) {
            this.localExtraElement = param;
        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory) {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix;
            java.lang.String namespace;
            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
            if (serializeType) {
                java.lang.String namespacePrefix = registerPrefix(xmlWriter, HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_STATUS_SERVICO);
                if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", namespacePrefix + ":nfeStatusServicoNFResult", xmlWriter);
                } else {
                    writeAttribute("xsi", XMLSCHEMA_INSTANCE, "type", NFE_STATUS_SERVICO_NF_RESULT, xmlWriter);
                }
            }
            if (localExtraElement != null) {
                localExtraElement.serialize(xmlWriter);
            } else {
                throw new org.apache.axis2.databinding.ADBException(EXTRA_ELEMENT_CANNOT_BE_NULL);
            }
            xmlWriter.writeEndElement();
        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if (namespace.equals(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_NFE_STATUS_SERVICO)) {
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }
                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }

        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
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
        private void writeAttribute(java.lang.String namespace, java.lang.String attName, java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName, attValue);
            } else {
                xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
            }
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName, javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String attributeNamespace = qname.getNamespaceURI();
            java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
            if (attributePrefix == null) {
                attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
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
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
            }
        }

        /**
         * method to handle Qnames
         */
        private void writeQName(javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
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
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
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
            
            private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static NfeStatusServicoNFResult parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                NfeStatusServicoNFResult object = new NfeStatusServicoNFResult();
                int event;
                javax.xml.namespace.QName currentQName = null;
                java.lang.String nillableValue = null;
                java.lang.String prefix = "";
                java.lang.String namespaceuri = "";
                try {
                    while (isNotStartOrEndElement(reader)) reader.next();
                    currentQName = reader.getName();
                    NfeStatusServicoNFResult varParse = parsePart1(reader);
                    if(varParse != null) {
                        return varParse;
                    }
                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.
                    final java.util.ArrayList<String> handledAttributes = new java.util.ArrayList<>();
                    reader.next();
                    while (isNotStartOrEndElement(reader)) reader.next();
                    if (reader.isStartElement()) {
                        //use the QName from the parser as the name for the builder
                        javax.xml.namespace.QName startQname1 = reader.getName();
                        // We need to wrap the reader so that it produces a fake START_DOCUMENT event
                        // this is needed by the builder classes
                        org.apache.axis2.databinding.utils.NamedStaxOMBuilder builder1 = new org.apache.axis2.databinding.utils.NamedStaxOMBuilder(new org.apache.axis2.util.StreamWrapper(reader), startQname1);
                        object.setExtraElement(builder1.getOMElement());
                        reader.next();
                    } // End of if for expected property start element
                    else {
                        // 1 - A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(UNEXPECTED_SUBELEMENT + reader.getName());
                    }
                    while (isNotStartOrEndElement(reader)) reader.next();
                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(UNEXPECTED_SUBELEMENT + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    throw new javax.xml.stream.XMLStreamException(e);
                }
                return object;
            }

            private static boolean isNotStartOrEndElement(javax.xml.stream.XMLStreamReader reader) {
                return !reader.isStartElement() && !reader.isEndElement();
            }

            private static NfeStatusServicoNFResult parsePart1(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
                if (reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue(XMLSCHEMA_INSTANCE, "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.contains(":")) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;
                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);
                        if (!NFE_STATUS_SERVICO_NF_RESULT.equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (NfeStatusServicoNFResult) ExtensionMapper.getTypeObject(nsUri, type, reader);
                        }
                    }
                }
                return null;
            }
        } //end of factory class

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
    }
}
