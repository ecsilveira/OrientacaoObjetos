package br.edu.uniritter.examples;

import java.util.ArrayList;

import br.edu.uniritter.exercicioFazenda.Fazenda;

public class ControleMeteoros {
	
	public static int ContabilizarMeteoros(Fazenda fazenda, ArrayList<Meteoro> chuvaMeteoro) {
		int result = 0;
		for (Meteoro meteoro : chuvaMeteoro) {
			if (fazenda.VerificarQueda(meteoro.getCoordenada()))
			{
				result++;
			}
		}
		return result;
	}

}
