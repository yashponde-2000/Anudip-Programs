package yashPackage;

//A class called Employee with name, job title, and salary attributes
class seeker {
// Three private fields to store the name, job title, and salary of the employee
private String name;
private String jobTitle;
private double salary;

// A constructor that takes three parameters and assigns them to the fields
public seeker(String name, String jobTitle, double salary) {
 this.name = name;
 this.jobTitle = jobTitle;
 this.salary = salary;
}

// A method that returns the name of the employee
public String getName() {
 return name;
}

// A method that returns the job title of the employee
public String getJobTitle() {
 return jobTitle;
}

// A method that returns the salary of the employee
public double getSalary() {
 return salary;
}

// A method that calculates the annual salary of the employee
public double getAnnualSalary() {
 return salary * 12;
}

// A method that updates the salary of the employee by a given percentage
public void updateSalary(double percentage) {
 // Calculate the new salary by multiplying the current salary by (1 + percentage / 100)
 salary = salary * (1 + percentage / 100);
}
}

//A main method to test the program
public class EmployeeJobb {
public static void main(String[] args) {
 // Create an Employee object with name "Alice", job title "Software Engineer", and salary 50000
 seeker e = new seeker("Yash", "Software Engineer", 50000);
 // Print the name, job title, salary, and annual salary of the employee
 System.out.println("Name: " + e.getName());
 System.out.println("Job Title: " + e.getJobTitle());
 System.out.println("Salary: " + e.getSalary());
 System.out.println("Annual Salary: " + e.getAnnualSalary());
 // Update the salary of the employee by 10%
 e.updateSalary(10);
 // Print the new salary and annual salary of the employee
 System.out.println("New Salary: " + e.getSalary());
 System.out.println("New Annual Salary: " + e.getAnnualSalary());
}
}

