package yashPackage;

//Import the Scanner class to read user input
import java.util.Scanner;

//Import the DateFormatSymbols class to get weekday names
import java.text.DateFormatSymbols;

public class Weekday {

 public static void main(String[] args) {
     // Create a Scanner object
     Scanner scanner = new Scanner(System.in);

     // Prompt the user to enter a number
     System.out.println("Enter a number:");

     // Read the user input as an integer
     int number = scanner.nextInt();

     // Generate a random integer between 1 and 7
     int random = (int) (Math.random() * 7) + 1;

     // Get the weekday names as an array of strings
     String[] weekdays = new DateFormatSymbols().getWeekdays();

     // Print the weekday name corresponding to the random number
     System.out.println("The weekday name is " + weekdays[random]);
 }
}

