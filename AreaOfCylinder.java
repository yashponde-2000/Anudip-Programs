package firstpackage;




//Base class Shape
abstract class Shapee {
 abstract void draw();
 abstract double calculateArea();
}

//Subclass Circle
class Circle1 extends Shapee {
 // Change the access modifier from private to protected
 protected double radius;

 public Circle1(double radius) {
     this.radius = radius;
 }

 @Override
 void draw() {
     System.out.println("Drawing a circle");
 }

 @Override
 double calculateArea() {
     return Math.PI * radius * radius;
 }
}

//Subclass Cylinder
class Cylinder extends Circle1 {
 private double height;

 public Cylinder(double radius, double height) {
     super(radius);
     this.height = height;
 }

 @Override
 void draw() {
     System.out.println("Drawing a cylinder");
 }

 @Override
 double calculateArea() {
     // Total surface area of a cylinder: 2πr² + 2πrh
     return 2 * super.calculateArea() + 2 * Math.PI * getRadius() * height;
 }

 // Additional method to get the radius of the base circle
 private double getRadius() {
     // Access the radius field directly
     return super.radius;
 }
}

//Main class to test the program
public class AreaOfCylinder {
 public static void main(String[] args) {
     Circle circle = new Circle(7);
     Cylinder cylinder = new Cylinder(4, 7);

     // Call draw() and calculateArea() for each shape
     circle.draw();
     System.out.println("Area of Circle: " + circle.calculateArea());

     cylinder.draw();
     System.out.println("Surface Area of Cylinder : " + cylinder.calculateArea());
 }
}