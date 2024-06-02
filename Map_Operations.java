//24. Write a Java program to perform the following operations on a Map: 
//Add key-value pairs to the map, Remove key-value pairs from the map, 
//Check if a key exists in the map, Iterate over the keys and values of the map using an Iterator.
package POE_Questions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Map_Operations {

	public static void main(String[] args) {
		// Create a Map
		Map<Integer, String> map = new HashMap<>();

		// Add key-value pairs to the Map
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		System.out.println("Map after adding elements: " + map);

		// Remove a key-value pair from the Map
		map.remove(2);
		System.out.println("Map after removing key 2: " + map);

		// Check if a key exists in the Map
		boolean containsKey1 = map.containsKey(1);
		System.out.println("Does the map contain key 1? " + containsKey1);

		boolean containsKey2 = map.containsKey(2);
		System.out.println("Does the map contain key 2? " + containsKey2);

		// Iterate over the keys and values of the Map using an Iterator
		System.out.println("Iterating over the map entries:");
		Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}
