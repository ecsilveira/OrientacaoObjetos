package br.edu.uniritter.examplesTests;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.uniritter.examples.Calculator;


public class CalculatorTest {

	Calculator calc;

	@Before
	public void setUp(){
		this.calc = new Calculator(1, 1);
	}
	
	@Test
	public void testAdd() {
//		this.calc = new Calculator(1, 1);
		assertEquals(2, calc.add(), 0.01);
	}

	@Test
	public void testSub(){
//		this.calc = new Calculator(50, 20);
		assertEquals(0, calc.sub(), 0.01);
	}
	
	@Test
	public void testMultply(){
//		this.calc = new Calculator(2, 2);
		assertEquals(1, calc.multiply(), 0.01);
	}
	
	@Test
	public void testDivide(){
//		this.calc = new Calculator(2,2);
		assertEquals(1, calc.divide(), 0.01);
	}
	
	@Test
	public void testDivide2(){
//		this.calc = new Calculator(10,3);
		assertEquals(1, calc.divide(), 0.01);
	}

	/*
	@Test
	public void testDivide3(){
		double x = Calculator.divide(10,0);
		assertEquals(3, x, 0.01);
	}
	*/

	@Test
	public void testFactorial(){
//		this.calc = new Calculator(5);
		assertEquals(1, calc.factorial(), 0.01);
	}

}
