package firstpackage;

import java.util.Scanner;
	public class AreaCalculator {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Select a shape to calculate its area:");
	        System.out.println("1. Circle");
	        System.out.println("2. Rectangle");
	        System.out.println("3. Triangle");

	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                calculateCircleArea();
	                break;
	            case 2:
	                calculateRectangleArea();
	                break;
	            case 3:
	                calculateTriangleArea();
	                break;
	            default:
	                System.out.println("Invalid choice. Please select a valid option.");
	        }

	        scanner.close();
	    }

	    private static void calculateCircleArea() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the radius of the circle:");
	        double radius = scanner.nextDouble();

	        double area = Math.PI * Math.pow(radius, 2);
	        System.out.println("The area of the circle is: " + area);
	    }

	    private static void calculateRectangleArea() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the length of the rectangle:");
	        double length = scanner.nextDouble();

	        System.out.println("Enter the width of the rectangle:");
	        double width = scanner.nextDouble();

	        double area = length * width;
	        System.out.println("The area of the rectangle is: " + area);
	    }

	    private static void calculateTriangleArea() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the base length of the triangle:");
	        double base = scanner.nextDouble();

	        System.out.println("Enter the height of the triangle:");
	        double height = scanner.nextDouble();

	        double area = 0.5 * base * height;
	        System.out.println("The area of the triangle is: " + area);
	    
	}

}
