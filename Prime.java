package javaprogram;

public class Prime {
	public static void prime(int x) {
		int count=0;
		for(int i=2;i<x;i++) {
			if(x%i==0) {
				count+=1;
			}
		}
		if(count==0) {
			System.out.println("is prime");
			}
		else {
			System.out.println("not prime");
		}
	}

	public static void main(String[] args) {
		int n=60;
		prime(n);
	}
}
