package labNo43;

import java.util.*;

public class FirstAndLastOccurrenceInLinkedlist {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Create a LinkedList to store user input
	        LinkedList<Integer> linkedList = new LinkedList<>();

	        // Ask user to enter elements for the LinkedList
	        System.out.print("Enter the number of elements in the list: ");
	        int numElements = scanner.nextInt();
	        System.out.println("Enter the elements:");
	        for (int i = 0; i < numElements; i++) {
	            linkedList.add(scanner.nextInt());
	        }

	        // Ask user for the elements to search for
	        System.out.print("Enter the element to find its first and last occurrence: ");
	        int element = scanner.nextInt();

	        // Find first occurrence
	        int firstIndex = linkedList.indexOf(element);
	        if (firstIndex == -1) {
	            System.out.println("Element not found in the list.");
	        } else {
	            System.out.println("First occurrence of " + element + " is at index: " + firstIndex);
	        }

	        // Find last occurrence
	        int lastIndex = linkedList.lastIndexOf(element);
	        if (lastIndex == -1) {
	            System.out.println("Element not found in the list.");
	        } else {
	            System.out.println("Last occurrence of " + element + " is at index: " + lastIndex);
	        }

	        scanner.close();
	    }
	

	
}
