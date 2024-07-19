package yashPackage;

import java.util.Scanner;

public class Person {
	static String name;
	static int age;
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		name = sc.nextLine();
		System.out.println("Enter Age");
		age=sc.nextInt();
		
		Person p1 = new Person();
		System.out.println("Name :"+p1.getName()+", Age : "+p1.getAge());
		
	}

}
