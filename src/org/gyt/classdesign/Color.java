package org.gyt.classdesign;

public class Color {
	int red, green, blue;

	Color() {
		Color(10, 10, 10);
	}

	private void Color(int i, int j, int k) {
		// TODO Auto-generated method stub
		
	}

	Color(int r, int g, int b) {
		red = r;
		green = g;
		blue = b;
	}

	void printColor() {
		System.out.println("red: " + red + " green: " + green + " blue: " + blue);
	}

	public static void main(String[] args) {
		Color color = new Color();
		color.printColor();
	}

}
