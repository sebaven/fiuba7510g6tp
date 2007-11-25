package ar.com.tpclinica.servicioremoto.orden;


/**
 * Encapsula los datos de transferencia entre la clinica y el laboratorio
 * 
 * @author carlos
 * 
 */
public class ResultadoOrdenMedicaDTO {

	private int nroOrden;

	private ResultadoItemDTO[] resultadoItem;

	/**
	 * Legajo del tecnico que realizo los analisis
	 */
	private int legajoTecnico;

	public int getNroOrden() {
		return nroOrden;
	}

	public void setNroOrden(int nroOrden) {
		this.nroOrden = nroOrden;
	}

	public ResultadoItemDTO[] getResultadoItem() {
		return resultadoItem;
	}

	public void setResultadoItem(ResultadoItemDTO[] resultadoItem) {
		this.resultadoItem = resultadoItem;
	}

	public int getLegajoTecnico() {
		return legajoTecnico;
	}

	public void setLegajoTecnico(int legajoTecnico) {
		this.legajoTecnico = legajoTecnico;
	}


}
