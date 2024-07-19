package labNo43;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashListMapping {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Creating a HashMap to store key-value pairs
	        Map<String, String> map = new HashMap<>();
	        
	        // Asking the user to enter key-value pairs
	        System.out.print("Enter the number of key-value pairs: ");
	        int numPairs = scanner.nextInt();
	        scanner.nextLine(); // Consume newline
	        
	        for (int i = 0; i < numPairs; i++) {
	            System.out.print("Enter key for pair " + (i + 1) + ": ");
	            String key = scanner.nextLine();
	            System.out.print("Enter value for pair " + (i + 1) + ": ");
	            String value = scanner.nextLine();
	            map.put(key, value);
	        }
	        
	        // Counting the number of mappings in the map
	        int size = map.size();
	        System.out.println("Number of key-value mappings in the map: " + size);
	        
	        scanner.close();
	    }
	


}
