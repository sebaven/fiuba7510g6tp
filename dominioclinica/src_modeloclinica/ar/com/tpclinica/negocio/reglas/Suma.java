package ar.com.tpclinica.negocio.reglas;

import ar.com.tpclinica.negocio.OrdenMedica;

public class Suma extends OperacionConOperandos {
	OperacionConOperandos op;
	
	public Suma(Operando A, Operando B, OperacionConOperandos op) {
		this.setPrimerOperando(A);
		this.setSegundoOperando(B);
		this.op = op;
	}

	public Operacion getOp() {
		return op;
	}
	public int getTipo(){
		return 1;
	}

	public void setOp(OperacionConOperandos op) {
		this.op = op;
	}
	
	public ResultadoRegla aplicar (OrdenMedica om)
	{
		this.op.setPrimerOperando(new Cantidad(this.getPrimerOperando().getValor(om) + this.getSegundoOperando().getValor(om)));
		return this.op.aplicar(om);
	}
	@Override
	public boolean equals(Object obj) {
		Suma o = (Suma)obj;
		OrdenMedica om = null;
		if (o.getOp().equals(this.op) && (o.getPrimerOperando().getValor(om)==this.getPrimerOperando().getValor(om)) && (o.getSegundoOperando().getValor(om)==this.getSegundoOperando().getValor(om)))
			return true;
		else return false;
	}
}
