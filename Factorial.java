package javaprogram;

public class Factorial {

	public static void main(String[] args) {
		int x=5,i,fact=1;
		for(i=x;i>0;i--) {
			fact=fact*i;
		}
		System.out.println("factorial of "+x+" is "+fact);
	}

}
