package visitor;

import interfaces.Visitor;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;

public class CalculaArea implements Visitor {
	
	@Override
	public String visita(Retangulo r) {
		double val = r.getAltura() * r.getBase();
		return Visitor.formato.format(val);
	}

	@Override
	public String visita(Triangulo t) {
		double val = (t.getAltura() * t.getBase()) / 2;
		return Visitor.formato.format(val);
	}

	@Override
	public String visita(Circulo c) {
		double val = Math.PI * (c.getRaio() * c.getRaio());
		return Visitor.formato.format(val);
	}

	@Override
	public String visita(Trapezio t) {
		double d = ((t.getBaseMaior() + t.getBaseMenor()) * t.getAltura()) / 2;
		return Visitor.formato.format(d);
	}
}
