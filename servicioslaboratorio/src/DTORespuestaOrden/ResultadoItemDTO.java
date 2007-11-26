/**
 * ResultadoItemDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DTORespuestaOrden;

public class ResultadoItemDTO  implements java.io.Serializable {
    private java.lang.String codigoPrestacion;

    private java.lang.String descripcion;

    private java.util.Calendar fecha;

    private int tipo;

    public ResultadoItemDTO() {
    }

    public ResultadoItemDTO(
           java.lang.String codigoPrestacion,
           java.lang.String descripcion,
           java.util.Calendar fecha,
           int tipo) {
           this.codigoPrestacion = codigoPrestacion;
           this.descripcion = descripcion;
           this.fecha = fecha;
           this.tipo = tipo;
    }


    /**
     * Gets the codigoPrestacion value for this ResultadoItemDTO.
     * 
     * @return codigoPrestacion
     */
    public java.lang.String getCodigoPrestacion() {
        return codigoPrestacion;
    }


    /**
     * Sets the codigoPrestacion value for this ResultadoItemDTO.
     * 
     * @param codigoPrestacion
     */
    public void setCodigoPrestacion(java.lang.String codigoPrestacion) {
        this.codigoPrestacion = codigoPrestacion;
    }


    /**
     * Gets the descripcion value for this ResultadoItemDTO.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this ResultadoItemDTO.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the fecha value for this ResultadoItemDTO.
     * 
     * @return fecha
     */
    public java.util.Calendar getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this ResultadoItemDTO.
     * 
     * @param fecha
     */
    public void setFecha(java.util.Calendar fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the tipo value for this ResultadoItemDTO.
     * 
     * @return tipo
     */
    public int getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this ResultadoItemDTO.
     * 
     * @param tipo
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultadoItemDTO)) return false;
        ResultadoItemDTO other = (ResultadoItemDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoPrestacion==null && other.getCodigoPrestacion()==null) || 
             (this.codigoPrestacion!=null &&
              this.codigoPrestacion.equals(other.getCodigoPrestacion()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            this.tipo == other.getTipo();
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
        if (getCodigoPrestacion() != null) {
            _hashCode += getCodigoPrestacion().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        _hashCode += getTipo();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultadoItemDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:DTORespuestaOrden", "ResultadoItemDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPrestacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoPrestacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fecha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipo"));
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
