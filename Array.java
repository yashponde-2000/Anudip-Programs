package yashPackage;

import java.util.Scanner;

public class Array {
	public static void main (String [] args) {
		System.out.println("Please enter Total Element of Array");
		Scanner scan= new Scanner(System.in);
		int totalInput=scan.nextInt();
		int inputArr[]=new int[totalInput];
		System.out.println("Please enter Array Element of Value");
		for (int i=0; i< totalInput;i++)
			{
				inputArr[i]=scan.nextInt();
		}
		System.out.println("Array element are here");
		for(int i=0;i<totalInput;i++) {
			System.out.println(inputArr[i]);
		}
		
	}
}
