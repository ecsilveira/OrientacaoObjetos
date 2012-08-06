package br.edu.uniritter.GerCampeonatoTests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.GerCampeonato.Equipe;
import br.edu.uniritter.GerCampeonato.Partida;

public class PartidaTest {

	private Equipe mandante;
	private Equipe visitante;
	private Partida partida;
	
	@Before
	public void setUp() throws Exception {
		mandante = new Equipe("Equipe1");
		visitante = new Equipe("Equipe2");
		partida = new Partida(mandante, visitante);		
	}

	@Test
	public void testAtribuirPlacar() {
		int[] placar = new int[2];
		placar[0] = 1;
		placar[1] = 2;
		
		partida.setPlacar(placar);
		assertEquals(placar, partida.getPlacar());
	}

}
