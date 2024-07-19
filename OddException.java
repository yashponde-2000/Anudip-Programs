package lab41;

public class OddException {
		public static void main(String[] args) {
			int n=10;
			trynumber(n);
			n=5;
			trynumber(n);
		}

		//method which define try catch block which check even number if not throw error
		private static void trynumber(int n) {
			try
			{
				checkEvenNumber(n);
				System.out.println(n+" is a even number");
			}
			catch( IllegalArgumentException e)
			{
				System.out.println("Error: "+e.getMessage());
			}
		}

		//after throwing error print it is odd number
		private static void checkEvenNumber(int n) {
			if(n%2!=0)
			{
				throw new IllegalArgumentException(n+" is a odd number");
			}
		

	}	
}
