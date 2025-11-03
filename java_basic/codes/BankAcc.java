class BankAccount {
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current balance: ₹" + balance);
    }
}

// Child class 1
class SavingsAccount extends BankAccount {
    void showSavingsFeature() {
        System.out.println("Savings Account: Earn interest on your savings!");
    }
}

// Child class 2
class CurrentAccount extends BankAccount {
    void showCurrentFeature() {
        System.out.println("Current Account: Suitable for daily transactions!");
    }
}

// Main class
public class BankAcc {
    public static void main(String[] args) {
        // Savings Account actions
        SavingsAccount s = new SavingsAccount();
        s.deposit(5000);
        s.withdraw(2000);
        s.checkBalance();
        s.showSavingsFeature();

        System.out.println();

        // Current Account actions
        CurrentAccount c = new CurrentAccount();
        c.deposit(10000);
        c.withdraw(4000);
        c.checkBalance();
        c.showCurrentFeature();
    }
}

