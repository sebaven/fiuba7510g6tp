package ar.com.tpclinica.negocio.reglas;

public class ResultadoRegla {
public String resultado;
	
	public ResultadoRegla (String res){
		this.resultado = res;
	}

	/**
	 * @return the resultado
	 */
	public String getResultado() {
		return resultado;
	}

	/**
	 * @param resultado the resultado to set
	 */
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
}
