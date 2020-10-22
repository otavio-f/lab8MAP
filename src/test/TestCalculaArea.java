package test;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;
import visitor.CalculaArea;

public class TestCalculaArea {

	private CalculaArea vis;
	
	private Retangulo ret;
	private Triangulo tri;
	private Circulo cil;
	private Trapezio trp;
	
	private Random rnd = new Random();
	private double[] val;
	private DecimalFormat fmt = new DecimalFormat("#.##"); 

	private double[] genRandom() {
		return new double[] {
			Integer.MAX_VALUE*rnd.nextDouble(),
			Integer.MAX_VALUE*rnd.nextDouble(),
			Integer.MAX_VALUE*rnd.nextDouble(),
			Integer.MAX_VALUE*rnd.nextDouble()
		};
	}
	
	@Before
	public void setUp() throws Exception {
		val = genRandom();
		ret = new Retangulo(val[0], val[3]); //First and Last
		tri = new Triangulo(val[0], val[1]); //First and Second
		cil = new Circulo(val[2]); //Mid
		trp = new Trapezio(val[0], val[1], val[2], val[3]);
		
		vis = new CalculaArea();
	}

	@Test
	public void testVisitaRetangulo() {
		double expected = val[0]*val[3];
		assertEquals(fmt.format(expected), vis.visita(ret));
	}

	@Test
	public void testVisitaTriangulo() {
		double expected = (val[0]*val[1])/2;
		assertEquals(fmt.format(expected), vis.visita(tri));
	}

	@Test
	public void testVisitaCirculo() {
		double expected = Math.PI * (val[2]*val[2]);
		assertEquals(fmt.format(expected), vis.visita(cil));
	}

	@Test
	public void testVisitaTrapezio() { //((t.getBaseMaior() + t.getBaseMenor()) * t.getAltura()) / 2;
		double expected = ((val[2] + val[3]) * val[1]) / 2;
		assertEquals(fmt.format(expected), vis.visita(trp));
	}

}
