package labNo38;

	import java.util.Scanner;

	class BankAccount {
	    private int balance = 0;

	    public synchronized void deposit(int amount) {
	        balance += amount;
	        System.out.println(Thread.currentThread().getName() + " deposits " + amount + ". Balance is now: " + balance);
	    }

	    public synchronized void withdraw(int amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println(Thread.currentThread().getName() + " withdraws " + amount + ". Balance is now: " + balance);
	        } else {
	            System.out.println(Thread.currentThread().getName() + " cannot withdraw " + amount + ". Insufficient funds.");
	        }
	    }
	}

	class Depositor implements Runnable {
	    private final BankAccount account;
	    private final int amount;

	    public Depositor(BankAccount account, int amount) {
	        this.account = account;
	        this.amount = amount;
	    }

	    public void run() {
	        account.deposit(amount);
	    }
	}

	class Withdrawer implements Runnable {
	    private final BankAccount account;
	    private final int amount;

	    public Withdrawer(BankAccount account, int amount) {
	        this.account = account;
	        this.amount = amount;
	    }

	    public void run() {
	        account.withdraw(amount);
	    }
	}

	public class BankAccountWandD {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter initial balance for the bank account: ");
	        int initialBalance = scanner.nextInt();

	        BankAccount account = new BankAccount();
	        account.deposit(initialBalance);

	        System.out.print("Enter the amount to deposit: ");
	        int depositAmount = scanner.nextInt();

	        System.out.print("Enter the amount to withdraw: ");
	        int withdrawAmount = scanner.nextInt();

	        Thread depositorThread = new Thread(new Depositor(account, depositAmount), "DepositorThread");
	        Thread withdrawerThread = new Thread(new Withdrawer(account, withdrawAmount), "WithdrawerThread");

	        depositorThread.start();
	        withdrawerThread.start();

	        scanner.close();
	    }
	

	
}
