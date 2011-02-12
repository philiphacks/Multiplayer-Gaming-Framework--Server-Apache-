/**
 * JoinReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package be.tbs.www.mgf.schemas;

public class JoinReply  extends be.tbs.www.mgf.schemas.Reply  implements java.io.Serializable {
    private be.tbs.www.mgf.schemas.PlayerDescriptor player;

    private be.tbs.www.mgf.schemas.Error error;

    public JoinReply() {
    }

    public JoinReply(
           int version,
           be.tbs.www.mgf.schemas.Pong pong,
           be.tbs.www.mgf.schemas.PlayerDescriptor player,
           be.tbs.www.mgf.schemas.Error error) {
        super(
            version,
            pong);
        this.player = player;
        this.error = error;
    }


    /**
     * Gets the player value for this JoinReply.
     * 
     * @return player
     */
    public be.tbs.www.mgf.schemas.PlayerDescriptor getPlayer() {
        return player;
    }


    /**
     * Sets the player value for this JoinReply.
     * 
     * @param player
     */
    public void setPlayer(be.tbs.www.mgf.schemas.PlayerDescriptor player) {
        this.player = player;
    }


    /**
     * Gets the error value for this JoinReply.
     * 
     * @return error
     */
    public be.tbs.www.mgf.schemas.Error getError() {
        return error;
    }


    /**
     * Sets the error value for this JoinReply.
     * 
     * @param error
     */
    public void setError(be.tbs.www.mgf.schemas.Error error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JoinReply)) return false;
        JoinReply other = (JoinReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.player==null && other.getPlayer()==null) || 
             (this.player!=null &&
              this.player.equals(other.getPlayer()))) &&
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
        if (getPlayer() != null) {
            _hashCode += getPlayer().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JoinReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", ">JoinReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("player");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "Player"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "PlayerDescriptor"));
        elemField.setNillable(false);
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
