import java.util.Scanner;

public class LargestInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int largest = input.nextInt();

        for (int count = 2; count <= 10; count++) {
            System.out.printf("Enter number %d: ", count);
            int number = input.nextInt();

            if (number > largest) {
                largest = number;
            }
        }

        System.out.printf("%nThe largest number is %d%n", largest);
    }
}

