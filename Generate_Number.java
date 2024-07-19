package yashPackage;
import java.util.Scanner;
public class Generate_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2, n3;
		System.out.println("Enter Three Integers: ");
		Scanner in = new Scanner(System.in);
		n1=in.nextInt();
		n2=in.nextInt();
		n3=in.nextInt();
		if (n1 > n2 && n1 > n3)
		System.out.println("The largest is: "+n1);
		else if (n2 > n1 && n2 > n3)
		System.out.println("The largest is: "+n2);
		else if (n3 > n1 && n3 > n2)
		System.out.println("The largest is: "+n3);
		else
		System.out.println("The numbers are same. ");
	}

}
