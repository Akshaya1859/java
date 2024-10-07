package javaprogram;

public class Adds_method{
	public static int add(int x,int y) {
		int z = x+y;
		return z;
	}
	public static void main(String[]args) {
		int a = 77;
		int b = 66;
		int c = add(a,b);
		System.out.println("Sum is "+c);
	}
}
