//18. Write a Java program to demonstrate sorting using Comparable.
//19. Write a Java program to demonstrate sorting using Comparator.
package POE_Questions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person1 implements Comparable<Person1> {
    private String name;
    private int age;

    public Person1(String name, int age) {
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
    public int compareTo(Person1 other) {
        // Compare based on age
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Comparator_Sorting {

	public static void main(String[] args) {
        List<Person1> peopleList = new ArrayList<>();
        peopleList.add(new Person1("John", 30));
        peopleList.add(new Person1("Alice", 25));
        peopleList.add(new Person1("Bob", 35));

        // Sorting using Comparable (by age)
        System.out.println("Sorted by age (Comparable):");
        Collections.sort(peopleList);
        for (Person1 person : peopleList) {
            System.out.println(person);
        }

        // Sorting using Comparator (by name)
        System.out.println("\nSorted by name (Comparator):");
        Comparator<Person1> nameComparator = Comparator.comparing(Person1::getName);
        Collections.sort(peopleList, nameComparator);
        for (Person1 person : peopleList) {
            System.out.println(person);
        }
    }
}