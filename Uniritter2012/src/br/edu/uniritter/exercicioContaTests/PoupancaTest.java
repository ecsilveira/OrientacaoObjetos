package br.edu.uniritter.exercicioContaTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.exercicioConta.ContaExcecao;
import br.edu.uniritter.exercicioConta.Poupanca;

public class PoupancaTest {

	Poupanca poupanca;

	@Before
	public void setUp() throws Exception {
		poupanca = new Poupanca(2);
	}

	@Test
	public void testDeposita() {
		poupanca.deposita(50);
		assertEquals(150, poupanca.verificaSaldo(), 0.01);
	}

	@Test
	public void testSaca() throws ContaExcecao {
		try {
			poupanca.saca(20);
			assertEquals(80, poupanca.verificaSaldo(), 0.01);
		} catch (ContaExcecao ce) {
			System.out.println(ce.Mensagem(ce.getFalha()));
		}
	}

	@Test
	public void testSacaDemais() throws ContaExcecao {
		try {
			poupanca.saca(1000);
			assertEquals(100, poupanca.verificaSaldo(), 0.01);
		} catch (ContaExcecao ce) {
			System.out.println(ce.Mensagem(ce.getFalha()));
		}
	}

	@Test
	public void testVerificaSaldo() {
		float result = poupanca.verificaSaldo();
		assertEquals(100, result, 0.01);
	}

	@Test
	public void testRetornaNumeroConta() {
		assertEquals(2, poupanca.retornaNumeroConta());
	}

}
