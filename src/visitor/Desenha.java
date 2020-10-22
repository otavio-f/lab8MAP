package visitor;

import interfaces.Visitor;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;

public class Desenha implements Visitor {

	@Override
	public String visita(Retangulo r) {
		return "Retângulo desenhado!";
	}

	@Override
	public String visita(Triangulo t) {
		return "Triângulo desenhado!";
	}

	@Override
	public String visita(Circulo c) {
		return "Círculo desenhado!";
	}

	@Override
	public String visita(Trapezio c) {
		return "Trapézio desenhado!";
	}
	
}
