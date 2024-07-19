package labNo38;

import java.util.Scanner;

public class ThreadForOddandEven {


	    private static final int MAX_NUMBER = 20;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the maximum number (up to 20): ");
	        int maxNumber = scanner.nextInt();
	        scanner.close();

	        if (maxNumber > MAX_NUMBER || maxNumber < 1) {
	            System.out.println("Invalid input. Please enter a number between 1 and 20.");
	            return;
	        }

	        Thread evenThread = new Thread(() -> printEvenNumbers(maxNumber));
	        Thread oddThread = new Thread(() -> printOddNumbers(maxNumber));

	        evenThread.start();
	        oddThread.start();
	    }

	    private static void printEvenNumbers(int maxNumber) {
	        for (int i = 2; i <= maxNumber; i += 2) {
	            System.out.println("Even: " + i);
	        }
	    }

	    private static void printOddNumbers(int maxNumber) {
	        for (int i = 1; i <= maxNumber; i += 2) {
	            System.out.println("Odd: " + i);
	        }
	    }
	

	
}
