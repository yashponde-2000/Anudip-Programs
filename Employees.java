package lab15;

	class Manager extends Employee
	{
		private double bonus;

		public Manager(String name, double baseSalary, double bonus) 
		{
			super(name, baseSalary);
			this.bonus = bonus;
		}
		
		//override the methods from base class
		@Override
		public double calculateSalary() {
			return baseSalary+bonus;
		}
		@Override
		public void displayInfo() 
		{
			System.out.println("manager name : "+name);
			System.out.println("base Salary : "+baseSalary);
			System.out.println("Bonus : "+bonus);
			System.out.println("total salary : "+calculateSalary());
		}
	}
	class Programmer extends Employee
	{
		private int overtimeHours;
		private double hourlyRate;
		
		
		//Parameterized constructor of this class
		public Programmer(String name, double basesalary, int overtimeHours, double hourlyRate) 
		{
			super(name, basesalary);
			this.overtimeHours = overtimeHours;
			this.hourlyRate = hourlyRate;
		}

		//override the methods from base class
		@Override
		public double calculateSalary() {
			return baseSalary+(overtimeHours*hourlyRate);
		}
		@Override
		public void displayInfo() {
			System.out.println("name of programmer : "+name);
			System.out.println("baseSalary of programmer : "+baseSalary);
			System.out.println("Overtime Hours : "+overtimeHours);
			System.out.println("Hourly Rate : "+hourlyRate);
			System.out.println("total salary : "+calculateSalary());
		}
	}

	//create a abstract class contain abstracts methods 
	abstract class Employee {
		
		protected String name;
		protected double baseSalary;
		
		//constructor of this class
		public Employee(String name, double baseSalary) 
		{
			//this key show the current class variable here 
			this.name = name;
			this.baseSalary = baseSalary;
		}
		public abstract double calculateSalary();
		public abstract void displayInfo();
		
		public static void main(String[] args) {
			
			//create a instance of sub class 
			Manager m=new Manager("Sakshi", 25000.0, 5000);
			Programmer p=new Programmer("Fuke", 20000.0, 25,  200);
			
			//call the method to show information of manager and programmer 
			m.displayInfo();		
			p.displayInfo();
		}

	
}
