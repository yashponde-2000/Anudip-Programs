//Write a Java program to create a class called Animal with a method named move(). Create a subclass called Cheetah that overrides the move() method to run

package yashPackage;

//A class called Animal with a method named move()
class Animal {
// The method move() prints "The animal is moving"
public void move() {
 System.out.println("The animal is moving");
}
}

//A subclass called Cheetah that inherits from Animal
class Cheetah extends AnimalCheeta {
// A method that overrides the move() method from Animal
// It prints "The cheetah is running"
public void move() {
 System.out.println("The cheetah is running");
}
}

//A main method to test the program
public class AnimalCheeta {
public static void main(String[] args) {
 // Create an Animal object
 Animal a = new Animal();
 // Call the move() method on the animal object
 a.move();

 // Create a Cheetah object
 Cheetah c = new Cheetah();
 // Call the move() method on the cheetah object
 c.move();
}
}
