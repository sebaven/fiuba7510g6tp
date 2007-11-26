/**
 * ResultadoOrdenMedicaDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DTORespuestaOrden;

public class ResultadoOrdenMedicaDTO  implements java.io.Serializable {
    private int legajoTecnico;

    private int nroOrden;

    private DTORespuestaOrden.ResultadoItemDTO[] resultadoItem;

    public ResultadoOrdenMedicaDTO() {
    }

    public ResultadoOrdenMedicaDTO(
           int legajoTecnico,
           int nroOrden,
           DTORespuestaOrden.ResultadoItemDTO[] resultadoItem) {
           this.legajoTecnico = legajoTecnico;
           this.nroOrden = nroOrden;
           this.resultadoItem = resultadoItem;
    }


    /**
     * Gets the legajoTecnico value for this ResultadoOrdenMedicaDTO.
     * 
     * @return legajoTecnico
     */
    public int getLegajoTecnico() {
        return legajoTecnico;
    }


    /**
     * Sets the legajoTecnico value for this ResultadoOrdenMedicaDTO.
     * 
     * @param legajoTecnico
     */
    public void setLegajoTecnico(int legajoTecnico) {
        this.legajoTecnico = legajoTecnico;
    }


    /**
     * Gets the nroOrden value for this ResultadoOrdenMedicaDTO.
     * 
     * @return nroOrden
     */
    public int getNroOrden() {
        return nroOrden;
    }


    /**
     * Sets the nroOrden value for this ResultadoOrdenMedicaDTO.
     * 
     * @param nroOrden
     */
    public void setNroOrden(int nroOrden) {
        this.nroOrden = nroOrden;
    }


    /**
     * Gets the resultadoItem value for this ResultadoOrdenMedicaDTO.
     * 
     * @return resultadoItem
     */
    public DTORespuestaOrden.ResultadoItemDTO[] getResultadoItem() {
        return resultadoItem;
    }


    /**
     * Sets the resultadoItem value for this ResultadoOrdenMedicaDTO.
     * 
     * @param resultadoItem
     */
    public void setResultadoItem(DTORespuestaOrden.ResultadoItemDTO[] resultadoItem) {
        this.resultadoItem = resultadoItem;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultadoOrdenMedicaDTO)) return false;
        ResultadoOrdenMedicaDTO other = (ResultadoOrdenMedicaDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.legajoTecnico == other.getLegajoTecnico() &&
            this.nroOrden == other.getNroOrden() &&
            ((this.resultadoItem==null && other.getResultadoItem()==null) || 
             (this.resultadoItem!=null &&
              java.util.Arrays.equals(this.resultadoItem, other.getResultadoItem())));
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
        _hashCode += getLegajoTecnico();
        _hashCode += getNroOrden();
        if (getResultadoItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResultadoItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResultadoItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultadoOrdenMedicaDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:DTORespuestaOrden", "ResultadoOrdenMedicaDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legajoTecnico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "legajoTecnico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroOrden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nroOrden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultadoItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultadoItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:DTORespuestaOrden", "ResultadoItemDTO"));
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
