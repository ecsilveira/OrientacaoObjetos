package br.edu.uniritter.exeGeometria;

public class Circulo extends Figura{

	protected double raio;
	
	public static final double PI = 3.1415;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double calculaArea() { 
		return PI * raio * raio; 
	}
	
	public double calculaPerimetro() {
		return 2 * PI * raio;
	}

}
