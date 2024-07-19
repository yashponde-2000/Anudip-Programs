package lab15;

	class Circles extends Shapes
	{
		//define radius 
		private double radius;
		
		//constructor 
		public Circles(double radius) {
			this.radius = radius;
		}

		//overrided methods 
		@Override
		public double calculateArea() {
			return 3.14*radius*radius;
		}

		@Override
		public double calculatePerimeter() {
			return 2*3.14*radius;
		}
		
	}

	//extends class by parent class
	class Triangles extends Shapes
	{
		//define a b c as a sides of tringles 
		private double a;
		private double b;
		private double c;
		
		//constructor of this class
		public Triangles(double a, double b, double c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}

		//overide methods 
		@Override
		public double calculateArea() {
			//logic to fine area of triangle 
			double s=(a+b+c)/2;
			double tri= (s*(s - a) * (s- b) * (s - c));
			return Math.sqrt(a);
		}

		@Override
		public double calculatePerimeter() {
			//return perimeter of triangle 
			return a+b+c;
		}
	}
	abstract class Shapes
	{
		public abstract double calculateArea();
		public abstract double calculatePerimeter();

		public static void main(String[] args) {
			
			//instance of a class 
			Circles c=new Circles(2.5);
			
			System.out.println("Area of circle is : "+c.calculateArea());
			System.out.println("perimeter of Circle : "+c.calculatePerimeter());
			
			//instance of a class
			Triangles t=new Triangles(2.3,2.5,5.8);
			
			System.out.println("Area of Triangle is : "+t.calculateArea());
			System.out.println("perimeter of triangle : "+t.calculatePerimeter());

	}	
}
