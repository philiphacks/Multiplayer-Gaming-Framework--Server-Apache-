/**
 * GamingServiceBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package be.tbs.www.mgf.definitions;

public class GamingServiceBindingStub extends org.apache.axis.client.Stub implements be.tbs.www.mgf.definitions.GamingService_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[3];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("JoinOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "JoinRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", ">JoinRequest"), be.tbs.www.mgf.schemas.JoinRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", ">JoinReply"));
        oper.setReturnClass(be.tbs.www.mgf.schemas.JoinReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "JoinReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("StatusOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "StatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", ">StatusRequest"), be.tbs.www.mgf.schemas.StatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", ">StatusReply"));
        oper.setReturnClass(be.tbs.www.mgf.schemas.StatusReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "StatusReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LeaveOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "LeaveRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", ">LeaveRequest"), be.tbs.www.mgf.schemas.LeaveRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", ">LeaveReply"));
        oper.setReturnClass(be.tbs.www.mgf.schemas.LeaveReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "LeaveReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

    }

    public GamingServiceBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public GamingServiceBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public GamingServiceBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", ">JoinReply");
            cachedSerQNames.add(qName);
            cls = be.tbs.www.mgf.schemas.JoinReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", ">JoinRequest");
            cachedSerQNames.add(qName);
            cls = be.tbs.www.mgf.schemas.JoinRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", ">LeaveReply");
            cachedSerQNames.add(qName);
            cls = be.tbs.www.mgf.schemas.LeaveReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", ">LeaveRequest");
            cachedSerQNames.add(qName);
            cls = be.tbs.www.mgf.schemas.LeaveRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", ">StatusReply");
            cachedSerQNames.add(qName);
            cls = be.tbs.www.mgf.schemas.StatusReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", ">StatusRequest");
            cachedSerQNames.add(qName);
            cls = be.tbs.www.mgf.schemas.StatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "Error");
            cachedSerQNames.add(qName);
            cls = be.tbs.www.mgf.schemas.Error.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "Message");
            cachedSerQNames.add(qName);
            cls = be.tbs.www.mgf.schemas.Message.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "Ping");
            cachedSerQNames.add(qName);
            cls = be.tbs.www.mgf.schemas.Ping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "PlayerDescriptor");
            cachedSerQNames.add(qName);
            cls = be.tbs.www.mgf.schemas.PlayerDescriptor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "Pong");
            cachedSerQNames.add(qName);
            cls = be.tbs.www.mgf.schemas.Pong.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "Reply");
            cachedSerQNames.add(qName);
            cls = be.tbs.www.mgf.schemas.Reply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "Request");
            cachedSerQNames.add(qName);
            cls = be.tbs.www.mgf.schemas.Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "StatusProperty");
            cachedSerQNames.add(qName);
            cls = be.tbs.www.mgf.schemas.StatusProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public be.tbs.www.mgf.schemas.JoinReply joinOperation(be.tbs.www.mgf.schemas.JoinRequest joinRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://192.168.1.3:8080/Join");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "JoinOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {joinRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (be.tbs.www.mgf.schemas.JoinReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (be.tbs.www.mgf.schemas.JoinReply) org.apache.axis.utils.JavaUtils.convert(_resp, be.tbs.www.mgf.schemas.JoinReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public be.tbs.www.mgf.schemas.StatusReply statusOperation(be.tbs.www.mgf.schemas.StatusRequest statusRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://192.168.1.3:8080/Status");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "StatusOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {statusRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (be.tbs.www.mgf.schemas.StatusReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (be.tbs.www.mgf.schemas.StatusReply) org.apache.axis.utils.JavaUtils.convert(_resp, be.tbs.www.mgf.schemas.StatusReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public be.tbs.www.mgf.schemas.LeaveReply leaveOperation(be.tbs.www.mgf.schemas.LeaveRequest leaveRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://192.168.1.3:8080/Leave");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "LeaveOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {leaveRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (be.tbs.www.mgf.schemas.LeaveReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (be.tbs.www.mgf.schemas.LeaveReply) org.apache.axis.utils.JavaUtils.convert(_resp, be.tbs.www.mgf.schemas.LeaveReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
