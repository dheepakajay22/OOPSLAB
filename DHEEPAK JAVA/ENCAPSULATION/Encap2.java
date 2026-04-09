class BankAccount {
    private double balance;
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance!");
        }
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
public class Encap2{
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setBalance(1000);
        acc.deposit(500);
        acc.withdraw(300);
        System.out.println("Final Balance: " + acc.getBalance());
    }
}