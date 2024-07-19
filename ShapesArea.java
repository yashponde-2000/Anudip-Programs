package firstpackage;

//Base class Shape
abstract class Shape {
abstract void draw();
abstract double calculateArea();
}

//Subclass Circle
class Circle extends Shape {
 private double radius;

 public Circle(double radius) {
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

//Subclass Square
class Square extends Shape {
 private double side;

 public Square(double side) {
     this.side = side;
 }

 @Override
 void draw() {
     System.out.println("Drawing a square");
 }

 @Override
 double calculateArea() {
     return side * side;
 }
}

//Subclass Triangle
class Triangle extends Shape {
 private double base;
 private double height;

 public Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }

 @Override
 void draw() {
     System.out.println("Drawing a triangle");
 }

 @Override
 double calculateArea() {
     return 0.5 * base * height;
 }
}

//Main class to test the program
public class ShapesArea {
 public static void main(String[] args) {
     Circle circle = new Circle(8);
     Square square = new Square(5);
     Triangle triangle = new Triangle(5, 9);

     // Call draw() and calculateArea() for each shape
     circle.draw();
     System.out.println("Area of Circle: " + circle.calculateArea());

     square.draw();
     System.out.println("Area of Square: " + square.calculateArea());

     triangle.draw();
     System.out.println("Area of Triangle: " + triangle.calculateArea());
 }
}
