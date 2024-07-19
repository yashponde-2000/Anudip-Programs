package labNo21;

import java.util.Scanner;
	

public class StringContainTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the main string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        
        // Prompt the user for the sequence to check
        System.out.print("Enter the sequence of characters to check: ");
        String charSequence = scanner.nextLine();
        
        // Check if the main string contains the sequence
        boolean contains = mainString.contains(charSequence);
        
        // Display the result
        System.out.println("Does the main string contain the sequence? " + contains);
        
        scanner.close();
    }
}
