package br.edu.uniritter.GerCampeonato;

public class Partida {

	private Equipe mandante;
	private Equipe visitante;
	private int[] placar = new int[2]; 
	
	public Partida(Equipe mandante, Equipe visitante) {
		this.mandante = mandante;
		this.visitante = visitante;
	}

	public Equipe getMandante() {
		return mandante;
	}

	public Equipe getVisitante() {
		return visitante;
	}

	public int[] getPlacar() {
		return placar;
	}

	public void setPlacar(Campeonato campeonato, int[] placar) {
		this.placar = placar;
		campeonato.atualizarClassificacao(this);
	}
	
	public void setPlacar(int[] placar) {
		this.placar = placar;
	}
	
	public boolean equals(Partida partida)
	{	
		return this.mandante.equals(partida.mandante) && 
				this.visitante.equals(partida.visitante) &&
				this.equalsPlacar(partida);	
	}
	
	public boolean equalsPlacar(Partida partida)
	{
		return (this.getPlacar()[0] == partida.getPlacar()[0]) &&
				(this.getPlacar()[1] == partida.getPlacar()[1]);
	}
	
}
