package org.gyt.classdesign;

//Shape.java
class Shape {
	public double area() {
		return 0;
	} // default implementation
	// other members
}

// Circle.java
class Circle extends Shape {
	private int radius;

	public Circle(int r) {
		radius = r;
	}

	// other constructors
	public double area() {
		return Math.PI * radius * radius;
	}
	// other declarations
}

// Square.java
class Square extends Shape {
	private int side;

	public Square(int a) {
		side = a;
	}

	public double area() {
		return side * side;
	}
	// other declarations
}

// TestShape.java
class TestShape {
	public static void main(String[] args) {
		Shape shape1 = new Circle(10);
		System.out.println(shape1.area());
		Shape shape2 = new Square(10);
		System.out.println(shape2.area());
	}
}