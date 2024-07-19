package lab15;
	import java.util.Scanner;

	//make a interface 
	interface Account 
	{
	    void deposit(double amount);
	    void withdraw(double amount);
	    double calculateInterest();
	    double getBalance();
	}

	//make a class and implements 
	class SavingsAccount implements Account 
	{
	    private double balance;
	    private double interestRate;

	    //constructor of class
	    public SavingsAccount(double balance, double interestRate)
	    {
	        this.balance = balance;
	        this.interestRate = interestRate;
	    }

	    //Override methods of interface 
	    @Override
	    public void deposit(double amount) {
	    	//logic for deposit
	        balance += amount;
	    }

	    @Override
	    public void withdraw(double amount) {
	    	//logic for withdraw 
	        if (balance >= amount) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient funds");
	        }
	    }

	    //method return the multiplication of balance interestRate for Interest 
	    @Override
	    public double calculateInterest() {
	        return balance * interestRate;
	    }

	    @Override
	    public double getBalance() {
	    	//return the balance 
	        return balance;
	    }

	    //method to add interest 
	    public void addInterest() {
	        balance += calculateInterest();
	    }
	}
	//implements the class by interface 
	class CurrentAccounts implements Account 
	{
	    private double balance;
	    private double overdraftLimit;

	    //constructor for class 
	    public CurrentAccounts(double balance, double overdraftLimit) 
	    {
	        this.balance = balance;
	        this.overdraftLimit = overdraftLimit;
	    }

	    
	    //override methods
	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (balance + overdraftLimit >= amount) {
	            balance -= amount;
	        } else {
	            System.out.println("Withdrawal amount exceeds overdraft limit");
	        }
	    }

	    @Override
	    public double calculateInterest() {
	        return 0; // Current account does not earn interest
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }
	}

	//create a class bank 
	class Bank 
	{
	    private Account[] accounts;
	    private int numAccounts;

	    public Bank(int maxSize) 
	    {
	        accounts = new Account[maxSize];
	        numAccounts = 0;
	    }

	    public void addAccount(Account account)
	    {
	        if (numAccounts < accounts.length)
	        {
	            accounts[numAccounts++] = account;
	        } 
	        else 
	        {
	            System.out.println("Cannot add more accounts. Bank is full.");
	        }
	    }

	    //method to display account 
	    public void displayAccounts() {
	        System.out.println("Bank Accounts:");
	        for (int i = 0; i < numAccounts; i++)
	        {
	            System.out.println("Account " + (i + 1) + ": Balance - " + accounts[i].getBalance());
	        }
	    }
	}

	//main class
	public class InterfaceBankApp
	{
		public static void main(String[] args)
		{
			//used to take input from user 
			Scanner scanner = new Scanner(System.in);
	        Bank bank = new Bank(5); // Maximum 5 accounts

	        System.out.println("Creating Savings Account...");
	        System.out.print("Enter initial balance: ");
	        double savingsBalance = scanner.nextDouble();
	        System.out.print("Enter interest rate: ");
	        double interestRate = scanner.nextDouble();
	        //Instance of SavingsAccount class with parameter 
	        SavingsAccount savingsAccount = new SavingsAccount(savingsBalance, interestRate);

	        // Create current account
	        System.out.println("Creating Current Account...");
	        System.out.print("Enter initial balance: ");
	        double currentBalance = scanner.nextDouble();
	        System.out.print("Enter overdraft limit: ");
	        double overdraftLimit = scanner.nextDouble();
	        //Instance of CurrentAccounts class with parameter 
	        CurrentAccounts currentAccount = new CurrentAccounts(currentBalance, overdraftLimit);

	        bank.addAccount(savingsAccount);
	        bank.addAccount(currentAccount);

	        bank.displayAccounts();

	        savingsAccount.deposit(1000);
	        currentAccount.withdraw(500);

	        bank.displayAccounts();

		}

	
}
