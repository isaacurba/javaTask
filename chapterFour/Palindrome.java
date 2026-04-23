import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number to check if it's palindrome: ");
        int number = input.nextInt();
        
        int numberCopy = number;
        int lastDigit = 0;
        int eachDigit = 0;
        while(number > 0){
            lastDigit = number % 10;
            eachDigit = (eachDigit * 10) + lastDigit;
            number /= 10;
        }
        if (eachDigit == numberCopy){
            System.out.print("It's a palinndrome");
        }
        else{
            System.out.print("It's not a palindrome");
        }
        
    }
}
