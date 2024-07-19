package yashPackage;
	import java.util.Scanner;
	
public class OpreratorsDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int a=10;
			int b=3;
			int c=5;
			int result=a+b;
			//## Arithmetic Operators
			System.out.println("Arithmetic Operators");
			
			System.out.println("a+b=" +result);
			System.out.println("a-b="+ (a-b));
			System.out.println("a/b="+ (a/b));
			System.out.println("a*b="+ (a*b));
			System.out.println("a%b="+ (a%b));
			
			
			//## Relational Operators
			System.out.println("Relational Operators");
			
			System.out.println("a>b="+(a>b));
			System.out.println("a<b="+(a<b));
			System.out.println("a>=b="+(a>=b));
			System.out.println("a<=b="+(a<=b));
			System.out.println("a==b="+(a==b));
			System.out.println("a!=b="+(a!=b));
			
			
			//## Bitwise Operators
			System.out.println("Bitwise Operators");
			
			int m=60;
			
			int n=13;
			
			result=m&n;
			System.out.println(result);
			result=m|n;
			System.out.println(result);
			result=m^n;
			System.out.println(result);
			result=m&n;
			System.out.println(result);
			result=m>>2;
			System.out.println(result);
			result=m<<2;
			System.out.println(result);
			
			int min=(a<b)? a:b;
			System.out.println(min);
			
			
			//## Assignment/ Complex Operator
			System.out.println("Assignment/ Complex Operators");
			
			System.out.println("a=a+b"+(a+=b));
			System.out.println("a=a-b"+(a-=b));
			System.out.println("a=a*b"+(a*=b));
			System.out.println("a=a/b"+(a/=b));
			
			//## Incremental And Decrement Operators
			System.out.println("Incremental And Decremen Operators");
			 
			int x=5;
			int z=10;
			
			System.out.println(x);
			x++;
			System.out.println(x);
			System.out.println(x--);
			
			//## Preincrement and Post increment
			System.out.println("Preincrement And Post increment");
			
			System.out.println(++x);
			System.out.println(x++);
		}
	
	}


