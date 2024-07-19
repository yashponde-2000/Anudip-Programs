package yashPackage;

import java.util.Scanner;

public class Positive_NegativeNumber {
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The number: ");
		
		int number =scanner.nextInt();
		scanner.close();
		if (number > 0)
		{
			System.out.println("This is Positive Number");
		}
		else if (number < 0)
		{
			System.out.println("This is Negative Number");
		}
		else
		{
			System.out.println("The Number is Zero");
		}
	}

}
