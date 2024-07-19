package firstpackage;

//Employee class
class Employee {
 protected String name;
 protected double baseSalary;

 public Employee(String name, double baseSalary) {
     this.name = name;
     this.baseSalary = baseSalary;
 }

 public double calculateSalary() {
     return baseSalary;
 }
}

//Manager subclass
class Manager extends Employee {
 private double bonus;

 public Manager(String name, double baseSalary, double bonus) {
     super(name, baseSalary);
     this.bonus = bonus;
 }

 @Override
 public double calculateSalary() {
     // Manager's salary is base salary plus bonus
     return baseSalary + bonus;
 }
}

//Programmer subclass
class Programmer extends Employee {
 private int overtimeHours;
 private double hourlyRate;

 public Programmer(String name, double baseSalary, int overtimeHours, double hourlyRate) {
     super(name, baseSalary);
     this.overtimeHours = overtimeHours;
     this.hourlyRate = hourlyRate;
 }

 @Override
 public double calculateSalary() {
     // Programmer's salary is base salary plus overtime pay
     return baseSalary + (overtimeHours * hourlyRate);
 }
}

//Main class to test the program
public class EmployeeTest {
 public static void main(String[] args) {
     // Create instances of Manager and Programmer
     Manager manager = new Manager("John Manager", 35000, 25000);
     Programmer programmer = new Programmer("Alice Programmer", 28000, 20, 5);

     // Calculate and display salaries
     System.out.println("John is Manager and his Salary is- $" + manager.calculateSalary());
     System.out.println("Alice is Programmer and his Salary is- $" + programmer.calculateSalary());
 }
}

