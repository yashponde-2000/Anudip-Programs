package yashPackage;

import java.util.Scanner;

public class CircleRadius 
{
	double r,area,circ;
	
	void calArea()
	{
		area =3.14*r*r;
		System.out.println("Area of Circle is:"+area);
	}
	
	void calCirc()
	{
		circ= 2*3.14*r;
		System.out.println("Circumference of circle:"+circ);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
        double r = sc.nextDouble();
        
        CircleRadius c1= new CircleRadius();
        c1.r=r;
        c1.calArea();
        c1.calCirc();       		
	}

}