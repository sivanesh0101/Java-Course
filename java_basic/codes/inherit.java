class BankAccount {
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

// Child class 1
class SavingsAccount extends BankAccount {
    void calculateInterest() {
        System.out.println("Interest added to Savings Account");
    }
}

// Child class 2
class CurrentAccount extends BankAccount {
    void overdraftLimit() {
        System.out.println("Overdraft limit applied for Current Account");
    }
}

// Main class
public class inherit {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.deposit(5000);          // from parent
        s.calculateInterest();    // own method

        CurrentAccount c = new CurrentAccount();
        c.deposit(10000);         // from parent
        c.overdraftLimit();       // own method
    }
}