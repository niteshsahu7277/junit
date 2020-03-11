package junitdemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calc;
	@Before
	public void setUp() throws Exception{
		calc=new Calculator();
	}
	@Test
	public void testAdd() {
		double result=calc.add(10,20.001);
		assertEquals(30,result,00.2);
	}

	@Test
	public void testSubtract() {
		double result=calc.subtract(100.5,100);
		assertEquals(0.5,result,0);
	}

	@Test
	public void testMultiply() {
		double result=calc.multiply(10,20);
		assertEquals(200,result,0.001);
		
	}

	@Test
	public void testDivide() {
		double result=calc.divide(100,10);
		assertEquals(10,result,0);
	}
	@After
	public void tearDown()throws Exception{
		calc=null;
	}
}
