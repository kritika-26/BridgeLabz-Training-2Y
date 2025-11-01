
class BankAccount {
    long accountNumber;
    double balance;

    public BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}


class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(long accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    public void displayAccountType() {
        System.out.println("Type: Savings Account, Interest Rate: " + interestRate + "%");
    }
}


class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(long accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Type: Checking Account, Withdrawal Limit: $" + withdrawalLimit);
    }
}


class FixedDepositAccount extends BankAccount {
     public FixedDepositAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }
    
    public void displayAccountType() {
        System.out.println("Type: Fixed Deposit Account");
    }
}



public class BankAccounts {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(12345, 5000, 3.5);
        CheckingAccount ca = new CheckingAccount(67890, 2500, 1000);

        System.out.println("Details of Bank Accounts:");
        sa.displayDetails();
        sa.displayAccountType();
        
        System.out.println();

        ca.displayDetails();
        ca.displayAccountType();
    }
}