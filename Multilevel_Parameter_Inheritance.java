//6. Write a Java program to demonstrate multilevel inheritance with parameterized constructors.

package POE_Questions;

class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class Dog extends Animal {
	private String breed;

	public Dog(String name, String breed) {
		super(name);
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}
}

class Labrador extends Dog {
	private int age;

	public Labrador(String name, String breed, int age) {
		super(name, breed);
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}

public class Multilevel_Parameter_Inheritance {

	public static void main(String[] args) {
		Labrador myLabrador = new Labrador("Max", "Labrador Retriever", 5);

		System.out.println("Name: " + myLabrador.getName());
		System.out.println("Breed: " + myLabrador.getBreed());
		System.out.println("Age: " + myLabrador.getAge());

	}

}
