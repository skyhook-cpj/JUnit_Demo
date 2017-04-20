package org.FirstDemo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Test;
import org.FirstDemo.Calculator;

public class CalculatorTest {
	
	private int addOperator = 1;
	private int subtractOperator = 2;
	private int multiplyOperator = 3;
	private int divideOperator = 4;
	private Calculator calc;

	@Test
	public void testPerformCalcuationForAddition() {
		//Comments here
		
		calc = new Calculator();
		
		double a = 0;
		double b = 4;
		
		// test for addition scenario
		calc.performCalculation(a, b, addOperator);
		assertEquals("4.0", calc.getAnswerField());
		
		a = 9;
		b = 9;
		
		calc.performCalculation(a, b, addOperator);
		assertEquals("18.0", calc.getAnswerField());
		
	}
	
	@Test
	public void testPerformCalcuationForSubtraction() {
		
		calc = new Calculator();
		
		double a = 0;
		double b = 4;
		
		// test for addition scenario
		calc.performCalculation(a, b, subtractOperator);
		assertEquals("-4.0", calc.getAnswerField());
		
		a = 9;
		b = 9;
		
		calc.performCalculation(a, b, subtractOperator);
		assertEquals("0.0", calc.getAnswerField());
		
	}
	
	@Test
	public void testPerformCalcuationForMultiplication() {
		
		calc = new Calculator();
		
		double a = 0;
		double b = 4;
		
		// test for addition scenario
		calc.performCalculation(a, b, multiplyOperator);
		assertEquals("0.0", calc.getAnswerField());
		
		a = 9;
		b = 9;
		
		calc.performCalculation(a, b, multiplyOperator);
		assertEquals("81.0", calc.getAnswerField());
		
	}
	
	@Test
	public void testPerformCalcuationForDivision() {
		
		calc = new Calculator();
		
		double a = 0;
		double b = 4;
		
		// test for addition scenario
		calc.performCalculation(a, b, divideOperator);
		assertEquals("0.0", calc.getAnswerField());
		
		a = 9;
		b = 9;
		
		calc.performCalculation(a, b, divideOperator);
		assertEquals("1.0", calc.getAnswerField());
		
	}
	
	@After
	public void tearDown()
	{
		calc.getFrame().invalidate();
		calc.getFrame().dispose();
	}
}
