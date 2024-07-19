package lab41;
	
import java.util.Scanner;

	//create a class which extends Exception
	class AgeException extends Exception
	{
		//constructor of this class
		public AgeException(String message)
		{
			super(message);
		}
	}
	public class VotingAppLi {
		public static void main(String[] args) {
			
			//take input from user 
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your age: ");
			int age=sc.nextInt();
			
			//used try catch block to check  ing or not  eligible for vot
			try
			{
				checkAge(age);
				System.out.println("you are eligible for votting");
			}
			catch(AgeException ae)
			{
				System.out.println("you are not eligible for votting"+ae.getMessage());
			}
			
		} 

		//if you are not eligible for voting then it throw exception for age
		private static void checkAge(int age) throws AgeException {
			if(age<18)
			{
				throw new AgeException('\n'+"Exception :You must be above 18 for votting");
			}
			
		
	}

}
