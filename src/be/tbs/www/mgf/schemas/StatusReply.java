/**
 * StatusReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package be.tbs.www.mgf.schemas;

public class StatusReply  extends be.tbs.www.mgf.schemas.Reply  implements java.io.Serializable {
    private be.tbs.www.mgf.schemas.StatusProperty[] property;

    private be.tbs.www.mgf.schemas.Error error;

    public StatusReply() {
    }

    public StatusReply(
           int version,
           be.tbs.www.mgf.schemas.Pong pong,
           be.tbs.www.mgf.schemas.StatusProperty[] property,
           be.tbs.www.mgf.schemas.Error error) {
        super(
            version,
            pong);
        this.property = property;
        this.error = error;
    }


    /**
     * Gets the property value for this StatusReply.
     * 
     * @return property
     */
    public be.tbs.www.mgf.schemas.StatusProperty[] getProperty() {
    	if (property == null) {
    		property = new StatusProperty[100];
    	}
        return property;
    }


    /**
     * Sets the property value for this StatusReply.
     * 
     * @param property
     */
    public void setProperty(be.tbs.www.mgf.schemas.StatusProperty[] property) {
        this.property = property;
    }

    public be.tbs.www.mgf.schemas.StatusProperty getProperty(int i) {
        return this.property[i];
    }

    public void setProperty(int i, be.tbs.www.mgf.schemas.StatusProperty _value) {
        this.property[i] = _value;
    }


    /**
     * Gets the error value for this StatusReply.
     * 
     * @return error
     */
    public be.tbs.www.mgf.schemas.Error getError() {
        return error;
    }


    /**
     * Sets the error value for this StatusReply.
     * 
     * @param error
     */
    public void setError(be.tbs.www.mgf.schemas.Error error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusReply)) return false;
        StatusReply other = (StatusReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.property==null && other.getProperty()==null) || 
             (this.property!=null &&
              java.util.Arrays.equals(this.property, other.getProperty()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProperty(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", ">StatusReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("property");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "Property"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "StatusProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "Error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "Error"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
