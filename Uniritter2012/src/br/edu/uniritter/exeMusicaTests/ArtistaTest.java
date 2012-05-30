package br.edu.uniritter.exeMusicaTests;

import static org.junit.Assert.*;

import org.junit.Test;

import br.edu.uniritter.exeMusica.Artista;
import br.edu.uniritter.exeMusica.EstiloMusical;

public class ArtistaTest {

	@Test
	public void testGetEstiloMusical() {
		Artista artista = new Artista("Artista 1", "Brasileiro");
		artista.setEstiloMusical(EstiloMusical.ROCK);
		assertEquals(EstiloMusical.ROCK, artista.getEstiloMusical());
	}

}
