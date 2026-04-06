import java.util.Scanner;

public class InterestInSixMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Monthly savings: ");
        double monthlySavings = input.nextDouble();

        double monthlyInterestRate = 0.003125;

        double accountValue = 0;

        // Month 1
        accountValue = (accountValue + monthlySavings) * (1 + monthlyInterestRate);

        // Month 2
        accountValue = (accountValue + monthlySavings) * (1 + monthlyInterestRate);

        // Month 3
        accountValue = (accountValue + monthlySavings) * (1 + monthlyInterestRate);

        // Month 4
        accountValue = (accountValue + monthlySavings) * (1 + monthlyInterestRate);

        // Month 5
        accountValue = (accountValue + monthlySavings) * (1 + monthlyInterestRate);

        // Month 6
        accountValue = (accountValue + monthlySavings) * (1 + monthlyInterestRate);

        System.out.printf("After 6 months, the account value is %.2f", accountValue);

        input.close();
    }
}
