package visitor;

import interfaces.Visitor;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;

public class MaximizaFigura implements Visitor {

	@Override
	public String visita (Retangulo r) {
		r.setAltura(r.getAltura() * 2);
		r.setBase(r.getBase() * 2);
		return "Retângulo maximizado!";
	}

	@Override
	public String visita (Triangulo t) {
		t.setAltura(t.getAltura() * 2);
		t.setBase(t.getBase() * 2);
		return "Triângulo maximizado!";
	}

	@Override
	public String visita (Circulo c) {
		c.setRaio(c.getRaio() * 2);
		return"Círculo maximizado!";
	}

	@Override
	public String visita (Trapezio c) {
		c.setBaseMaior(c.getBaseMaior() * 2);
		c.setBaseMenor(c.getBaseMenor() * 2);
		c.setAltura(c.getAltura() * 2);
		c.setLados(c.getLados() * 2);
		return "Trapézio maximizado!";
	}
	
}
