package interfaces;

import java.text.DecimalFormat;

import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;

public interface Visitor {
	
	public static DecimalFormat formato = new DecimalFormat("#.##");
	
	public String visita(Circulo c);
	
	public String visita(Retangulo r);
	
	public String visita(Trapezio t);
	
	public String visita(Triangulo t);
}
