//20. Write a Java program to remove duplicates from an ArrayList
//without using any library functions.

package POE_Questions;

import java.util.ArrayList;

public class Remove_Duplicate_without_using_BuiltInLibrary_method {

	public static void main(String[] args) {
		// Create an ArrayList with duplicates
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(3);
		list.add(5);

		System.out.println("Original list: " + list);

		// Remove duplicates
		removeDuplicates(list);

		System.out.println("List after removing duplicates: " + list);
	}

	public static void removeDuplicates(ArrayList<Integer> list) {
		// Iterate through the list
		for (int i = 0; i < list.size(); i++) {
			Integer currentElement = list.get(i);
			// Check for duplicates of the current element
			for (int j = i + 1; j < list.size(); j++) {
				if (currentElement.equals(list.get(j))) {
					// Remove the duplicate element
					list.remove(j);
					// Decrement the index to check the next element correctly
					j--;
				}
			}
		}
	}
}
