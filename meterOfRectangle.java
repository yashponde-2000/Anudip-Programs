package yashPackage;

import java.util.Scanner;

public class meterOfRectangle {

		    public static void main(String[] args) {

		        // create a Scanner object to read user input
		        Scanner input = new Scanner(System.in);

		        // declare variables to store the length and width of the rectangle
		        double height, width;

		        // prompt the user to enter the length of the rectangle in meters
		        System.out.print("Enter the length of the rectangle in meters: ");
		        // read the user input and assign it to the length variable
		        height = input.nextDouble();

		        // prompt the user to enter the width of the rectangle in meters
		        System.out.print("Enter the width of the rectangle in meters: ");
		        // read the user input and assign it to the width variable
		        width = input.nextDouble();

		        // close the Scanner object
		        input.close();

		        // display the length and width of the rectangle in meters
		        System.out.println("The height of the rectangle is " + height + " meters.");
		        System.out.println("The width of the rectangle is " + width + " meters.");
		    }
		
	}


