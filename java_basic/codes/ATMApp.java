import java.util.Scanner; //input library

class BankAccount {                                  //class
    private String accountHolderName;
    private String accountNumber;
    private String mobileNo;
    private int pin;
    private double balance;

    //constructor
    public BankAccount(String name, String accNo, String mobile, int pin, double initialDeposit) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Invalid name");
        if (accNo == null || accNo.trim().isEmpty()) throw new IllegalArgumentException("Invalid account number");
        if (mobile == null || !mobile.matches("\\d{10}")) throw new IllegalArgumentException("Invalid mobile");
        if (initialDeposit < 500) initialDeposit = 500;
        this.accountHolderName = name.trim();
        this.accountNumber = accNo.trim();
        this.mobileNo = mobile;
        this.pin = pin;
        this.balance = initialDeposit;
    }

    //getter
    public String getAccountHolderName() { return accountHolderName; }
    public String getAccountNumber() { return accountNumber; }
    public String getMobileNo() { return mobileNo; }
    public double getBalance() { return balance; }

    //setter
    public void setAccountHolderName(String name) {
        if (name != null && !name.trim().isEmpty()) this.accountHolderName = name.trim();
        else throw new IllegalArgumentException("Invalid name");
    }

    //setter
    public void setMobileNo(String mobile) {
        if (mobile != null && mobile.matches("\\d{10}")) this.mobileNo = mobile;
        else throw new IllegalArgumentException("Invalid mobile");
    }

    public boolean verifyPin(int entered) { return this.pin == entered; }


    //method
    public void changePin(int oldPin, int newPin) {
        if (!verifyPin(oldPin)) throw new SecurityException("Wrong PIN");
        if (newPin < 1000 || newPin > 9999) throw new IllegalArgumentException("PIN must be 4 digits");
        this.pin = newPin;
    }

    //method
    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid amount");
        balance += amount;
    }

    //method
    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid amount");
        if (amount > balance) throw new IllegalArgumentException("Insufficient balance");
        balance -= amount;
    }

    public String showAccountDetails() {
        return "Name: " + accountHolderName +
               "\nAccount No: " + accountNumber +
               "\nMobile: " + mobileNo +
               "\nPIN: " + pin +
               "\nBalance: ₹" + String.format("%.2f", balance);
    }
}

public class ATMApp {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Ravi Kumar", "ACC1025", "9876543210", 1234, 1000.0);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== ATM MENU ===");
            System.out.println("1. Balance Enquiry");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Show Account Details");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            String choice = sc.nextLine().trim();
            try {
                switch (choice) {
                    case "1": {
                        System.out.println("Balance: ₹" + String.format("%.2f", acc.getBalance()));
                        break;
                    }
                    case "2": {
                        System.out.print("Enter PIN: ");
                        int pin = Integer.parseInt(sc.nextLine().trim());
                        if (!acc.verifyPin(pin)) { System.out.println("Wrong PIN"); break; }
                        System.out.print("Enter amount to deposit: ");
                        double amt = Double.parseDouble(sc.nextLine().trim());
                        acc.deposit(amt);
                        System.out.println("Deposited. New Balance: ₹" + String.format("%.2f", acc.getBalance()));
                        break;
                    }
                    case "3": {
                        System.out.print("Enter PIN: ");
                        int pin = Integer.parseInt(sc.nextLine().trim());
                        if (!acc.verifyPin(pin)) { System.out.println("Wrong PIN"); break; }
                        System.out.print("Enter amount to withdraw: ");
                        double amt = Double.parseDouble(sc.nextLine().trim());
                        acc.withdraw(amt);
                        System.out.println("Withdrawn. New Balance: ₹" + String.format("%.2f", acc.getBalance()));
                        break;
                    }
                    case "4": {
                        System.out.println("\n--- Account Details ---");
                        System.out.println(acc.showAccountDetails());
                        break;
                    }
                    case "5": {
                        System.out.println("Thank you.");
                        sc.close();
                        return;
                    }
                    default:
                        System.out.println("Invalid option");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            } catch (IllegalArgumentException | SecurityException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
