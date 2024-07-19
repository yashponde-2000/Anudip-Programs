package labNo43;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class HashList {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Create a hash list
	        ArrayList<String> hashList = new ArrayList<>();

	        // Prompt the user to enter the size of the hash list
	        System.out.print("Enter the size of the hash list: ");
	        int size = scanner.nextInt();

	        // Prompt the user to enter the elements of the hash list
	        System.out.println("Enter the elements of the hash list:");
	        for (int i = 0; i < size; i++) {
	            String element = scanner.next();
	            hashList.add(element);
	        }

	        // Iterate through all elements in the hash list
	        System.out.println("Elements in the hash list:");
	        Iterator<String> iterator = hashList.iterator();
	        while (iterator.hasNext()) {
	            String element = iterator.next();
	            System.out.println(element);
	        }

	        scanner.close();
	    }	
}
