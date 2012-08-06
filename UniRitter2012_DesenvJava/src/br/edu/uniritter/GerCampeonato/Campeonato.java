package br.edu.uniritter.GerCampeonato;

import java.util.ArrayList;

public class Campeonato {

	private ArrayList<Classificacao> classificados;
	private ArrayList<Partida> partidas;
	
	public ArrayList<Partida> getPartidas() {
		return partidas;
	}

	public boolean InscreverEquipe(Equipe equipe) {
		if (this.PersistirInscricao(equipe))
		{
			classificados.add(new Classificacao(equipe));
			return true;
		}
		
		return false;
	}

	public Campeonato() {
		classificados = new ArrayList<Classificacao>();
		partidas = new ArrayList<Partida>();
	}

	private boolean PersistirInscricao(Equipe equipe) {
		for (Classificacao classificado : classificados) {
			if (classificado.getEquipe().getNome().equals(equipe.getNome()))
				return false;
		}
		return true;		
	}

	public int GerarCalendario() {
		ArrayList<Equipe> equipes = new ArrayList<Equipe>();
		for (Classificacao classificado : classificados) {
			equipes.add(classificado.getEquipe());
		}
		ArrayList<Equipe> visitantes =  (ArrayList<Equipe>) equipes.clone();
		ArrayList<Equipe> mandantes =  (ArrayList<Equipe>) equipes.clone();
		
		for (Equipe mandante : mandantes) {
			for (Equipe visitante : visitantes) {
				if (!mandante.equals(visitante))
					partidas.add(new Partida(mandante, visitante));
			}
		}
		
		return partidas.size();
	}

	public void atualizarClassificacao(Partida partida) {
		for (Classificacao classificado : classificados) {
			if (classificado.getEquipe().equals(partida.getMandante()))
			{
				classificado.addGolsPros(partida.getPlacar()[0]);
				classificado.addGolsContra(partida.getPlacar()[1]);
				
				if (partida.getPlacar()[0] == partida.getPlacar()[1])
					classificado.addPontos(1);
				else
					if (partida.getPlacar()[0] > partida.getPlacar()[1])
						classificado.addPontos(3);
			}
			else
			{
				if (classificado.getEquipe().equals(partida.getVisitante()))
				{
					classificado.addGolsPros(partida.getPlacar()[0]);
					classificado.addGolsContra(partida.getPlacar()[1]);
					
					if (partida.getPlacar()[0] == partida.getPlacar()[1])
						classificado.addPontos(1);
					else
						if (partida.getPlacar()[0] > partida.getPlacar()[1])
							classificado.addPontos(3);
				}
			}
		}		
	}

	public ArrayList<Classificacao> getClassificados() {
		return classificados;
	}
	
}
