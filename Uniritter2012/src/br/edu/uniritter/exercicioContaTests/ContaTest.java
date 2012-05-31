package br.edu.uniritter.exercicioContaTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.exercicioConta.Conta;
import br.edu.uniritter.exercicioConta.ContaExcecao;

public class ContaTest {

	Conta conta;
	
	@Before
	public void setUp() throws Exception {
		conta = new Conta(0, 100);
	}

	@Test
	public void testDeposita() {
		conta.deposita(50);
		assertEquals(150, conta.verificaSaldo(), 0.01);
	}

	@Test
	public void testSaca() throws ContaExcecao {
		try {
			conta.saca(20);
			assertEquals(80, conta.verificaSaldo(), 0.01);
		} catch (ContaExcecao ce) {
			System.out.println(ce.Mensagem(ce.getFalha()));
		}
	}

	@Test
	public void testSacaDemais() throws ContaExcecao {
		try {
			conta.saca(1000);	
			assertEquals(100, conta.verificaSaldo(), 0.01);
		} catch (ContaExcecao ce) {
			System.out.println(ce.Mensagem(ce.getFalha()));
		}
	}

	@Test
	public void testVerificaSaldo() {
		float result = conta.verificaSaldo();
		assertEquals(100, result, 0.01);
	}

	@Test
	public void testRetornaNumeroConta() {
		assertEquals(0, conta.retornaNumeroConta());
	}

}
