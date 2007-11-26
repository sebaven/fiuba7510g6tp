/**
 * ItemOrdenMedicaDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package recepcionarOrden;

public class ItemOrdenMedicaDTO  implements java.io.Serializable {
    private int codigoPrestacion;

    private java.lang.String descripcion;

    private java.lang.String descripcionPrestacion;

    public ItemOrdenMedicaDTO() {
    }

    public ItemOrdenMedicaDTO(
           int codigoPrestacion,
           java.lang.String descripcion,
           java.lang.String descripcionPrestacion) {
           this.codigoPrestacion = codigoPrestacion;
           this.descripcion = descripcion;
           this.descripcionPrestacion = descripcionPrestacion;
    }


    /**
     * Gets the codigoPrestacion value for this ItemOrdenMedicaDTO.
     * 
     * @return codigoPrestacion
     */
    public int getCodigoPrestacion() {
        return codigoPrestacion;
    }


    /**
     * Sets the codigoPrestacion value for this ItemOrdenMedicaDTO.
     * 
     * @param codigoPrestacion
     */
    public void setCodigoPrestacion(int codigoPrestacion) {
        this.codigoPrestacion = codigoPrestacion;
    }


    /**
     * Gets the descripcion value for this ItemOrdenMedicaDTO.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this ItemOrdenMedicaDTO.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the descripcionPrestacion value for this ItemOrdenMedicaDTO.
     * 
     * @return descripcionPrestacion
     */
    public java.lang.String getDescripcionPrestacion() {
        return descripcionPrestacion;
    }


    /**
     * Sets the descripcionPrestacion value for this ItemOrdenMedicaDTO.
     * 
     * @param descripcionPrestacion
     */
    public void setDescripcionPrestacion(java.lang.String descripcionPrestacion) {
        this.descripcionPrestacion = descripcionPrestacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemOrdenMedicaDTO)) return false;
        ItemOrdenMedicaDTO other = (ItemOrdenMedicaDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.codigoPrestacion == other.getCodigoPrestacion() &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.descripcionPrestacion==null && other.getDescripcionPrestacion()==null) || 
             (this.descripcionPrestacion!=null &&
              this.descripcionPrestacion.equals(other.getDescripcionPrestacion())));
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
        _hashCode += getCodigoPrestacion();
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getDescripcionPrestacion() != null) {
            _hashCode += getDescripcionPrestacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemOrdenMedicaDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:recepcionarOrden", "ItemOrdenMedicaDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPrestacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoPrestacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionPrestacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcionPrestacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
