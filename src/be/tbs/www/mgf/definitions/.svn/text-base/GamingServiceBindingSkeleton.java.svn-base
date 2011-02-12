/**
 * GamingServiceBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package be.tbs.www.mgf.definitions;

public class GamingServiceBindingSkeleton implements be.tbs.www.mgf.definitions.GamingService_PortType, org.apache.axis.wsdl.Skeleton {
    private be.tbs.www.mgf.definitions.GamingService_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "JoinRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", ">JoinRequest"), be.tbs.www.mgf.schemas.JoinRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("joinOperation", _params, new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "JoinReply"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", ">JoinReply"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "JoinOperation"));
        _oper.setSoapAction("http://192.168.1.3:8080/Join");
        _myOperationsList.add(_oper);
        if (_myOperations.get("joinOperation") == null) {
            _myOperations.put("joinOperation", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("joinOperation")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "StatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", ">StatusRequest"), be.tbs.www.mgf.schemas.StatusRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("statusOperation", _params, new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "StatusReply"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", ">StatusReply"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "StatusOperation"));
        _oper.setSoapAction("http://192.168.1.3:8080/Status");
        _myOperationsList.add(_oper);
        if (_myOperations.get("statusOperation") == null) {
            _myOperations.put("statusOperation", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("statusOperation")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "LeaveRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", ">LeaveRequest"), be.tbs.www.mgf.schemas.LeaveRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("leaveOperation", _params, new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "LeaveReply"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", ">LeaveReply"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "LeaveOperation"));
        _oper.setSoapAction("http://192.168.1.3:8080/Leave");
        _myOperationsList.add(_oper);
        if (_myOperations.get("leaveOperation") == null) {
            _myOperations.put("leaveOperation", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("leaveOperation")).add(_oper);
    }

    public GamingServiceBindingSkeleton() {
        this.impl = new be.tbs.www.mgf.definitions.GamingServiceBindingImpl();
    }

    public GamingServiceBindingSkeleton(be.tbs.www.mgf.definitions.GamingService_PortType impl) {
        this.impl = impl;
    }
    public be.tbs.www.mgf.schemas.JoinReply joinOperation(be.tbs.www.mgf.schemas.JoinRequest joinRequest) throws java.rmi.RemoteException
    {
        be.tbs.www.mgf.schemas.JoinReply ret = impl.joinOperation(joinRequest);
        return ret;
    }

    public be.tbs.www.mgf.schemas.StatusReply statusOperation(be.tbs.www.mgf.schemas.StatusRequest statusRequest) throws java.rmi.RemoteException
    {
        be.tbs.www.mgf.schemas.StatusReply ret = impl.statusOperation(statusRequest);
        return ret;
    }

    public be.tbs.www.mgf.schemas.LeaveReply leaveOperation(be.tbs.www.mgf.schemas.LeaveRequest leaveRequest) throws java.rmi.RemoteException
    {
        be.tbs.www.mgf.schemas.LeaveReply ret = impl.leaveOperation(leaveRequest);
        return ret;
    }

}
