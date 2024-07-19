package labNo21;

import java.util.Scanner;

public class StringEndWith {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt the user for the main string
	        System.out.print("Enter the main string: ");
	        String mainString = scanner.nextLine();
	        
	        // Prompt the user for the ending string
	        System.out.print("Enter the ending string to check: ");
	        String endingString = scanner.nextLine();
	        
	        // Check if the main string ends with the ending string
	        boolean result = mainString.endsWith(endingString);
	        
	        // Display the result
	        System.out.println("Does the main string end with the ending string? " + result);
	        
	        scanner.close();
	}


}
