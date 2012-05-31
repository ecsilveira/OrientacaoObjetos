package br.edu.uniritter.exercicioConta;

public class ContaExcecao extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ContaExcecao(Enum_FalhaConta falha) {
		this.falha = falha;
	}

	private Enum_FalhaConta falha;

	public Enum_FalhaConta getFalha() {
		return falha;
	}
	
	public String Mensagem(Enum_FalhaConta falha){
		switch (falha) {
		case SALDO_INSUFICIENTE:
			return "Saldo insuficiente para saque.";
		default:
			return "Falha desconhecida.";
		}
	}

}
