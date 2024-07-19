package yashPackage;

import java.util.Scanner;

public class CoffeeMachine {
	public static void main (String [] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Choose Your Coffee");
		System.out.println("1. Espresso");
		System.out.println("2. Latte");
		System.out.println("3. Cappuccino");
		System.out.println("4. Amiricano");
	
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("You Choose the Espresso, Prics is 250rs");
			break;
		case 2:
			System.out.println("You Choose the  Latte, Prics is 200rs");
			break;
		case 3:
			System.out.println("You Choose the Cappuccino, Prics is 300rs");
			break;
		case 4:
			System.out.println("You Choose the  Amiricano, Prics is 400rs");
			break;
			
		}
	}
}
