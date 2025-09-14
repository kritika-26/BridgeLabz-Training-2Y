class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int acc, String holder, double bal) {
        accountNumber = acc;
        accountHolder = holder;
        balance = bal;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double bal) {
        balance = bal;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int acc, String holder, double bal) {
        super(acc, holder, bal);
    }

    void show() {
        System.out.println(accountNumber + " " + accountHolder + " " + getBalance());
    }
}

public class BankManagement {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(101, "Aman", 5000);
        System.out.println(b1.getBalance());
        b1.setBalance(7000);
        System.out.println(b1.getBalance());

        SavingsAccount s1 = new SavingsAccount(102, "Riya", 8000);
        s1.show();
    }
}
