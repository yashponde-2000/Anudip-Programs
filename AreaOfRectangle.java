// Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
package yashPackage;

//A class called Shape with a method called getArea()
class Shape {
// The method getArea() returns 0 by default
public double getArea() {
 return 0;
}
}

//A subclass called Rectangle that inherits from Shape
class Rectangle extends Shape {
// Two private fields to store the length and width of the rectangle
private double length;
private double width;

// A constructor that takes two parameters and assigns them to the fields
public Rectangle(double length, double width) {
 this.length = length;
 this.width = width;
}

// A method that overrides the getArea() method from Shape
// It calculates and returns the area of the rectangle
public double getArea() {
 return length * width;
}
}

//A main method to test the program
public class AreaOfRectangle {
public static void main(String[] args) {
 // Create a Shape object
 Shape s = new Shape();
 // Print the area of the shape
 System.out.println("The area of the shape is " + s.getArea());

 // Create a Rectangle object with length 5 and width 3
 Rectangle r = new Rectangle(5, 3);
 // Print the area of the rectangle
 System.out.println("The area of the rectangle is " + r.getArea());
}
}

