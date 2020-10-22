package objetos;

import interfaces.ElementoConcreto;
import interfaces.Visitor;

public class Retangulo implements ElementoConcreto {

	private double base;
	private double altura;
	
	public Retangulo(double b, double h) {
		base = b;
		altura = h;
	}
	
	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public String recebeVisita(Visitor v) {
		return v.visita(this);
	}

}
