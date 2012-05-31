package br.edu.uniritter.exercicioConta;

public class Conta {

	private int numero;
	private float saldo;
	
	public Conta(int n) {
		this.numero = n;
	}

	public Conta(int n, float s) {
		this.numero = n;
		this.saldo = s;
	}

	public void deposita(float quantia) {
		this.saldo += quantia;
	}

	public void saca(float quantia) throws ContaExcecao {
		if (this.saldo >= quantia){
			this.saldo -= quantia;
		}
		else
		{ 
			ContaExcecao ce = new ContaExcecao(Enum_FalhaConta.SALDO_INSUFICIENTE);
			throw ce;
		}
	}

	public float verificaSaldo() {
		return this.saldo;
	}

	public int retornaNumeroConta() {
		return this.numero;
	}

}
