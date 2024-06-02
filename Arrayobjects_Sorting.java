//17. Write a Java program to demonstrate sorting Arrays of Objects.

package POE_Questions;

import java.util.Arrays;

 class Employee implements Comparable < Employee > {
    private int id;
    private String name;
    private int salary;


    public Employee(int id, String name, int salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
    @Override
    public int compareTo(Employee o) {
        return this.salary - o.salary;
    }
}

public class Arrayobjects_Sorting {

	public static void main(String[] args) {
		 Employee[] employees = {
		            new Employee(10, "Ramesh", 50000),
		            new Employee(20, "Tom", 60000),
		            new Employee(30, "John", 80000),
		            new Employee(40, "Tony", 30000)
		        };

		        // ascending order
		        System.out.println("Before sorting => " + Arrays.toString(employees));
		        Arrays.sort(employees); // ascending order
		        System.out.println("After sorting => " + Arrays.toString(employees));
		    }
	}
