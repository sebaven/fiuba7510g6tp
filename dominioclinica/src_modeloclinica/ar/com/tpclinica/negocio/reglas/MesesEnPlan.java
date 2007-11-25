package ar.com.tpclinica.negocio.reglas;

import ar.com.tpclinica.negocio.OrdenMedica;

public class MesesEnPlan extends Operando {
	public int getValor(OrdenMedica om)
	{
		//TODO!!!
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		OrdenMedica om = null;
		if (((Operando)obj).getValor(om)==this.getValor(om))
			return true;
		else return false;
	}
}
