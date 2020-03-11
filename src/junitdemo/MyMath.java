package junitdemo;

public class MyMath {

	public MyMath() {
		// TODO Auto-generated constructor stub
	}
	int sum(int[] numbers){
		int sum=0;
		for(int i:numbers){
			sum+=i;
		}
		return sum;
	}

}
