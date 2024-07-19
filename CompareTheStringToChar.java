package labNo21;

import java.util.Scanner;

public class CompareTheStringToChar {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user for the string
	        System.out.print("Enter the string: ");
	        String str = scanner.nextLine();
	        
	        // Prompt the user for the character sequence
	        System.out.print("Enter the character sequence to compare: ");
	        String charSequence = scanner.nextLine();
	        
	        // Compare the string to the character sequence
	        boolean areEqual = str.contentEquals(charSequence);
	        
	        // Display the result
	        System.out.println("The string and the character sequence are equal: " + areEqual);
	        
	        scanner.close();
	    
	}

}
