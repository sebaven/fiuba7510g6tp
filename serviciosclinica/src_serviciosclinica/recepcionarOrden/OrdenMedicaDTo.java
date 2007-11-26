/**
 * OrdenMedicaDTo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package recepcionarOrden;

public class OrdenMedicaDTo  implements java.io.Serializable {
    private java.lang.String diagnostico;

    private recepcionarOrden.ItemOrdenMedicaDTO[] items;

    private java.lang.String medico;

    private int nroOrden;

    private java.lang.String paciente;

    public OrdenMedicaDTo() {
    }

    public OrdenMedicaDTo(
           java.lang.String diagnostico,
           recepcionarOrden.ItemOrdenMedicaDTO[] items,
           java.lang.String medico,
           int nroOrden,
           java.lang.String paciente) {
           this.diagnostico = diagnostico;
           this.items = items;
           this.medico = medico;
           this.nroOrden = nroOrden;
           this.paciente = paciente;
    }


    /**
     * Gets the diagnostico value for this OrdenMedicaDTo.
     * 
     * @return diagnostico
     */
    public java.lang.String getDiagnostico() {
        return diagnostico;
    }


    /**
     * Sets the diagnostico value for this OrdenMedicaDTo.
     * 
     * @param diagnostico
     */
    public void setDiagnostico(java.lang.String diagnostico) {
        this.diagnostico = diagnostico;
    }


    /**
     * Gets the items value for this OrdenMedicaDTo.
     * 
     * @return items
     */
    public recepcionarOrden.ItemOrdenMedicaDTO[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this OrdenMedicaDTo.
     * 
     * @param items
     */
    public void setItems(recepcionarOrden.ItemOrdenMedicaDTO[] items) {
        this.items = items;
    }


    /**
     * Gets the medico value for this OrdenMedicaDTo.
     * 
     * @return medico
     */
    public java.lang.String getMedico() {
        return medico;
    }


    /**
     * Sets the medico value for this OrdenMedicaDTo.
     * 
     * @param medico
     */
    public void setMedico(java.lang.String medico) {
        this.medico = medico;
    }


    /**
     * Gets the nroOrden value for this OrdenMedicaDTo.
     * 
     * @return nroOrden
     */
    public int getNroOrden() {
        return nroOrden;
    }


    /**
     * Sets the nroOrden value for this OrdenMedicaDTo.
     * 
     * @param nroOrden
     */
    public void setNroOrden(int nroOrden) {
        this.nroOrden = nroOrden;
    }


    /**
     * Gets the paciente value for this OrdenMedicaDTo.
     * 
     * @return paciente
     */
    public java.lang.String getPaciente() {
        return paciente;
    }


    /**
     * Sets the paciente value for this OrdenMedicaDTo.
     * 
     * @param paciente
     */
    public void setPaciente(java.lang.String paciente) {
        this.paciente = paciente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrdenMedicaDTo)) return false;
        OrdenMedicaDTo other = (OrdenMedicaDTo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.diagnostico==null && other.getDiagnostico()==null) || 
             (this.diagnostico!=null &&
              this.diagnostico.equals(other.getDiagnostico()))) &&
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems()))) &&
            ((this.medico==null && other.getMedico()==null) || 
             (this.medico!=null &&
              this.medico.equals(other.getMedico()))) &&
            this.nroOrden == other.getNroOrden() &&
            ((this.paciente==null && other.getPaciente()==null) || 
             (this.paciente!=null &&
              this.paciente.equals(other.getPaciente())));
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
        if (getDiagnostico() != null) {
            _hashCode += getDiagnostico().hashCode();
        }
        if (getItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMedico() != null) {
            _hashCode += getMedico().hashCode();
        }
        _hashCode += getNroOrden();
        if (getPaciente() != null) {
            _hashCode += getPaciente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrdenMedicaDTo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:recepcionarOrden", "OrdenMedicaDTo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diagnostico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "diagnostico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("", "items"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:recepcionarOrden", "ItemOrdenMedicaDTO"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "medico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroOrden");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nroOrden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paciente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paciente"));
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
