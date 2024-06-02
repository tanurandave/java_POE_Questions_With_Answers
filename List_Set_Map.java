//21. Write a Java program to demonstrate the use of Iterator to iterate over elements of a List, Set, and Map.
package POE_Questions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class List_Set_Map {
	    public static void main(String[] args) {
	        // Example with List
	        List<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");

	        System.out.println("Iterating over List:");
	        Iterator<String> listIterator = list.iterator();
	        while (listIterator.hasNext()) {
	            String element = listIterator.next();
	            System.out.println(element);
	        }

	        // Example with Set
	        Set<String> set = new HashSet<>();
	        set.add("Dog");
	        set.add("Cat");
	        set.add("Bird");

	        System.out.println("\nIterating over Set:");
	        Iterator<String> setIterator = set.iterator();
	        while (setIterator.hasNext()) {
	            String element = setIterator.next();
	            System.out.println(element);
	        }

	        // Example with Map
	        Map<Integer, String> map = new HashMap<>();
	        map.put(1, "One");
	        map.put(2, "Two");
	        map.put(3, "Three");

	        System.out.println("\nIterating over Map:");
	        Iterator<Map.Entry<Integer, String>> mapIterator = map.entrySet().iterator();
	        while (mapIterator.hasNext()) {
	            Map.Entry<Integer, String> entry = mapIterator.next();
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
	    }
	}
