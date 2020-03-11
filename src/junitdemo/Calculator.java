package junitdemo;

public class Calculator {
	public double add(double a,double b){
		return (a+b);
	}
	public double subtract(double a,double b){
		return (a-b);
	}
	public double multiply(double a,double b){
		return (a*b);
	}
	public double divide(double a,double b){
		if(b==0){
			throw new ArithmeticException("Error: Attempting to dividew by zero");
		}
		return (a/b);
	}
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println("Addition: "+c.add(3.4,7.8));
		System.out.println("Subtraction: "+c.subtract(9.4,7.8));
		System.out.println("Products: "+c.multiply(3.0,9.0));
		System.out.println("Division: "+c.divide(6.0,3.0));
	}

}
