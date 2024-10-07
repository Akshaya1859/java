package javaprogram;

public class Constructor {
	int x;
	public Constructor() {
		x = 100;
	}

	public static void main(String[] args) {
		Constructor myObj = new Constructor();
		System.out.println(myObj.x);
	}

}
