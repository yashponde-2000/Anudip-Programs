package yashPackage;

import java.util.Scanner;

public class areaAndParimeterRectangle {


	    // declare two private fields for length and width
	    private double length;
	    private double width;

	    // define a constructor that takes two parameters
	    public areaAndParimeterRectangle(double length, double width) {
	        // assign the parameters to the fields
	        this.length = length;
	        this.width = width;
	    }

	    // define a method to calculate the area
	    public double getArea() {
	        // return the product of length and width
	        return length * width;
	    }

	    // define a method to calculate the perimeter
	    public double getPerimeter() {
	        // return the sum of twice the length and twice the width
	        return 2 * (length + width);
	    }

	    // define a main method to test the program
	    public static void main(String[] args) {
	        // create a Scanner object to get user input
	        Scanner sc = new Scanner(System.in);

	        // prompt the user to enter the length and width of the rectangle
	        System.out.println("Enter the length of the rectangle:");
	        double length = sc.nextDouble();
	        System.out.println("Enter the width of the rectangle:");
	        double width = sc.nextDouble();

	        // create a Rectangle object with the user input
	        areaAndParimeterRectangle rect = new areaAndParimeterRectangle(length, width);

	        // print the area and perimeter of the rectangle
	        System.out.println("The area of the rectangle is " + rect.getArea());
	        System.out.println("The perimeter of the rectangle is " + rect.getPerimeter());

	        // close the Scanner object
	        sc.close();
	    
	    }

}
