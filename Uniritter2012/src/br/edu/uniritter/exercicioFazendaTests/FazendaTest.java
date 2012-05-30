package br.edu.uniritter.exercicioFazendaTests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.exercicioFazenda.Coordenada;
import br.edu.uniritter.exercicioFazenda.Fazenda;

public class FazendaTest {
	
	Fazenda fazenda;
	Coordenada meteoro, meteoro2, meteoro3, meteoro4, meteoro5;

	@Before
	public void setUp() {		
		fazenda = new Fazenda(new Coordenada(1, 1), new Coordenada(50, 50));
		meteoro = new Coordenada(5, 5);
		meteoro2 = new Coordenada(51, 51);
		meteoro3 = new Coordenada(5, 70);
		meteoro4 = new Coordenada(0, 0);
		meteoro5 = new Coordenada(0, 5);
	}

	@Test
	public void testAtingiu() {
		assertTrue(fazenda.VerificarQueda(meteoro));
	}

	@Test
	public void testNaoAtingiu() {
		assertFalse(fazenda.VerificarQueda(meteoro2));
	}

	@Test
	public void testNaoAtingiu2() {
		assertFalse(fazenda.VerificarQueda(meteoro3));
	}

	@Test
	public void testNaoAtingiu3() {
		assertFalse(fazenda.VerificarQueda(meteoro4));
	}

	@Test
	public void testNaoAtingiu4() {
		assertFalse(fazenda.VerificarQueda(meteoro5));
	}
	
	@Test
	public void testChuvaMeteoro() {
		ArrayList<Coordenada> chuvaMeteoro = new ArrayList<Coordenada>();
		chuvaMeteoro.add(new Coordenada(5, 5));
		chuvaMeteoro.add(new Coordenada(51, 51));
		chuvaMeteoro.add(new Coordenada(5, 70));
		chuvaMeteoro.add(new Coordenada(0, 0));
		chuvaMeteoro.add(new Coordenada(0, 5));
		chuvaMeteoro.add(new Coordenada(7, 7));
		chuvaMeteoro.add(new Coordenada(35, 35));
		
		assertEquals(3, fazenda.ContabilizarMeteoros(chuvaMeteoro));
	}


}
