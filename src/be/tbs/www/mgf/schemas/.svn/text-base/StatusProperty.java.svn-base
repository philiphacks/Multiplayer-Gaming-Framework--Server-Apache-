/**
 * StatusProperty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package be.tbs.www.mgf.schemas;

public class StatusProperty  implements java.io.Serializable {
    private org.apache.axis.types.NormalizedString name;

    private org.apache.axis.types.NormalizedString value;

    private int player;

    public StatusProperty() {
    }

    public StatusProperty(
           org.apache.axis.types.NormalizedString name,
           org.apache.axis.types.NormalizedString value,
           int player) {
           this.name = name;
           this.value = value;
           this.player = player;
    }


    /**
     * Gets the name value for this StatusProperty.
     * 
     * @return name
     */
    public org.apache.axis.types.NormalizedString getName() {
        return name;
    }


    /**
     * Sets the name value for this StatusProperty.
     * 
     * @param name
     */
    public void setName(org.apache.axis.types.NormalizedString name) {
        this.name = name;
    }


    /**
     * Gets the value value for this StatusProperty.
     * 
     * @return value
     */
    public org.apache.axis.types.NormalizedString getValue() {
        return value;
    }


    /**
     * Sets the value value for this StatusProperty.
     * 
     * @param value
     */
    public void setValue(org.apache.axis.types.NormalizedString value) {
        this.value = value;
    }


    /**
     * Gets the player value for this StatusProperty.
     * 
     * @return player
     */
    public int getPlayer() {
        return player;
    }


    /**
     * Sets the player value for this StatusProperty.
     * 
     * @param player
     */
    public void setPlayer(int player) {
        this.player = player;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusProperty)) return false;
        StatusProperty other = (StatusProperty) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            this.player == other.getPlayer();
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        _hashCode += getPlayer();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusProperty.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "StatusProperty"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("player");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.tbs.be/mgf/schemas", "Player"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
