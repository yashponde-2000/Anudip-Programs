package lab41;

import java.util.Scanner;

import lab41.VowelCheck.NoVowelsException;

public class VowelCheck {
	
	public static void main(String[] args)
	{
		//scanner class used to take a input from user 
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputString = sc.nextLine();
	       
	        //used try catch block to check vowels
	        try 
	        {
	            checkForVowels(inputString);
	            System.out.println("String contains vowels.");
	        } 
	        catch (NoVowelsException e)
	        {
	            System.out.println(e.getMessage());
	        }
	    }
	
		//checkForVowels method throws NoVowelsException
	    public static void checkForVowels(String str) throws NoVowelsException 
	    {
	        boolean hasVowels = false;
	        
	        for (char ch : str.toCharArray())
	        {
	            if (isVowel(ch)) 
	            {
	                hasVowels = true;
	                break;
	            }
	        }
	        if (!hasVowels) 
	        {
	            throw new NoVowelsException("String does not contain any vowels.");
	        }
	    }

	    //isvowel method check the charector is vowel or not 
	    public static boolean isVowel(char ch)
	    {
	        ch = Character.toLowerCase(ch);
	        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	    }

	    //make a static class which extends the Exception
	    static class NoVowelsException extends Exception
	    {
	        public NoVowelsException(String message) 
	        {
	            super(message);
	        }
	}
}

