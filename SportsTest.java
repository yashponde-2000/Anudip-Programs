package firstpackage;

//Base class Sports
class Sports {
 public void play() {
     System.out.println("Playing a normal sport like");
 }
}

//Subclass Football
class Football extends Sports {
 @Override
 public void play() {
     System.out.println("Playing football");
 }
}

//Subclass Basketball
class Basketball extends Sports {
 @Override
 public void play() {
     System.out.println("Playing basketball");
 }
}

//Subclass Rugby
class Rugby extends Sports {
 @Override
 public void play() {
     System.out.println("Playing rugby");
 }
}

//Main class to test the program
public class SportsTest {
 public static void main(String[] args) {
     Sports genericSport = new Sports();
     Football football = new Football();
     Basketball basketball = new Basketball();
     Rugby rugby = new Rugby();

     // Call play() for each instance
     genericSport.play();
     football.play();
     basketball.play();
     rugby.play();
 }
}
