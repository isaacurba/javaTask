import java.util.Scanner;
public class AddingIntegers{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number from 0 to 1000 to print the sum of all the digits: ");
        // Gets the input
        int num = input.nextInt(); 
        int sum = 0;

        while(num > 0){
           // gets the last digit
            int lastDigit = num % 10;
            // adds last digit
            sum = sum + lastDigit;
            // removes last digit
            num = num / 10 ;
        }

        System.out.print("The sum of all the digit are " + sum);
    }
}
