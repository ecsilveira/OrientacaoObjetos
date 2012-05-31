package br.edu.uniritter.exeCifraCesar;

public class CifraCesar {

	public CifraCesar() {
		this.deslocamento = 3;
	}

	private int deslocamento;

	public static final char[] alfabeto = { 'A', 'B', 'C', 'D', 'E', 'F', 'G',
			'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
			'U', 'V', 'W', 'X', 'Y', 'Z' };

	public char Cifrar(char caracter) throws CifraCesarExcecao {
		int posicao = -1;

		for (int i = 0; i < alfabeto.length; i++) {
			if (alfabeto[i] == caracter) {
				posicao = i;
			}
		}

		if (posicao == -1) {
			CifraCesarExcecao cce = new CifraCesarExcecao(
					Enum_FalhaCifraCesar.CARACTER_DESCONHECIDO);
			throw cce;
		}

		return alfabeto[(posicao + this.deslocamento) % alfabeto.length];
	}

	public String CifrarTexto(String textoOriginal, int deslocamento) {
		char texto[] = textoOriginal.toUpperCase().toCharArray();
		this.deslocamento = deslocamento;
		StringBuilder novoTexto = new StringBuilder();

		for (char c : texto) {
			if (c == ' ')
				novoTexto.append(" ");
			else
				try {
					novoTexto.append(Cifrar(c));
				} catch (CifraCesarExcecao cce) {
					System.out.println(cce.Mensagem(cce.getFalha(), String.valueOf(c)));
				}
		}

		return novoTexto.toString().toLowerCase();
	}
}
