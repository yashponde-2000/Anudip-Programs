package yashPackage;
import java.util.Scanner;
public class ProgramDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		String input=sc.next ().toLowerCase();
		
		boolean upperCase= input.charAt(0) >= 65 && input.charAt(0) <=90;
		boolean lowerCase= input.charAt(0) >= 97 && input.charAt(0) <=122;
		boolean vowels=input.equals ("a") || input == ("e") || input.equals("0")
				|| input.equals("o") || input.equals("u");
		if(input.length() > 1)
		{
			System.out.println("Error Not a Single Character");
		}
		else if (!(upperCase || lowerCase))
		{
			System.out.println("Error Not a letter enter Uppercase or lowercase alphabet");
		}
		else if(vowels)
		{
			System.out.println("Input letter is Vowel");
		}
		else 
		{
			System.out.println("Input letter is Consonant");
		}
	}

}
