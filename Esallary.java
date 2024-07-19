package yashPackage;

public class Esallary {

		//A class to represent an employee
		

		// Attributes of the employee
		private String name; // The name of the employee
		private String jobTitle; // The job title of the employee
		private double salary; // The salary of the employee in rupees

		// A constructor to initialize the employee
		public Esallary(String name, String jobTitle, double salary) {
		 this.name = name;
		 this.jobTitle = jobTitle;
		 this.salary = salary;
		}

		// A method to get the name of the employee
		public String getName() {
		 return name;
		}

		// A method to get the job title of the employee
		public String getJobTitle() {
		 return jobTitle;
		}

		// A method to get the salary of the employee
		public double getSalary() {
		 return salary;
		}

		// A method to calculate the annual salary of the employee
		public double calculateAnnualSalary() {
		 return salary * 12; // Assuming 12 months in a year
		}

		// A method to update the salary of the employee based on a percentage increase
		public void updateSalary(double percentage) {
		 salary = salary + (salary * percentage / 100); // Add the percentage of the current salary to the salary
		}

		// A method to display the details of the employee
		public void display() {
		 System.out.println("Name: " + name);
		 System.out.println("Job Title: " + jobTitle);
		 System.out.println("Salary: " + salary);
		 System.out.println("Annual Salary: " + calculateAnnualSalary());
		
		}


	}