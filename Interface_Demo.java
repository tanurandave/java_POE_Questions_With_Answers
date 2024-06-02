//9. Write a Java program to demonstrate the use of an interface.
package POE_Questions;

interface Shapes {
	double calculateArea();
}
class Reactangle implements Shapes {
	 double length;
	 double width;

	public Reactangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public double calculateArea() {
		return length * width;
	}
}

class Circle implements Shapes {
	 double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}

public class Interface_Demo {

	public static void main(String[] args) {
		Reactangle r = new Reactangle(5, 3);
		Circle c = new Circle(4);

		Shapes s1 = r;
		Shapes s2 = c;

		System.out.println("Area of Circle: " + s2.calculateArea());
		System.out.println("Area of rectangle: " + s1.calculateArea());
	}
}