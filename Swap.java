package javaprogram;

public class Swap {
	public static void swap1(int x,int y) {
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swapping:"+x+","+y);
	}
	public static void swap2(int x,int y) {
		int temp=x;
		x=y;
		y=temp;
		System.out.println("after swapping:"+x+","+y);
	}
	public static void main(String[] args) {
		swap1(11,22);
		swap2(33,44);
	}

}
