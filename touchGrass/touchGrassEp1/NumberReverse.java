import java.util.Scanner;
public class NumberReverse{
    public static void main(String... args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter the number to get it reversed: ");
        int number = inputCollector.nextInt();
        
        int lastDigit = 0;
        int reverseDigit = 0;
        
        while(number > 0){
            lastDigit = number % 10;
            reverseDigit = reverseDigit * 10 + lastDigit;
            number /= 10; 
        }
        System.out.print(reverseDigit);
    }
}
