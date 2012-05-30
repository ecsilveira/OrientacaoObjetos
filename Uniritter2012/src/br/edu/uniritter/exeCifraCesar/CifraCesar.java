package br.edu.uniritter.exeCifraCesar;

public class CifraCesar {

	public CifraCesar() {
		this.deslocamento = 3;
	}

	private int deslocamento;
	
	public static final char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 
		'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	
	public char Cifrar(char caracter) {
		int posicao = 0;
		
		for (int i = 0; i < alfabeto.length; i++) {
			if (alfabeto[i] == caracter) {
				posicao = i;
			}
		}
		
		return alfabeto[(posicao+this.deslocamento) % alfabeto.length];
	}

	public String CifrarTexto(String textoOriginal, int deslocamento) {
		char texto[] = textoOriginal.toUpperCase().toCharArray();
		this.deslocamento = deslocamento;
		StringBuilder novoTexto = new StringBuilder();
		
		for (char c : texto) {
			if (c == ' ')
				novoTexto.append(" ");
			else
				novoTexto.append(Cifrar(c));
		}
		
		return novoTexto.toString().toLowerCase();
	}
}
