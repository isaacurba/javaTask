import java.util.Scanner;

public class ReverseAndPallindromeMethod {

    public static void main(String... args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to be reversed and check if its a palindrome: ");
        int number = input.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;
        while (number > 0){
            int lastDigit = number % 10;
            reverseDigit *= 10 + lastDigit;
            number /= 10;
        }

    }
    public static int palindrome(int number)
}
