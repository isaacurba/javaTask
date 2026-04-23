import java.util.Scanner;

public class CreditScore {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number (or -1 to quit): ");
        int accountNumber = input.nextInt();

        while (accountNumber != -1) {
            System.out.print("Enter beginning balance: ");
            int beginningBalance = input.nextInt();

            System.out.print("Enter total charges this month: ");
            int charges = input.nextInt();

            System.out.print("Enter total credits applied this month: ");
            int credits = input.nextInt();

            System.out.print("Enter allowed credit limit: ");
            int creditLimit = input.nextInt(); // Added this variable

            int newBalance = beginningBalance + charges - credits;
            System.out.println("New balance is: " + newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            } else {
                System.out.println("Credit limit not exceeded.");
            }

            System.out.print("\nEnter account number (or -1 to quit): ");
            accountNumber = input.nextInt();
        }
    }
}

