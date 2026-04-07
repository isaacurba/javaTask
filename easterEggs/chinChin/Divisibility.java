import java.util.Scanner;

public class PositiveDifference{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();	

        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();

        int diff = num1 - num2;

        if (diff < 0) {
            Math.abs(diff);
        } 
        
        System.out.print(diff);        
    }
}
