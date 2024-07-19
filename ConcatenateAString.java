package labNo21;
	
	import java.util.Scanner;

	public class ConcatenateAString {
	
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        // the first string
		        System.out.print("Enter the first string: ");
		        String firstString = scanner.nextLine();
		        
		        // the second string
		        System.out.print("Enter the second string to concatenate: ");
		        String secondString = scanner.nextLine();
		        
		        // Concatenate the two strings
		        String concatenatedString = firstString.concat(secondString);
		        
		        // the result
		        System.out.println("The concatenated string is: " + concatenatedString);
		        
		        scanner.close();
		    
		}

}
