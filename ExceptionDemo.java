package lab41;

public class ExceptionDemo {
	public static void main(String[] args) {
	try
	{
		int result =divideNumber(5,0);
		System.out.println("Result: "+result);
	}
	//if given number not divsible then it give error 
	catch(ArithmeticException e)
	{
		System.out.println("Error: "+e.getMessage());
	}
}

//divideNumber method throw ArithmeticException if number not divsible 
private static int divideNumber(int i, int j) {
	if(j==0)
	{
		throw new ArithmeticException("cannot divide the given number by zero");
	}
	return i/j;
	}
}
