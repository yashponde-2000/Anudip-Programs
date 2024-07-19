//Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".

package yashPackage;

//A class called Vehicle with a method called drive()
class Vehicle {
// The method drive() does nothing by default
public void drive() {
 // Empty
}
}

//A subclass called Car that inherits from Vehicle
class Carr extends Vehicle {
// A method that overrides the drive() method from Vehicle
// It prints "Repairing a car" to the standard output
@Override
public void drive() {
 System.out.println("Repairing a car");
}
}

//A main method to test the program
public class Vehicale {
public static void main(String[] args) {
 // Create a Vehicle object
 Vehicle v = new Vehicle();
 // Call the drive() method on the vehicle object (should do nothing)
 v.drive();

 // Create a Car object
 Carr c = new Carr();
 // Call the drive() method on the car object (should print "Repairing a car")
 c.drive();
}
}
