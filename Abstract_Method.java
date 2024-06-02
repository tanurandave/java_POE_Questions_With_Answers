//8. Write a Java program to demonstrate the use of an abstract method.
package POE_Questions;

abstract class Shape {
	public abstract double calculateArea();
}

class Rectangle extends Shape {
	 double length;
	 double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double calculateArea() {
		return length * width;
	}
}

class Square extends Shape {
	private double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double calculateArea() {
		return  side * side;
	}
}

public class Abstract_Method {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5, 3);
		Square s = new Square(4);

		System.out.println("Area of Rectangle: " + r1.calculateArea());
		System.out.println("Area of Square: " + s.calculateArea());
	}

}