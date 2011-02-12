/**
 * PlayerDescriptor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package be.tbs.www.mgf.schemas;

public class PlayerDescriptor  implements java.io.Serializable {
    private java.lang.Integer playerID;

    private org.apache.axis.types.NormalizedString playerName;

    public PlayerDescriptor() {
    }

    public PlayerDescriptor(
           java.lang.Integer playerID,
           org.apache.axis.types.NormalizedString playerName) {
           this.playerID = playerID;
           this.playerName = playerName;
    }


    /**
     * Gets the playerID value for this PlayerDescriptor.
     * 
     * @return playerID
     */
    public java.lang.Integer getPlayerID() {
        return playerID;
    }


    /**
     * Sets the playerID value for this PlayerDescriptor.
     * 
     * @param playerID
     */
    public void setPlayerID(java.lang.Integer playerID) {
        this.playerID = playerID;
    }


    /**
     * Gets the playerName value for this PlayerDescriptor.
     * 
     * @return playerName
     */
    public org.apache.axis.types.NormalizedString getPlayerName() {
        return playerName;
    }


    /**
     * Sets the playerName value for this PlayerDescriptor.
     * 
     * @param playerName
     */
    public void setPlayerName(org.apache.axis.types.NormalizedString playerName) {
        this.playerName = playerName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlayerDescriptor)) return false;
        PlayerDescriptor other = (PlayerDescriptor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.playerID==null && other.getPlayerID()==null) || 
             (this.playerID!=null &&
              this.playerID.equals(other.getPlayerID()))) &&
            ((this.playerName==null && other.getPlayerName()==null) || 
             (this.playerName!=null &&
              this.playerName.equals(other.getPlayerName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPlayerID() != null) {
            _hashCode += getPlayerID().hashCode();
        }
        if (getPlayerName() != null) {
            _hashCode += getPlayerName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlayerDescriptor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "PlayerDescriptor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("playerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "PlayerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("playerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "PlayerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
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
