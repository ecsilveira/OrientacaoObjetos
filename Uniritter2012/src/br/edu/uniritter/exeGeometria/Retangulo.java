package br.edu.uniritter.exeGeometria;

public class Retangulo extends Figura {

	protected double base, altura;
	
	public Retangulo (double base, double altura){
		this.base = base;
		this.altura = altura;
	}

	public double calculaArea() { 
		return base * altura; 
	}
	
	public double calculaPerimetro() { 
		return 2 * ( base +	altura ); 
	}
}
