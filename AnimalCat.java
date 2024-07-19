//Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.

package yashPackage;

//create a class called Animal
class Barks {
// define a method called makeSound
public void makeSound() {
 System.out.println("Animal makes sound");
}
}

//create a subclass called Cat that extends Animal
class Cat extends Barks {
// override the makeSound method to bark
@Override
public void makeSound() {
 System.out.println("Cat barks");
}
}

//create a main class to test the program
public class AnimalCat {
public static void main(String[] args) {
 // create an object of Animal class
	Barks a = new Barks();
 // call the makeSound method
 a.makeSound(); // Animal makes sound

 // create an object of Cat class
 Cat c = new Cat();
 // call the makeSound method
 c.makeSound(); // Cat barks
}
}
