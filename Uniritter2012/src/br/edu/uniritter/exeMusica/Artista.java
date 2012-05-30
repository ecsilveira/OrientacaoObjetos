package br.edu.uniritter.exeMusica;

public class Artista {
	
	private String nome;
	private String nacionalidade;
	private EstiloMusical estiloMusical;

	public Artista(String nome, String nacionalidade) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public EstiloMusical getEstiloMusical() {
		return estiloMusical;
	}

	public void setEstiloMusical(EstiloMusical estiloMusical) {
		this.estiloMusical = estiloMusical;
	}

}
