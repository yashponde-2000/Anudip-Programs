package lab15;

class SavingAccount extends BankAccount
{
		//constructor
		public SavingAccount(String accountNo, double balance) {
			super(accountNo, balance);
		}
		//override method from base class
		@Override
		public void deposit(double amount) {
			setBalance(getBalance()+amount);
			System.out.println("Deposite of "+amount+ "successful. Current balance is "+getBalance());
		}
		@Override
		void withdraw(double amount) {
			//logic to withdraw amount 
				if(getBalance()>=amount)
				{
					setBalance(getBalance()-amount);
					System.out.println("withdraw of "+amount+ "successful. Current balance is "+getBalance());
				}
				else
				{
					System.out.println("withdraw fail. Insufficient funds");
				}
		}
	}
	//extends by parent class
	class CurrentAccount extends BankAccount
	{
		//constructor
		public CurrentAccount(String accountNo, double balance) {
			super(accountNo, balance);
		}
		//override method from base class
		@Override
		void deposit(double amount) {
			setBalance(getBalance()+amount);
			System.out.println("Deposite of "+amount+ "successful. Current balance is "+getBalance());
		}
		@Override
		void withdraw(double amount) {
			//logic to withdraw amount 
			if(getBalance()>=amount)
			{
				setBalance(getBalance()-amount);
				System.out.println("withdraw of "+amount+ "successful. Current balance is "+getBalance());
			}
			else
			{
				System.out.println("withdraw fail. Insufficient funds");
			}
		}
	}
	abstract class BankAccount {

		private String accountNo;
		private double balance;
		
		//constructor 
		public BankAccount(String accountNo, double balance) {
			this.accountNo = accountNo;
			this.balance = balance;
		}
		
		//getter methods 
		public String getAccountNo() {
			return accountNo;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		//abtract methods
		abstract void deposit(double amount);
		abstract void withdraw(double amount);
		
		//execution of program starts from here 
		public static void main(String[] args) {
			
			SavingAccount sa = new SavingAccount("sakshi" , 1000);
	        CurrentAccount ca = new CurrentAccount("Fuke" , 2000);

	        sa.deposit(500);
	        sa.withdraw(200);
	        System.out.println("Savings Account Balance: " + sa.getBalance());
	        System.out.println();
	        ca.deposit(1000);
	        ca.withdraw(2500);
	        System.out.println("Current Account Balance: " + ca.getBalance());
		

	}
}
