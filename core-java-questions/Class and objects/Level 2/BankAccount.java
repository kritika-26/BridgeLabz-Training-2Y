class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String h, int a, double b) {
        accountHolder = h; accountNumber = a; balance = b;
    }

    void deposit(double amt) { balance += amt; }
    void withdraw(double amt) { if (amt <= balance) balance -= amt; else System.out.println("Insufficient Balance!"); }
    void display() { 
        System.out.println(accountHolder + " | Acc No: " + accountNumber + " | Balance: " + balance); 
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Alice", 101, 5000);
        acc.display();
        acc.deposit(2000);
        acc.withdraw(3000);
        acc.display();
    }
}
