import java.util.Scanner;

public class DivisibleFourAndFive {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number to check 4 and 5: ");
        int num = input.nextInt();

        if (num % 4 == 0 && num % 5 == 0){
            System.out.println("Number can be divided by 4 and 5");   
        }
        else if (num % 4 == 0 || num % 5 == 0){
            System.out.println("Number can be divided by 4 or 5");
        }
        else {
            System.out.println("Number cannot be divided by both 4 and 5");
        }

    }
}
