import java.util.Scanner;

public class NegativeNumber {
    public static void main(String... args) {
        Scanner inputCollector = new Scanner(System.in);

        int number = 0;
        int sum = 0;

        while (true) {
            System.out.print("Enter any number to keep getting the sum (-1 to quit): ");
            number = inputCollector.nextInt();

            if (number == -1) {
                break; 
            }

            sum += number; 
        }

        System.out.printf("The sum of the numbers is %d", sum);
    }
}
