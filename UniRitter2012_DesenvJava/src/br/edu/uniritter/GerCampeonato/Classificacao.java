package br.edu.uniritter.GerCampeonato;

public class Classificacao {

	private Equipe equipe;
	private int pontos;
	private int golsPros;
	private int golsContra;
	private int vitorias;
	private int derrotas;
	private int empates;
	
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

	public int getVitorias() {
		return vitorias;
	}

	public void addVitorias() {
		this.vitorias++;
		this.addPontos(3);
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void addDerrotas() {
		this.derrotas++;
	}

	public int getEmpates() {
		return empates;
	}

	public void addEmpates() {
		this.empates++;
		this.addPontos(1);
	}
	
}
