package lecture4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Check Armstrong Number");
            System.out.println("2. Banking System");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkArmstrongNumber(scanner);
                    break;
                case 2:
                    handleBankingSystem(scanner);
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }
        }
    }

    // 🚀 1️⃣ Armstrong Number Check (Separate Method)
    public static void checkArmstrongNumber(Scanner scanner) {
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = scanner.nextInt();

        if (ArmstrongNumber.isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    // 🚀 2️⃣ Banking System (Separate Method)
    public static void handleBankingSystem(Scanner scanner) {
        System.out.println("\n--- Bank Account System ---");

        BankAccount savings = new SavingsAccount(1000);
        BankAccount checking = new CheckingAccount(1500);

        // Deposit transactions
        System.out.print("Enter deposit amount for savings: ");
        double savingsDeposit = scanner.nextDouble();
        savings.deposit(savingsDeposit);

        System.out.print("Enter deposit amount for checking: ");
        double checkingDeposit = scanner.nextDouble();
        checking.deposit(checkingDeposit);

        // Withdraw transactions
        System.out.print("Enter withdraw amount for savings: ");
        double savingsWithdraw = scanner.nextDouble();
        savings.withdraw(savingsWithdraw);

        System.out.print("Enter withdraw amount for checking: ");
        double checkingWithdraw = scanner.nextDouble();
        checking.withdraw(checkingWithdraw);

        // Interest calculations
        System.out.println("Savings Account Interest: $" + savings.calculateInterest());
        System.out.println("Checking Account Interest: $" + checking.calculateInterest());
    }
}
