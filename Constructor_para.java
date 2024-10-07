package javaprogram;

public class Constructor_para {
	int x;
	public Constructor_para(int y) {
		x=y;
	}
	public static void main(String[] args) {
		Constructor_para myObj = new Constructor_para(7);
		System.out.println(myObj.x);
	}

}
