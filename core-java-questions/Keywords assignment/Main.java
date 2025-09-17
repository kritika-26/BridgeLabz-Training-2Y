class BankAccount {
    static String bankName = "ABC Bank";
    static int totalAccounts = 0;

    final int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total accounts created: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Kritika", 101, 5000);
        BankAccount acc2 = new BankAccount("Rahul", 102, 10000);

        acc1.displayDetails();
        System.out.println("----------------------");
        acc2.displayDetails();

        BankAccount.getTotalAccounts();
    }
}
