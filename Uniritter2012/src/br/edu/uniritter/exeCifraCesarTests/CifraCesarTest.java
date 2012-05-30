package br.edu.uniritter.exeCifraCesarTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.exeCifraCesar.CifraCesar;

public class CifraCesarTest {

	CifraCesar cifra;
	
	@Before
	public void setUp() {
		this.cifra = new CifraCesar();
	}

	@Test
	public void testCifrar() {
		assertEquals('B', cifra.Cifrar('Y'));
		
	}
	
	@Test
	public void testCifrarTexto() {
		assertEquals("b", cifra.CifrarTexto("y", 3));
	}

	@Test
	public void testCifrarTextoGrande() {
		assertEquals("ymj gttp nx ts ymj yfgqj", cifra.CifrarTexto("the book is on the table", 5));
	}

}
