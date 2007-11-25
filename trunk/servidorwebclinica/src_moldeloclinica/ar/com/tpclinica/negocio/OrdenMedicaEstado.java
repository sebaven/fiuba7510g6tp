package ar.com.tpclinica.negocio;

public class OrdenMedicaEstado {
	public static final String AUTORIZADA="Autorizada";
	public static final String ENVIADA="Enviada";
	public static final String PENDIENTE_AUTORIZACION="PendienteAutorizacion";
	private String descripcion;

	public OrdenMedicaEstado(String e){
		this.descripcion = e;
	}
	
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
