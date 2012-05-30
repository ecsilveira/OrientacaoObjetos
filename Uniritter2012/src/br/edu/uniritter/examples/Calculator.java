package br.edu.uniritter.examples;

public class Calculator {

	private double firstValue;
	private double secondValue;
	
	public Calculator(double a, double b){
		this.firstValue = a;
		this.secondValue = b;
	}
	
	public Calculator(double a){
		this.firstValue = a;
	}
	
	public double add(){
		return this.firstValue + this.secondValue;
	}
	
	public double sub(){
		return this.firstValue - this.secondValue;
	}
	
	public double multiply(){
		return this.firstValue * this.secondValue;
	}
	
	public double divide(){
		return this.firstValue / this.secondValue;
	}
	
	public double factorial(){
		/*
		double result = 1;
		for (double i = a; i > 1; i--) {
			result = result * i;
		}
		return result;
		*/
		if (this.firstValue <= 1) {
			return 1;
		}
		this.firstValue = this.firstValue-1;
		return (this.firstValue+1) * factorial();
	}
}
