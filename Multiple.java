import java.util.Scanner;
public class Multiple{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number to print the square of last digit: ");
        int number = input.nextInt(); 
        
        int squareOfEachDigit = 0;
        for (int count = number; count > 0;){
            int lastDigit = number % 10;
            squareOfEachDigit = lastDigit * lastDigit;
            count /= 10;
        }
        System.out.println(squareOfEachDigit);
    }
}
