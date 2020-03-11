package junitdemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyMathTest {

	MyMath myMath=new MyMath();

	@Test
	public void sum_with3Numbers() {
		System.out.println("Test1");
		assertEquals(6, myMath.sum(new int[]{1,2,3} ));
	}

	@Test
	public void sum_with1Numbers() {
		System.out.println("Test1");
		assertEquals(3, myMath.sum(new int[]{3} ));
	}


}
