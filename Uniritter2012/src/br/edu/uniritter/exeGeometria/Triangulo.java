package br.edu.uniritter.exeGeometria;

public class Triangulo extends Figura{

	protected double lado1, lado2, lado3;
	
	public Triangulo (double lado1, double lado2, double lado3){
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public double calculaArea() {
		double sP = this.calculaPerimetro()/2;
		return Math.sqrt(sP*(sP-lado1)*(sP-lado2)*(sP-lado3));
	}

	public double calculaPerimetro() {
		return lado1 + lado2 + lado3;
	}
	
}
