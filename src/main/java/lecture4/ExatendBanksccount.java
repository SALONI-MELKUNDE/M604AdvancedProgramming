package lecture4;


abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }


    abstract double calculateInterest();
}


class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.03; // 3% interest

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}


class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        return 0.0; // No interest for checking accounts
    }
}

