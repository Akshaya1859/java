package javaprogram;

public class Palindrome {

	public static void main(String[] args) {
		int x=121,r,sum=0;
		int temp=x;
		while(x>0) {
			r=x%10;
			sum=sum*10+r;
			x=x/10;
		}
		if(sum==temp) {
			System.out.println("is palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
