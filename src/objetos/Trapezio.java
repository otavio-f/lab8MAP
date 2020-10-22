package objetos;

import interfaces.ElementoConcreto;
import interfaces.Visitor;

public class Trapezio implements ElementoConcreto {

	private double lados;
	private double altura;
	private double baseMaior;
	private double baseMenor;
	
	public Trapezio(double l, double h, double bMaior, double bMenor) {
		lados = l;
		altura = h;
		baseMaior = bMaior;
		baseMenor = bMenor;
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
	 * @return the lados
	 */
	public double getLados() {
		return lados;
	}

	/**
	 * @return the baseMaior
	 */
	public double getBaseMaior() {
		return baseMaior;
	}

	/**
	 * @param baseMaior the baseMaior to set
	 */
	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}

	/**
	 * @return the baseMenor
	 */
	public double getBaseMenor() {
		return baseMenor;
	}

	/**
	 * @param baseMenor the baseMenor to set
	 */
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	/**
	 * @param lados the lados to set
	 */
	public void setLados(double lados) {
		this.lados = lados;
	}

	@Override
	public String recebeVisita(Visitor v) {
		return v.visita(this);
	}

}
