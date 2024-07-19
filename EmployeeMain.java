package yashPackage;
class Employee
{
	public int salary;
	
	
	public Employee(int sal)
	{
		salary = sal;
	}
	public void work()
	{
		System.out.println("working as a employee");
		
	}
	public int getSalary() 
	{
		return salary;
	}
}
class Manager extends Employee
{
	public Manager (int sal) 
	{
		super(sal);
	}
	public void work()
	{
		System.out.println("Managing the employee");
	}
	public void addEmployee()
	{
		System.out.println("Adding the employee");
	}
	
}
public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp=new Employee(80000);
		Manager man=new Manager(70000);
		
		emp.work();
		System.out.println("Manager salary" +emp.getSalary());
		
		man.addEmployee();
		System.out.println("Manager salary" +emp.getSalary());
		man.addEmployee();
		
		
	}

}
