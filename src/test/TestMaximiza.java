package test;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;
import visitor.MaximizaFigura;

public class TestMaximiza {

	private MaximizaFigura vis;
	
	private Retangulo ret;
	private Triangulo tri;
	private Circulo cil;
	private Trapezio trp;
	
	private Random rnd = new Random();
	private double[] val;

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
		ret = new Retangulo(val[0], val[1]); //First and Second
		tri = new Triangulo(val[0], val[3]); //First and Last
		cil = new Circulo(val[2]); //Mid
		trp = new Trapezio(val[0], val[1], val[2], val[3]); //Everyone
		
		vis = new MaximizaFigura();
	}

	@Test
	public void testVisitaRetangulo() {
		assertEquals("Retângulo maximizado!", vis.visita(ret));
		assertEquals(2*val[1], ret.getAltura(), 0);
		assertEquals(2*val[0], ret.getBase(), 0);
	}

	@Test
	public void testVisitaTriangulo() {
		assertEquals("Triângulo maximizado!", vis.visita(tri));
		assertEquals(2*val[3], tri.getAltura(), 0);
		assertEquals(2*val[0], tri.getBase(), 0);
	}

	@Test
	public void testVisitaCirculo() {
		assertEquals("Círculo maximizado!", vis.visita(cil));
		assertEquals(2*val[2], cil.getRaio(), 0);
	}

	@Test
	public void testVisitaTrapezio() {
		assertEquals("Trapézio maximizado!", vis.visita(trp));
		assertEquals(2*val[0], trp.getLados(), 0);
		assertEquals(2*val[1], trp.getAltura(), 0);
		assertEquals(2*val[2], trp.getBaseMaior(), 0);
		assertEquals(2*val[3], trp.getBaseMenor(), 0);
	}

}
