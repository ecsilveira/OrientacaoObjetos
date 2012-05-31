package br.edu.uniritter.exeCifraCesar;

public class CifraCesarExcecao extends Exception {

	public CifraCesarExcecao(Enum_FalhaCifraCesar falha) {
		super();
		this.falha = falha;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Enum_FalhaCifraCesar falha;
	public Enum_FalhaCifraCesar getFalha() {
		return falha;
	}
	
	public String Mensagem (Enum_FalhaCifraCesar falha, String complemento) {
		switch (falha) {
		case CARACTER_DESCONHECIDO:
			return "Caracter \"" + complemento + "\" não encontrado no alfabeto.";

		default:
			return "Falha desconhecida.";
		}
	}
	

}
