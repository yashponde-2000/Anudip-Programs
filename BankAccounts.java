package firstpackage;


class Accounts {
 protected double balance;

 public Accounts(double balance) {
     this.balance = balance;
 }

 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited: $" + amount);
 }

 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: $" + amount);
     } else {
         System.out.println("Insufficient funds for withdrawal");
     }
 }

 public void displayBalance() {
     System.out.println("Current Balance: $" + balance);
 }
}


class SavingsAccount extends Accounts {
 private double withdrawalLimit;

 public SavingsAccount(double balance, double withdrawalLimit) {
     super(balance);
     this.withdrawalLimit = withdrawalLimit;
 }

 @Override
 public void withdraw(double amount) {
     if (amount <= withdrawalLimit && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn from Savings: $" + amount);
     } else {
         System.out.println("Withdrawal limit exceeded or insufficient funds for withdrawal");
     }
 }
}


class CheckingAccount extends Accounts {
 private double withdrawalFee;

 public CheckingAccount(double balance, double withdrawalFee) {
     super(balance);
     this.withdrawalFee = withdrawalFee;
 }

 @Override
 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= (amount + withdrawalFee);
         System.out.println("Withdrawn from Checking: $" + amount + " (including fee: $" + withdrawalFee + ")");
     } else {
         System.out.println("Insufficient funds for withdrawal");
     }
 }
}


public class BankAccounts {
 public static void main(String[] args) {
  
     SavingsAccount savingsAccount = new SavingsAccount(20000, 800);
     CheckingAccount checkingAccount = new CheckingAccount(18000, 5);

     
     savingsAccount.displayBalance();
     savingsAccount.withdraw(400); 
     savingsAccount.displayBalance();

     checkingAccount.displayBalance();
     checkingAccount.withdraw(550); 
     checkingAccount.displayBalance();
 }
}
