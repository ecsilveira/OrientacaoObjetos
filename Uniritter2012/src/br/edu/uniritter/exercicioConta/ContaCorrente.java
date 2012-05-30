package br.edu.uniritter.exercicioConta;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numero, float quantia) {
		super(numero);
		// TODO Auto-generated constructor stub
		this.deposita(quantia);
	}

}
