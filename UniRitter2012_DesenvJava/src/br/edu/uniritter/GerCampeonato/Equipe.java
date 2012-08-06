package br.edu.uniritter.GerCampeonato;

public class Equipe {

	private String nome;

	public Equipe(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean equals(Equipe equipe){
		return this.nome.equals(equipe.getNome());
	}
	
}
