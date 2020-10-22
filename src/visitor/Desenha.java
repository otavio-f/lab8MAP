package visitor;

import interfaces.Visitor;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;

public class Desenha implements Visitor {

	@Override
	public String visita(Retangulo r) {
		return "Ret�ngulo desenhado!";
	}

	@Override
	public String visita(Triangulo t) {
		return "Tri�ngulo desenhado!";
	}

	@Override
	public String visita(Circulo c) {
		return "C�rculo desenhado!";
	}

	@Override
	public String visita(Trapezio c) {
		return "Trap�zio desenhado!";
	}
	
}
