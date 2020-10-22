package visitor;

import interfaces.Visitor;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;

public class CalculaPerimetro implements Visitor{

	@Override
	public String visita(Retangulo r) {
		double val = 2 * (r.getAltura() + r.getBase());
		return Visitor.formato.format(val);
	}

	@Override
	public String visita(Triangulo t) {
		double hip = Math.sqrt(
				Math.pow(t.getBase(), 2) + Math.pow(t.getAltura(), 2)
				);
		double val = t.getBase() + t.getAltura() + hip;
		return Visitor.formato.format(val);
	}

	@Override
	public String visita(Circulo c) {
		double val = 2 * Math.PI * c.getRaio();
		return Visitor.formato.format(val);
	}

	@Override
	public String visita(Trapezio t) {
		double val = t.getBaseMaior() + t.getBaseMenor() + t.getLados() * 2;
		return Visitor.formato.format(val);
	}
	
}
