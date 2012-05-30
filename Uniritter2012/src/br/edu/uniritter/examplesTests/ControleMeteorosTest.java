package br.edu.uniritter.examplesTests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import br.edu.uniritter.examples.ControleMeteoros;
import br.edu.uniritter.examples.Meteoro;
import br.edu.uniritter.exercicioFazenda.Coordenada;
import br.edu.uniritter.exercicioFazenda.Fazenda;

public class ControleMeteorosTest {

	Fazenda fazenda;
	Meteoro meteoro, meteoro2, meteoro3, meteoro4, meteoro5;
	
	@Test
	public void testChuvaMeteoro() {
		fazenda = new Fazenda(new Coordenada(1, 1), new Coordenada(50, 50));
		
		ArrayList<Meteoro> chuvaMeteoro = new ArrayList<Meteoro>();
		chuvaMeteoro.add(new Meteoro(new Coordenada(5, 5)));
		chuvaMeteoro.add(new Meteoro(new Coordenada(51, 51)));
		chuvaMeteoro.add(new Meteoro(new Coordenada(5, 70)));
		chuvaMeteoro.add(new Meteoro(new Coordenada(0, 0)));
		chuvaMeteoro.add(new Meteoro(new Coordenada(0, 5)));
		chuvaMeteoro.add(new Meteoro(new Coordenada(7, 7)));
		chuvaMeteoro.add(new Meteoro(new Coordenada(35, 35)));
		
		assertEquals(3, ControleMeteoros.ContabilizarMeteoros(fazenda, chuvaMeteoro));
	}

}
