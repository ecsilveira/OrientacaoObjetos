package br.edu.uniritter.examples;

import br.edu.uniritter.exercicioFazenda.Coordenada;

public class Meteoro {

	private Coordenada coordenada;
	
	public Coordenada getCoordenada() {
		return coordenada;
	}

	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}

	public Meteoro(Coordenada coord) {
		this.coordenada = coord;
	}
	
	

}
