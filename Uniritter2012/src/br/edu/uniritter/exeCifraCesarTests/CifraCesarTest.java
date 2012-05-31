package br.edu.uniritter.exeCifraCesarTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.exeCifraCesar.CifraCesar;
import br.edu.uniritter.exeCifraCesar.CifraCesarExcecao;

public class CifraCesarTest {

	CifraCesar cifra;

	@Before
	public void setUp() {
		this.cifra = new CifraCesar();
	}

	@Test
	public void testCifrar() throws CifraCesarExcecao {
		try {
			assertEquals('B', cifra.Cifrar('1'));
		} catch (CifraCesarExcecao cce) {
			System.out.println(cce.Mensagem(cce.getFalha(), String.valueOf('1')));
		}
	}

	@Test
	public void testCifrarTexto() {
		assertEquals("b", cifra.CifrarTexto("y", 3));
	}

	@Test
	public void testCifrarTextoGrande() {
		assertEquals("ymj gttp nx ts ymj yfgqj",
				cifra.CifrarTexto("the book is on the table", 5));
	}

}
