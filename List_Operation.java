//22. Write a Java program to perform the following operations on a List: Add elements to the list,
//Remove elements from the list, Check if an element exists in the list, Retrieve an element 
//at a specific index.
package POE_Questions;
import java.util.ArrayList;

import java.util.List;

public class List_Operation {

	public static void main(String[] args) {

		        List<String> list = new ArrayList<>();

		        // Add elements to the List
		        list.add("Apple");
		        list.add("Banana");
		        list.add("Cherry");
		        System.out.println("List after adding elements: " + list);

		        // Remove an element from the List
		        list.remove("Banana");
		        System.out.println("List after removing 'Banana': " + list);

		        // Check if an element exists in the List
		        boolean containsCherry = list.contains("Cherry");
		        System.out.println("Does the list contain 'Cherry'? " + containsCherry);

		        boolean containsBanana = list.contains("Banana");
		        System.out.println("Does the list contain 'Banana'? " + containsBanana);

		        // Retrieve an element at a specific index
		        String firstElement = list.get(0);
		        System.out.println("Element at index 0: " + firstElement);

		        // Handling case when index is out of bounds
		        try {
		            String thirdElement = list.get(2);
		            System.out.println("Element at index 2: " + thirdElement);
		        } catch (IndexOutOfBoundsException e) {
		            System.out.println("Error: " + e.getMessage());
		        }
		    }
		}
