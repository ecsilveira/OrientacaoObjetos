package br.edu.uniritter.exeGeometriaTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.exeGeometria.Retangulo;

public class RetanguloTest {

	Retangulo retangulo;

	@Before
	public void setUp() throws Exception {
		retangulo = new Retangulo(15,8);
	}

	@Test
	public void testCalcularPerimetro() {
		assertEquals(46, retangulo.calculaPerimetro(), 0.01);
	}

	@Test
	public void testCalcularArea() {
		assertEquals(120, retangulo.calculaArea(), 0.01);
	}

}
