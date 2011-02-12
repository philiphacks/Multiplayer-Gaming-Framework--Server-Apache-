/**
 * Reply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package be.tbs.www.mgf.schemas;

public class Reply  extends be.tbs.www.mgf.schemas.Message  implements java.io.Serializable {
    private be.tbs.www.mgf.schemas.Pong pong;

    public Reply() {
    }

    public Reply(
           int version,
           be.tbs.www.mgf.schemas.Pong pong) {
        super(
            version);
        this.pong = pong;
    }


    /**
     * Gets the pong value for this Reply.
     * 
     * @return pong
     */
    public be.tbs.www.mgf.schemas.Pong getPong() {
        return pong;
    }


    /**
     * Sets the pong value for this Reply.
     * 
     * @param pong
     */
    public void setPong(be.tbs.www.mgf.schemas.Pong pong) {
        this.pong = pong;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Reply)) return false;
        Reply other = (Reply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.pong==null && other.getPong()==null) || 
             (this.pong!=null &&
              this.pong.equals(other.getPong())));
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
        if (getPong() != null) {
            _hashCode += getPong().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Reply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "Reply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pong");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "Pong"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "Pong"));
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
