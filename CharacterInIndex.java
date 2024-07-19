package labNo21;

import java.util.Scanner;


	public class CharacterInIndex {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user for a string
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();
	        
	        // Prompt the user for an index
	        System.out.print("Enter an index: ");
	        int index = scanner.nextInt();
	        
	        // Check if the index is within the string bounds
	        if (index >= 0 && index < inputString.length()) {
	            // Get the character at the given index
	            char character = inputString.charAt(index);
	            System.out.println("The character at index " + index + " is: " + character);
	        } else {
	            System.out.println("Index is out of bounds for the given string.");
	        }
	        
	        scanner.close();
	  
	}


}
