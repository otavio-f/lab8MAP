package main;

import interfaces.Visitor;
import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;
import visitor.CalculaArea;
import visitor.CalculaPerimetro;
import visitor.Desenha;
import visitor.MaximizaFigura;

public class Main {

	public static void main(String[] args) {
		CalculaArea area = new CalculaArea();
		CalculaPerimetro perimetro = new CalculaPerimetro();
		Desenha desenho = new Desenha();
		MaximizaFigura maximiza = new MaximizaFigura();
		
		Circulo circ = new Circulo(2);
		Triangulo tri = new Triangulo(3,8);
		Retangulo ret = new Retangulo(14, 8);
		Trapezio trp = new Trapezio(1,2,3,4);
		
		Visitor[] visitors = new Visitor[] {area, perimetro, desenho, maximiza};
		
		for(Visitor v: visitors) {
			System.out.println("\nExecutando " + v.getClass().getSimpleName() + " em: ");
			
			System.out.println("\tRetangulo: " + ret.recebeVisita(v));
			System.out.println("\tCirculo: " + circ.recebeVisita(v));
			System.out.println("\tTrapezio: " + trp.recebeVisita(v));
			System.out.println("\tTriangulo: " + tri.recebeVisita(v));
		}

	}

}
