package ar.com.tpclinica.negocio;

public class OrdenMedicaEstado {
	private static final String AUTORIZADA="Autorizada";
	private static final String ENVIADA="Enviada";
	private static final String PENDIENTE_AUTORIZACION="PendienteAutorizacion";
	private String descripcion;

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

}
