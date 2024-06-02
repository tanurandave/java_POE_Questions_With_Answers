//Write a Program to demonstrate passing and returning Objects to  and from method


package POE_Questions;

class Person {
	 String name;
	 int age;

	 Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person{" + "name='" + name  + ", age=" + age + '}';
	}
}

public class Object_Passing_Returning_Q2 {
	public static void main(String[] args) {
		Person person1 = new Person("Alice", 30);
		Person person2 = new Person("Bob", 25);

		System.out.println("Before passing to method:");
		System.out.println("Person 1: " + person1);
		System.out.println("Person 2: " + person2);

		// Passing objects to a method
		swapPersons(person1, person2);

		System.out.println("\nAfter passing to method:");
		System.out.println("Person 1: " + person1);
		System.out.println("Person 2: " + person2);

		// Returning an object from a method
		Person olderPerson = getOlderPerson(person1, person2);
		System.out.println("\nThe older person is: " + olderPerson);
	}

	// Method to swap two Person objects
	public static void swapPersons(Person p1, Person p2) {
		Person temp = p1;
		p1 = p2;
		p2 = temp;
	}

	// Method to return the older Person object
	public static Person getOlderPerson(Person p1, Person p2) {
		return (p1.getAge() > p2.getAge()) ? p1 : p2;
	}
}
