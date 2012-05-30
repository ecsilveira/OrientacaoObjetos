package br.edu.uniritter.exeGeometriaTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.exeGeometria.Triangulo;

public class TrianguloTest {

	Triangulo triangulo;

	@Before
	public void setUp() throws Exception {
		triangulo = new Triangulo(15,8,13);
	}

	@Test
	public void testCalcularPerimetro() {
		assertEquals(36, triangulo.calculaPerimetro(), 0.01);
	}

	@Test
	public void testCalcularArea() {
		assertEquals(51.96, triangulo.calculaArea(), 0.01);
	}

}
