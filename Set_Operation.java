//23. Write a Java program to perform the following operations on a Set: 
//Add elements to the set, Remove elements from the set, Check if an element
//exists in the set, Iterate over the elements of the set using an Iterator.
package POE_Questions;

import java.util.HashSet;
import java.util.Iterator;	
import java.util.Set;
public class Set_Operation {
	    public static void main(String[] args) {
	        // Create a Set
	        Set<String> set = new HashSet<>();

	        // Add elements to the Set
	        set.add("Apple");
	        set.add("Banana");
	        set.add("Cherry");
	        System.out.println("Set after adding elements: " + set);

	        // Remove an element from the Set
	        set.remove("Banana");
	        System.out.println("Set after removing 'Banana': " + set);

	        // Check if an element exists in the Set
	        boolean containsCherry = set.contains("Cherry");
	        System.out.println("Does the set contain 'Cherry'? " + containsCherry);

	        boolean containsBanana = set.contains("Banana");
	        System.out.println("Does the set contain 'Banana'? " + containsBanana);

	        // Iterate over the elements of the Set using an Iterator
	        System.out.println("Iterating over the set elements:");
	        Iterator<String> iterator = set.iterator();
	        while (iterator.hasNext()) {
	            String element = iterator.next();
	            System.out.println(element);
	        }
	    }
	}
