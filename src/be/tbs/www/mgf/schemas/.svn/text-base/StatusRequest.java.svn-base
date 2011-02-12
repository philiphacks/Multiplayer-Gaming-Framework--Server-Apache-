/**
 * StatusRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package be.tbs.www.mgf.schemas;

public class StatusRequest  extends be.tbs.www.mgf.schemas.Request  implements java.io.Serializable {
    private be.tbs.www.mgf.schemas.PlayerDescriptor player;

    private be.tbs.www.mgf.schemas.StatusProperty property;

    public StatusRequest() {
    }

    public StatusRequest(
           int version,
           org.apache.axis.types.NormalizedString id,
           be.tbs.www.mgf.schemas.Ping ping,
           be.tbs.www.mgf.schemas.PlayerDescriptor player,
           be.tbs.www.mgf.schemas.StatusProperty property) {
        super(
            version,
            id,
            ping);
        this.player = player;
        this.property = property;
    }


    /**
     * Gets the player value for this StatusRequest.
     * 
     * @return player
     */
    public be.tbs.www.mgf.schemas.PlayerDescriptor getPlayer() {
        return player;
    }


    /**
     * Sets the player value for this StatusRequest.
     * 
     * @param player
     */
    public void setPlayer(be.tbs.www.mgf.schemas.PlayerDescriptor player) {
        this.player = player;
    }


    /**
     * Gets the property value for this StatusRequest.
     * 
     * @return property
     */
    public be.tbs.www.mgf.schemas.StatusProperty getProperty() {
        return property;
    }


    /**
     * Sets the property value for this StatusRequest.
     * 
     * @param property
     */
    public void setProperty(be.tbs.www.mgf.schemas.StatusProperty property) {
        this.property = property;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusRequest)) return false;
        StatusRequest other = (StatusRequest) obj;
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
            ((this.property==null && other.getProperty()==null) || 
             (this.property!=null &&
              this.property.equals(other.getProperty())));
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
        if (getProperty() != null) {
            _hashCode += getProperty().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", ">StatusRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("player");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "Player"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "PlayerDescriptor"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("property");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "Property"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "StatusProperty"));
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
