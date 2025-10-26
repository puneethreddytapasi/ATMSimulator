import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000.00; // starting balance

        while (true) {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Your current balance: ₹" + balance);
                case 2 -> {
                    System.out.print("Enter deposit amount: ₹");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("₹" + deposit + " deposited successfully!");
                }
                case 3 -> {
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdraw = sc.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("₹" + withdraw + " withdrawn successfully!");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                }
                case 4 -> {
                    System.out.println("Thank you for using ATM. Goodbye!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
}