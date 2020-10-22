package objetos;

import interfaces.ElementoConcreto;
import interfaces.Visitor;

public class Circulo implements ElementoConcreto {

	private double raio;
	
	public Circulo(double r) {
		raio = r;
	}
	
	/**
	 * @return the raio
	 */
	public double getRaio() {
		return raio;
	}

	/**
	 * @param raio the raio to set
	 */
	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public String recebeVisita(Visitor v) {
		return v.visita(this);
	}

}
