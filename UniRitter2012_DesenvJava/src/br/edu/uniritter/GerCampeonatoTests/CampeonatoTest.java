package br.edu.uniritter.GerCampeonatoTests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.GerCampeonato.Campeonato;
import br.edu.uniritter.GerCampeonato.Equipe;
import br.edu.uniritter.GerCampeonato.Partida;

public class CampeonatoTest {

	private Campeonato campeonato;
	private ArrayList<Equipe> equipes;
	private ArrayList<Partida> partidas;
	private Equipe equipe1 = new Equipe("Equipe1");
	private Equipe equipe2 = new Equipe("Equipe2");
	
	@Before
	public void setUp() throws Exception {
		campeonato = new Campeonato();
		campeonato.InscreverEquipe(equipe1);
		campeonato.InscreverEquipe(equipe2);
		//campeonato.InscreverEquipe(new Equipe("Equipe3"));
		//campeonato.InscreverEquipe(new Equipe("Equipe4"));
	}

	@Test
	public void testInscricaoExistente() {
		assertFalse(campeonato.InscreverEquipe(new Equipe("Equipe2")));
	}

	@Test
	public void testGerarCalendario() {
		assertEquals(2, campeonato.GerarCalendario());
	}
	
	@Test
	public void testGetPartidas() {
		campeonato.GerarCalendario();
		ArrayList<Partida> partidasTeste = new ArrayList<Partida>();
		Partida partida1 = new Partida(equipe1, equipe2);
		Partida partida2 = new Partida(equipe2, equipe1);

		partidas = campeonato.getPartidas();
		Partida p1 = partidas.get(0);
		Partida p2 = partidas.get(1);

		assertTrue(p1.equals(partida1) && p2.equals(partida2));
	}

	@Test
	public void testVerificaPlacares() {
		campeonato.GerarCalendario();
		partidas = campeonato.getPartidas();
		
		int[] placar1 = new int[2];
		placar1[0] = 1;
		placar1[1] = 2;
		Partida p1 = partidas.get(0);
		p1.setPlacar(campeonato, placar1);

		int[] placar2 = new int[2];
		placar2[0] = 1;
		placar2[1] = 3;
		Partida p2 = partidas.get(1);
		p2.setPlacar(campeonato, placar2);

		Partida partida1 = new Partida(equipe1, equipe2);
		Partida partida2 = new Partida(equipe2, equipe1);
		
		int[] placar3 = new int[2];
		placar3[0] = 1;
		placar3[1] = 2;
		partida1.setPlacar(placar3);

		int[] placar4 = new int[2];
		placar4[0] = 1;
		placar4[1] = 2;
		partida2.setPlacar(placar4);
		
		assertFalse(p1.equals(partida1) && p2.equals(partida2));
	}
	
}
