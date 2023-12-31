package com.fincatto.documentofiscal.nfe400.webservices.consultacadastro;


import org.apache.axis2.client.FaultMapKey;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class MTCadConsultaCadastro4Stub extends org.apache.axis2.client.Stub {

    private static final String CONSULTA_CADASTRO = "consultaCadastro";
    public static final String NFE_DADOS_MSG_TYPE_0 = "nfeDadosMsg_type0";
    public static final String CONSULTA_CADASTRO_RESULT_TYPE_0 = "consultaCadastroResult_type0";
    public static final String NFE_RESULT_MSG = "nfeResultMsg";
    public static final String CONSULTA_CADASTRO_RESULT = "consultaCadastroResult";
    public static final String NFE_DADOS_MSG = "nfeDadosMsg";
    public static final String HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_4 = "http://www.portalfiscal.inf.br/nfe/wsdl/CadConsultaCadastro4";
    public static final String XMLSCHEMA_INSTANCE = "http://www.w3.org/2001/XMLSchema-instance";
    public static final String UNEXPECTED_SUBELEMENT = "Unexpected subelement ";
    private static int counter = 0;
    protected org.apache.axis2.description.AxisOperation[] operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap<FaultMapKey, String> faultExceptionNameMap = new java.util.HashMap<>();

    private java.util.HashMap<FaultMapKey, String> faultExceptionClassNameMap = new java.util.HashMap<>();

    private java.util.HashMap<FaultMapKey, String> faultMessageMap = new java.util.HashMap<>();

    private static final String UTILITY_CLASS_EXCEPTION_MESSAGE = "Utility class";

    /**
     * Constructor that takes in a configContext
     */
    public MTCadConsultaCadastro4Stub(org.apache.axis2.context.ConfigurationContext configurationContext, String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public MTCadConsultaCadastro4Stub(org.apache.axis2.context.ConfigurationContext configurationContext, String targetEndpoint, boolean useSeparateListener) throws org.apache.axis2.AxisFault {
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        //Set the soap version
        _serviceClient.getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);
    }

    /**
     * Constructor taking the target endpoint
     */
    public MTCadConsultaCadastro4Stub(String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }

    private static synchronized String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }

        counter = counter + 1;

        return Long.toString(System.currentTimeMillis()) +
                "_" + counter;
    }

    private void populateAxisService() {
        //creating the Service with a unique name
        this._service = new org.apache.axis2.description.AxisService("CadConsultaCadastro4" + getUniqueSuffix());
        this.addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation operation;

        this.operations = new org.apache.axis2.description.AxisOperation[1];

        operation = new org.apache.axis2.description.OutInAxisOperation();

        operation.setName(new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_4,CONSULTA_CADASTRO));
        this._service.addOperation(operation);

        this.operations[0] = operation;
    }

    //populates the faults
    private void populateFaults() {
        //empty method
    }

    public NfeResultMsg consultaCadastro(ConsultaCadastro consultaCadastro0) throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext messageContext = null;

        try {
            org.apache.axis2.client.OperationClient operationClient = _serviceClient.createClient(operations[0].getName());
            operationClient.getOptions().setAction("http://www.portalfiscal.inf.br/nfe/wsdl/CadConsultaCadastro4/consultaCadastro");
            operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");

            // create a message context
            messageContext = new org.apache.axis2.context.MessageContext();

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = this.toEnvelope(getFactory(operationClient.getOptions().getSoapVersionURI()),consultaCadastro0);

            //adding SOAP soap_headers
            this._serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            operationClient.addMessageContext(messageContext);

            //execute the operation client
            operationClient.execute(true);

            org.apache.axis2.context.MessageContext returnMessageContext = operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope returnEnv = returnMessageContext.getEnvelope();

            Object object = fromOM(returnEnv.getBody()
                            .getFirstElement(),
                    NfeResultMsg.class);

            return (NfeResultMsg) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                        new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), CONSULTA_CADASTRO))) {
                    //make the fault by reflection
                    try {
                        String exceptionClassName = faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), CONSULTA_CADASTRO));
                        Class<? extends Throwable> exceptionClass = Class.forName(exceptionClassName).asSubclass(Throwable.class);
                        java.lang.reflect.Constructor<? extends Throwable> constructor = exceptionClass.getConstructor(String.class);
                        Throwable ex = constructor.newInstance(f.getMessage());


                        //message class
                        String messageClassName = faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), CONSULTA_CADASTRO));
                        Class<?> messageClass = Class.forName(messageClassName);
                        Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                messageClass);
                        m.invoke(ex, messageObject);

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (ClassCastException | ClassNotFoundException| NoSuchMethodException | java.lang.reflect.InvocationTargetException | IllegalAccessException | InstantiationException e  ) {
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

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,ConsultaCadastro param)throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(ConsultaCadastro.MY_QNAME,factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */

    /**
     * get the default envelope
     */

    private Object fromOM(org.apache.axiom.om.OMElement param,
                          Class<?> type) throws org.apache.axis2.AxisFault {
        try {
            if (ConsultaCadastro.class.equals(
                    type)) {
                return ConsultaCadastro.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (NfeResultMsg.class.equals(
                    type)) {
                return NfeResultMsg.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }

    public static class ExtensionMapper {
        private ExtensionMapper() {
            throw new IllegalStateException(UTILITY_CLASS_EXCEPTION_MESSAGE);
        }

        public static Object getTypeObject(
                String namespaceURI, String typeName,
                javax.xml.stream.XMLStreamReader reader) throws XMLStreamException {
            if (HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_4.equals(
                    namespaceURI) && NFE_DADOS_MSG_TYPE_0.equals(typeName)) {
                return NfeDadosMsgType0.Factory.parse(reader);
            }

            if (HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_4.equals(
                    namespaceURI) &&
                    CONSULTA_CADASTRO_RESULT_TYPE_0.equals(typeName)) {
                return ConsultaCadastroResultType0.Factory.parse(reader);
            }

            throw new org.apache.axis2.databinding.ADBException(
                    "Unsupported type " + namespaceURI + " " + typeName);
        }
    }

    public static class NfeResultMsg implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_4,
                NFE_RESULT_MSG, "ns1");

        /**
         * field for ConsultaCadastroResult
         */
        protected ConsultaCadastroResultType0 localConsultaCadastroResult;

        /*  This tracker boolean wil be used to detect whether the user called the set method
         *   for this attribute. It will be used to determine whether to include this field
         *   in the serialized XML
         */
        protected boolean localConsultaCadastroResultTracker = false;

        public boolean isConsultaCadastroResultSpecified() {
            return localConsultaCadastroResultTracker;
        }

        /**
         * Auto generated getter method
         *
         * @return ConsultaCadastroResult_type0
         */
        public ConsultaCadastroResultType0 getConsultaCadastroResult() {
            return localConsultaCadastroResult;
        }

        /**
         * Auto generated setter method
         *
         * @param param ConsultaCadastroResult
         */
        public void setConsultaCadastroResult(
                ConsultaCadastroResultType0 param) {
            localConsultaCadastroResultTracker = param != null;

            this.localConsultaCadastroResult = param;
        }

        @Override
        public XMLStreamReader getPullParser(QName adbBeanQName) throws XMLStreamException {
            return null;
        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory)
                throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, MY_QNAME));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
                throws javax.xml.stream.XMLStreamException {
            String prefix = null;
            String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                    xmlWriter);

            if (serializeType) {
                String namespacePrefix = registerPrefix(xmlWriter,
                        HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_4);

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                            XMLSCHEMA_INSTANCE, "type",
                            namespacePrefix + ":nfeResultMsg", xmlWriter);
                } else {
                    writeAttribute("xsi",
                            XMLSCHEMA_INSTANCE, "type",
                            NFE_RESULT_MSG, xmlWriter);
                }
            }

            if (localConsultaCadastroResultTracker) {
                if (localConsultaCadastroResult == null) {
                    throw new org.apache.axis2.databinding.ADBException(
                            "consultaCadastroResult cannot be null!!");
                }

                localConsultaCadastroResult.serialize(new javax.xml.namespace.QName(
                        HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_4,
                        CONSULTA_CADASTRO_RESULT), xmlWriter);
            }

            xmlWriter.writeEndElement();
        }

        private static String generatePrefix(
                String namespace) {
            if (namespace.equals(
                    HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_4)) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix,
                                       String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);

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
        private void writeAttribute(String prefix,
                                    String namespace, String attName,
                                    String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                        attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(
                javax.xml.stream.XMLStreamWriter xmlWriter,
                String namespace)
                throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);

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
                throw new IllegalStateException(UTILITY_CLASS_EXCEPTION_MESSAGE);
            }

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static NfeResultMsg parse(
                    javax.xml.stream.XMLStreamReader reader)
                    throws XMLStreamException {
                NfeResultMsg object = new NfeResultMsg();

                try {
                    while (isNotStartOrEndElement(reader))
                        reader.next();

                    reader.getName();

                    NfeResultMsg varParse = parsePart1(reader);
                    if(varParse != null) {
                        return varParse;
                    }

                    reader.next();

                    while (isNotStartOrEndElement(reader))
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                    HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_4,
                                    CONSULTA_CADASTRO_RESULT).equals(
                                    reader.getName())) ||
                            new javax.xml.namespace.QName("",
                                    CONSULTA_CADASTRO_RESULT).equals(
                                    reader.getName())) {
                        object.setConsultaCadastroResult(ConsultaCadastroResultType0.Factory.parse(
                                reader));

                        reader.next();
                    } // End of if for expected property start element

                    while (isNotStartOrEndElement(reader))
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                                UNEXPECTED_SUBELEMENT + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    //Ignore catch
                    throw e;
                }

                return object;
            }

            private static boolean isNotStartOrEndElement(javax.xml.stream.XMLStreamReader reader) {
                return !reader.isStartElement() && !reader.isEndElement();
            }

            private static NfeResultMsg parsePart1(javax.xml.stream.XMLStreamReader reader) 
            throws XMLStreamException
            {
                if (reader.getAttributeValue(
                        XMLSCHEMA_INSTANCE,
                        "type") != null) {
                    String fullTypeName = reader.getAttributeValue(XMLSCHEMA_INSTANCE,
                            "type");

                    if (fullTypeName != null) {
                        String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        String type = fullTypeName.substring(fullTypeName.indexOf(
                                ":") + 1);

                        if (!NFE_RESULT_MSG.equals(type)) {
                            //find namespace for the prefix
                            String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (NfeResultMsg) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }
                return null;
            }
        } //end of factory class
    }

    public static class ConsultaCadastroResultType0 implements org.apache.axis2.databinding.ADBBean {

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

        @Override
        public XMLStreamReader getPullParser(QName adbBeanQName) throws XMLStreamException {
            return null;
        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory)
                throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, parentQName));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
                throws javax.xml.stream.XMLStreamException {
            String prefix = null;
            String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                    xmlWriter);

            if (serializeType) {
                String namespacePrefix = registerPrefix(xmlWriter,
                        HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_4);

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                            XMLSCHEMA_INSTANCE, "type",
                            namespacePrefix + ":consultaCadastroResult_type0",
                            xmlWriter);
                } else {
                    writeAttribute("xsi",
                            XMLSCHEMA_INSTANCE, "type",
                            CONSULTA_CADASTRO_RESULT_TYPE_0, xmlWriter);
                }
            }

            if (localExtraElement != null) {
                localExtraElement.serialize(xmlWriter);
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "extraElement cannot be null!!");
            }

            xmlWriter.writeEndElement();
        }

        private static String generatePrefix(String namespace) {
            if (namespace.equals(
                    HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_4)) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix,
                                       String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);

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
        private void writeAttribute(String prefix,
                                    String namespace, String attName,
                                    String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                        attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }


        /**
         * Register a namespace prefix
         */
        private String registerPrefix(
                javax.xml.stream.XMLStreamWriter xmlWriter,
                String namespace)
                throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);

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
                throw new IllegalStateException(UTILITY_CLASS_EXCEPTION_MESSAGE);
            }

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ConsultaCadastroResultType0 parse(
                    javax.xml.stream.XMLStreamReader reader)
                    throws XMLStreamException {
                ConsultaCadastroResultType0 object = new ConsultaCadastroResultType0();

                try {
                    while (isNotStartOrEndElement(reader))
                        reader.next();

                    reader.getName();

                    ConsultaCadastroResultType0 varParse = parsePart1(reader);
                    if(varParse != null) {
                        return varParse;
                    }

                    // Note all attributes that were handled. Used to differ normal attributes
                    // from anyAttributes.

                    reader.next();

                    while (isNotStartOrEndElement(reader))
                        reader.next();

                    if (reader.isStartElement()) {
                        //use the QName from the parser as the name for the builder
                        javax.xml.namespace.QName startQname1 = reader.getName();

                        // We need to wrap the reader so that it produces a fake START_DOCUMENT event
                        // this is needed by the builder classes
                        org.apache.axis2.databinding.utils.NamedStaxOMBuilder builder1 =
                                new org.apache.axis2.databinding.utils.NamedStaxOMBuilder(new org.apache.axis2.util.StreamWrapper(
                                        reader), startQname1);
                        object.setExtraElement(builder1.getOMElement());

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // 1 - A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                                UNEXPECTED_SUBELEMENT + reader.getName());
                    }

                    while (isNotStartOrEndElement(reader))
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                                UNEXPECTED_SUBELEMENT + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    //Ignore catch
                    throw e;
                }

                return object;
            }

            private static boolean isNotStartOrEndElement(javax.xml.stream.XMLStreamReader reader) {
                return !reader.isStartElement() && !reader.isEndElement();
            }

            private static ConsultaCadastroResultType0 parsePart1 (javax.xml.stream.XMLStreamReader reader) throws XMLStreamException {
                if (reader.getAttributeValue(
                        XMLSCHEMA_INSTANCE,
                        "type") != null) {
                    String fullTypeName = reader.getAttributeValue(XMLSCHEMA_INSTANCE,
                            "type");

                    if (fullTypeName != null) {
                        String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        String type = fullTypeName.substring(fullTypeName.indexOf(
                                ":") + 1);

                        if (!CONSULTA_CADASTRO_RESULT_TYPE_0.equals(type)) {
                            //find namespace for the prefix
                            String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (ConsultaCadastroResultType0) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }
                return null;
            }
        } //end of factory class
    }

    public static class NfeDadosMsgType0 implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
           name = nfeDadosMsg_type0
           Namespace URI = http://www.portalfiscal.inf.br/nfe/wsdl/CadConsultaCadastro4
           Namespace Prefix = ns1
         */

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

        @Override
        public XMLStreamReader getPullParser(QName adbBeanQName) throws XMLStreamException {
            return null;
        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(
                final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory)
                throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, parentQName));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
                throws javax.xml.stream.XMLStreamException {
            String prefix = null;
            String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                    xmlWriter);

            if (serializeType) {
                String namespacePrefix = registerPrefix(xmlWriter,
                        HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_4);

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                            XMLSCHEMA_INSTANCE, "type",
                            namespacePrefix + ":nfeDadosMsg_type0", xmlWriter);
                } else {
                    writeAttribute("xsi",
                            XMLSCHEMA_INSTANCE, "type",
                            NFE_DADOS_MSG_TYPE_0, xmlWriter);
                }
            }

            if (localExtraElement != null) {
                localExtraElement.serialize(xmlWriter);
            } else {
                throw new org.apache.axis2.databinding.ADBException(
                        "extraElement cannot be null!!");
            }

            xmlWriter.writeEndElement();
        }

        private static String generatePrefix(
                String namespace) {
            if (namespace.equals(
                    HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_4)) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix,
                                       String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);

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
        private void writeAttribute(String prefix,
                                    String namespace, String attName,
                                    String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                        attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }

        /**
         * Register a namespace prefix
         */
        private String registerPrefix(
                javax.xml.stream.XMLStreamWriter xmlWriter,
                String namespace)
                throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);

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
                throw new IllegalStateException(UTILITY_CLASS_EXCEPTION_MESSAGE);
            }

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static NfeDadosMsgType0 parse(
                    javax.xml.stream.XMLStreamReader reader)
                    throws XMLStreamException {
                NfeDadosMsgType0 object = new NfeDadosMsgType0();

                try {
                    while (isNotStartOrEndElement(reader))
                        reader.next();

                    reader.getName();

                    NfeDadosMsgType0 varParse = parsePart1(reader);
                    if(varParse != null) {
                        return varParse;
                    }

                    reader.next();

                    while (isNotStartOrEndElement(reader))
                        reader.next();

                    if (reader.isStartElement()) {
                        //use the QName from the parser as the name for the builder
                        javax.xml.namespace.QName startQname1 = reader.getName();

                        // We need to wrap the reader so that it produces a fake START_DOCUMENT event
                        // this is needed by the builder classes
                        org.apache.axis2.databinding.utils.NamedStaxOMBuilder builder1 =
                                new org.apache.axis2.databinding.utils.NamedStaxOMBuilder(new org.apache.axis2.util.StreamWrapper(
                                        reader), startQname1);
                        object.setExtraElement(builder1.getOMElement());

                        reader.next();
                    } // End of if for expected property start element

                    else {
                        // 1 - A start element we are not expecting indicates an invalid parameter was passed
                        throw new org.apache.axis2.databinding.ADBException(
                                UNEXPECTED_SUBELEMENT + reader.getName());
                    }

                    while (isNotStartOrEndElement(reader))
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                                UNEXPECTED_SUBELEMENT + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    //Ignore catch
                    throw e;
                }

                return object;
            }

            private static boolean isNotStartOrEndElement(javax.xml.stream.XMLStreamReader reader) {
                return !reader.isStartElement() && !reader.isEndElement();
            }

            private static NfeDadosMsgType0 parsePart1(javax.xml.stream.XMLStreamReader reader) throws XMLStreamException {
                if (reader.getAttributeValue(
                        XMLSCHEMA_INSTANCE,
                        "type") != null) {
                    String fullTypeName = reader.getAttributeValue(XMLSCHEMA_INSTANCE,
                            "type");

                    if (fullTypeName != null) {
                        String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        String type = fullTypeName.substring(fullTypeName.indexOf(
                                ":") + 1);

                        if (!NFE_DADOS_MSG_TYPE_0.equals(type)) {
                            //find namespace for the prefix
                            String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (NfeDadosMsgType0) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }
                return null;
            }
        } //end of factory class
    }

    public static class ConsultaCadastro implements org.apache.axis2.databinding.ADBBean {
        public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_4,CONSULTA_CADASTRO, "ns1");

        protected NfeDadosMsgType0 localNfeDadosMsg;
        protected boolean localNfeDadosMsgTracker = false;

        public boolean isNfeDadosMsgSpecified() {
            return localNfeDadosMsgTracker;
        }

        public NfeDadosMsgType0 getNfeDadosMsg() {
            return localNfeDadosMsg;
        }

        public void setNfeDadosMsg(NfeDadosMsgType0 param) {
            localNfeDadosMsgTracker = param != null;
            this.localNfeDadosMsg = param;
        }

        @Override
        public XMLStreamReader getPullParser(QName adbBeanQName) throws XMLStreamException {
            return null;
        }

        /**
         * @param parentQName
         * @param factory
         * @return org.apache.axiom.om.OMElement
         */
        public org.apache.axiom.om.OMElement getOMElement(final javax.xml.namespace.QName parentQName,
                final org.apache.axiom.om.OMFactory factory)
                throws org.apache.axis2.databinding.ADBException {
            return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                    this, MY_QNAME));
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            serialize(parentQName, xmlWriter, false);
        }

        public void serialize(final javax.xml.namespace.QName parentQName,
                              javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
                throws javax.xml.stream.XMLStreamException {
            String prefix = null;
            String namespace = null;

            prefix = parentQName.getPrefix();
            namespace = parentQName.getNamespaceURI();
            writeStartElement(prefix, namespace, parentQName.getLocalPart(),
                    xmlWriter);

            if (serializeType) {
                String namespacePrefix = registerPrefix(xmlWriter,
                        HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_4);

                if ((namespacePrefix != null) &&
                        (namespacePrefix.trim().length() > 0)) {
                    writeAttribute("xsi",
                            XMLSCHEMA_INSTANCE, "type",
                            namespacePrefix + ":consultaCadastro", xmlWriter);
                } else {
                    writeAttribute("xsi",
                            XMLSCHEMA_INSTANCE, "type",
                            CONSULTA_CADASTRO, xmlWriter);
                }
            }

            if (localNfeDadosMsgTracker) {
                if (localNfeDadosMsg == null) {
                    throw new org.apache.axis2.databinding.ADBException(
                            "nfeDadosMsg cannot be null!!");
                }

                localNfeDadosMsg.serialize(new javax.xml.namespace.QName(
                        HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_4,
                        NFE_DADOS_MSG), xmlWriter);
            }

            xmlWriter.writeEndElement();
        }

        private static String generatePrefix(
                String namespace) {
            if (namespace.equals(
                    HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_4)) {
                return "ns1";
            }

            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(String prefix,
                                       String namespace, String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);

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
        private void writeAttribute(String prefix,
                                    String namespace, String attName,
                                    String attValue,
                                    javax.xml.stream.XMLStreamWriter xmlWriter)
                throws javax.xml.stream.XMLStreamException {
            String writerPrefix = xmlWriter.getPrefix(namespace);

            if (writerPrefix != null) {
                xmlWriter.writeAttribute(writerPrefix, namespace, attName,
                        attValue);
            } else {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
                xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
            }
        }


        /**
         * Register a namespace prefix
         */
        private String registerPrefix(
                javax.xml.stream.XMLStreamWriter xmlWriter,
                String namespace)
                throws javax.xml.stream.XMLStreamException {
            String prefix = xmlWriter.getPrefix(namespace);

            if (prefix == null) {
                prefix = generatePrefix(namespace);

                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

                while (true) {
                    String uri = nsContext.getNamespaceURI(prefix);

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
                throw new IllegalStateException(UTILITY_CLASS_EXCEPTION_MESSAGE);
            }

            /**
             * static method to create the object
             * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
             * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
             * Postcondition: If this object is an element, the reader is positioned at its end element
             * If this object is a complex type, the reader is positioned at the end element of its outer element
             */
            public static ConsultaCadastro parse(
                    javax.xml.stream.XMLStreamReader reader)
                    throws XMLStreamException {
                ConsultaCadastro object = new ConsultaCadastro();

                try {
                    while (isNotStartOrEndElement(reader))
                        reader.next();

                    reader.getName();

                    ConsultaCadastro varParse = parsePart1 (reader);
                    if(varParse != null) {
                        return varParse;
                    }

                    reader.next();

                    while (isNotStartOrEndElement(reader))
                        reader.next();

                    if ((reader.isStartElement() &&
                            new javax.xml.namespace.QName(
                                    HTTP_WWW_PORTALFISCAL_INF_BR_NFE_WSDL_CAD_CONSULTA_CADASTRO_4,
                                    NFE_DADOS_MSG).equals(reader.getName())) ||
                            new javax.xml.namespace.QName("", NFE_DADOS_MSG).equals(
                                    reader.getName())) {
                        object.setNfeDadosMsg(NfeDadosMsgType0.Factory.parse(
                                reader));

                        reader.next();
                    } // End of if for expected property start element

                    while (isNotStartOrEndElement(reader))
                        reader.next();

                    if (reader.isStartElement()) {
                        // 2 - A start element we are not expecting indicates a trailing invalid property
                        throw new org.apache.axis2.databinding.ADBException(
                                UNEXPECTED_SUBELEMENT + reader.getName());
                    }
                } catch (javax.xml.stream.XMLStreamException e) {
                    // Ignore catch
                    throw e;
                }

                return object;
            }

            private static boolean isNotStartOrEndElement(javax.xml.stream.XMLStreamReader reader) {
                return !reader.isStartElement() && !reader.isEndElement();
            }

            private static ConsultaCadastro parsePart1(javax.xml.stream.XMLStreamReader reader) throws XMLStreamException {
                if (reader.getAttributeValue(
                        XMLSCHEMA_INSTANCE,
                        "type") != null) {
                    String fullTypeName = reader.getAttributeValue(XMLSCHEMA_INSTANCE,
                            "type");

                    if (fullTypeName != null) {
                        String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        String type = fullTypeName.substring(fullTypeName.indexOf(
                                ":") + 1);

                        if (!CONSULTA_CADASTRO.equals(type)) {
                            //find namespace for the prefix
                            String nsUri = reader.getNamespaceContext()
                                    .getNamespaceURI(nsPrefix);

                            return (ConsultaCadastro) ExtensionMapper.getTypeObject(nsUri,
                                    type, reader);
                        }
                    }
                }
                return null;
            }
        } //end of factory class
    }
}