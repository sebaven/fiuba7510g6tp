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

	public void setOp(OperacionConOperandos op) {
		this.op = op;
	}
	
	public Resultado aplicar (OrdenMedica om)
	{
		this.op.setPrimerOperando(new Cantidad(this.getPrimerOperando().getValor(om) + this.getSegundoOperando().getValor(om)));
		return this.op.aplicar(om);
	}
}
