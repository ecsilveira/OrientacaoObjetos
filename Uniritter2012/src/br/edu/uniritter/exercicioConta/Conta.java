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

	public void saca(float quantia) {
		if (this.saldo >= quantia){
			this.saldo -= quantia;
		}
	}

	public float verificaSaldo() {
		return this.saldo;
	}

	public int retornaNumeroConta() {
		return this.numero;
	}

}
