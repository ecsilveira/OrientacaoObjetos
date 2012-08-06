package br.edu.uniritter.GerCampeonato;

public class Classificacao {

	private Equipe equipe;
	private int pontos;
	private int golsPros;
	private int golsContra;
	
	public Classificacao(Equipe equipe) {
		this.equipe = equipe;
	}
	
	public Equipe getEquipe() {
		return equipe;
	}

	public int getPontos() {
		return pontos;
	}
	
	public void addPontos(int pontos) {
		this.pontos = this.pontos + pontos;
	}
	
	public int getGolsPros() {
		return golsPros;
	}
	
	public void addGolsPros(int golsPros) {
		this.golsPros = this.golsPros + golsPros;
	}
	
	public int getGolsContra() {
		return golsContra;
	}
	
	public void addGolsContra(int golsContra) {
		this.golsContra = this.golsContra + golsContra;
	}
	
	public boolean timeIgual(Equipe equipe){
		return this.equipe.equals(equipe);
	}
	
	public int getSaldoGols() {
		return this.golsPros - this.golsContra;
	}
	
}
