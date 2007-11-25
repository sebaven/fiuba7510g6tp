package ar.com.tpclinica.negocio.reglas;

import ar.com.tpclinica.negocio.OrdenMedica;

public class Comparar extends OperacionConOperandos {
	private Operando A,B;
	private Operacion mayor,menor,igual;
	
	public Comparar(Operando A, Operando B, Operacion mayor, Operacion menor, Operacion igual) {
		this.A = A;
		this.B = B;
		this.mayor = mayor;
		this.menor = menor;
		this.igual = igual;
	}

	public Resultado aplicar (OrdenMedica om)
	{
		if (this.A.getValor(om) > this.B.getValor(om))
			return this.mayor.aplicar(om);
		else if (this.A.getValor(om) < this.B.getValor(om))
			return this.menor.aplicar(om);
		else return this.igual.aplicar(om);
	}
	
	public Operando getA() {
		return A;
	}

	public void setA(Operando a) {
		A = a;
	}

	public Operando getB() {
		return B;
	}

	public void setB(Operando b) {
		B = b;
	}

	public Operacion getMayor() {
		return mayor;
	}

	public void setMayor(Operacion mayor) {
		this.mayor = mayor;
	}

	public Operacion getMenor() {
		return menor;
	}

	public void setMenor(Operacion menor) {
		this.menor = menor;
	}

	public Operacion getIgual() {
		return igual;
	}

	public void setIgual(Operacion igual) {
		this.igual = igual;
	}
	
	@Override
	public boolean equals(Object obj) {
		Comparar c = (Comparar)obj;
		if ((c.getA().equals(this.A)) && (c.getB().equals(this.B)) && (c.getIgual().equals(this.igual)) && (c.getMayor().equals(this.mayor)) && (c.getMenor().equals(this.menor)))
			return true;
		else return false;
	}
}
