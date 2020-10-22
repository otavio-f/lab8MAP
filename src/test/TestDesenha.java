package test;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import objetos.Circulo;
import objetos.Retangulo;
import objetos.Trapezio;
import objetos.Triangulo;
import visitor.Desenha;

public class TestDesenha {

	private Desenha vis;
	
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
		
		vis = new Desenha();
	}

	@Test
	public void testVisitaRetangulo() {
		assertEquals("Retângulo desenhado!", vis.visita(ret));
	}

	@Test
	public void testVisitaTriangulo() {
		assertEquals("Triângulo desenhado!", vis.visita(tri));
	}

	@Test
	public void testVisitaCirculo() {
		assertEquals("Círculo desenhado!", vis.visita(cil));
	}

	@Test
	public void testVisitaTrapezio() {
		assertEquals("Trapézio desenhado!", vis.visita(trp));
	}

}
