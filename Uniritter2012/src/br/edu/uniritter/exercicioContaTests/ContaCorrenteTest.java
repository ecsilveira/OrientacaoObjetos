package br.edu.uniritter.exercicioContaTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.exercicioConta.ContaCorrente;

public class ContaCorrenteTest {

	ContaCorrente contaCorrente;
	
	@Before
	public void setUp() throws Exception {
		contaCorrente = new ContaCorrente(1, 100);
	}

	@Test
	public void testDeposita() {
		contaCorrente.deposita(50);
		assertEquals(150, contaCorrente.verificaSaldo(), 0.01);
	}

	@Test
	public void testSaca() {
		contaCorrente.saca(20);
		assertEquals(80, contaCorrente.verificaSaldo(), 0.01);
	}

	@Test
	public void testSacaDemais() {
		contaCorrente.saca(1000);
		assertEquals(100, contaCorrente.verificaSaldo(), 0.01);
	}

	@Test
	public void testVerificaSaldo() {
		float result = contaCorrente.verificaSaldo();
		assertEquals(100, result, 0.01);
	}

	@Test
	public void testRetornaNumeroConta() {
		assertEquals(1, contaCorrente.retornaNumeroConta());
	}

}
