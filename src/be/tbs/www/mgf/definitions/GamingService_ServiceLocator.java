/**
 * GamingService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package be.tbs.www.mgf.definitions;

public class GamingService_ServiceLocator extends org.apache.axis.client.Service implements be.tbs.www.mgf.definitions.GamingService_Service {

    public GamingService_ServiceLocator() {
    }


    public GamingService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GamingService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GamingServiceBindingPort
    private java.lang.String GamingServiceBindingPort_address = "http://3bstest.appspot.com/cloudserve/GamingService.soap";

    public java.lang.String getGamingServiceBindingPortAddress() {
        return GamingServiceBindingPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GamingServiceBindingPortWSDDServiceName = "GamingServiceBindingPort";

    public java.lang.String getGamingServiceBindingPortWSDDServiceName() {
        return GamingServiceBindingPortWSDDServiceName;
    }

    public void setGamingServiceBindingPortWSDDServiceName(java.lang.String name) {
        GamingServiceBindingPortWSDDServiceName = name;
    }

    public be.tbs.www.mgf.definitions.GamingService_PortType getGamingServiceBindingPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GamingServiceBindingPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGamingServiceBindingPort(endpoint);
    }

    public be.tbs.www.mgf.definitions.GamingService_PortType getGamingServiceBindingPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            be.tbs.www.mgf.definitions.GamingServiceBindingStub _stub = new be.tbs.www.mgf.definitions.GamingServiceBindingStub(portAddress, this);
            _stub.setPortName(getGamingServiceBindingPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGamingServiceBindingPortEndpointAddress(java.lang.String address) {
        GamingServiceBindingPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (be.tbs.www.mgf.definitions.GamingService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                be.tbs.www.mgf.definitions.GamingServiceBindingStub _stub = new be.tbs.www.mgf.definitions.GamingServiceBindingStub(new java.net.URL(GamingServiceBindingPort_address), this);
                _stub.setPortName(getGamingServiceBindingPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("GamingServiceBindingPort".equals(inputPortName)) {
            return getGamingServiceBindingPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.tbs.be/mgf/definitions", "GamingService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.tbs.be/mgf/definitions", "GamingServiceBindingPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GamingServiceBindingPort".equals(portName)) {
            setGamingServiceBindingPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
