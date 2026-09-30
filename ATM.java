import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int balance = 10000;
        int pin;
        int choice;
        int amount;

        System.out.print("Enter your PIN: ");
        pin = sc.nextInt();

        // PIN Verification
        if (pin == correctPin) {

            System.out.println("PIN verified successfully!");

            while (true) {

                System.out.println("\n----- ATM MENU -----");
                System.out.println("1. Balance Check");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Mini Statement");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Your balance is: ₹" + balance);
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        amount = sc.nextInt();

                        if (amount <= balance) {
                            balance = balance - amount;
                            System.out.println("Withdrawal successful.");
                            System.out.println("Remaining balance: ₹" + balance);
                        } else {
                            System.out.println("Insufficient balance.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        amount = sc.nextInt();

                        if (amount > 0) {
                            balance = balance + amount;
                            System.out.println("Deposit successful.");
                            System.out.println("Updated balance: ₹" + balance);
                        } else {
                            System.out.println("Invalid amount.");
                        }
                        break;

                    case 4:
                        System.out.println("\n----- MINI STATEMENT -----");
                        System.out.println("Account Balance: ₹" + balance);
                        System.out.println("Recent transactions are displayed here.");
                        break;

                    case 5:
                        System.out.println("Thank you for using the ATM.");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }

        } else {
            System.out.println("Invalid PIN. Access denied.");
        }

        sc.close();
    }
}


