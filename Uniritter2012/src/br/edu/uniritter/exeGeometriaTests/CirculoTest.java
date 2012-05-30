package br.edu.uniritter.exeGeometriaTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.exeGeometria.Circulo;

public class CirculoTest {

	Circulo circulo;

	@Before
	public void setUp() throws Exception {
		circulo = new Circulo(5);
	}

	@Test
	public void testCalcularPerimetro() {
		assertEquals(31.41, circulo.calculaPerimetro(), 0.01);
	}

	@Test
	public void testCalcularArea() {
		assertEquals(78.54, circulo.calculaArea(), 0.01);
	}

}
