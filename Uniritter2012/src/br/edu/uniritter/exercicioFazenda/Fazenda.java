package br.edu.uniritter.exercicioFazenda;

import java.util.ArrayList;

public class Fazenda {

	private Coordenada coordInicial;
	private Coordenada coordFinal;
	private int contMeteoros;

	public Fazenda(Coordenada coordInicial, Coordenada coordFinal) {
		this.coordInicial = coordInicial;
		this.coordFinal = coordFinal;
	}

	public boolean VerificarQueda(Coordenada coordenada) {
		return (coordenada.getLatitude() >= coordInicial.getLatitude() &&
			coordenada.getLatitude() <= coordFinal.getLatitude() &&
			coordenada.getLongitude() >= coordInicial.getLongitude() &&
			coordenada.getLongitude() <= coordFinal.getLongitude());		
	}
	
	public int ContabilizarMeteoros(ArrayList<Coordenada> chuvaMeteoro) {
		for (Coordenada meteoro : chuvaMeteoro) {
			if (this.VerificarQueda(meteoro))
			{
				contMeteoros++;
			}
		}
		return contMeteoros;
	}

}
