package br.edu.uniritter.exercicioConta;

public class ContaExcecao extends Exception{

	public ContaExcecao(Enum_FalhaConta falha) {
		this.falha = falha;
	}

	private Enum_FalhaConta falha;

	public Enum_FalhaConta getFalha() {
		return falha;
	}

}
