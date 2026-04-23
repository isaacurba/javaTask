import java.util.Scanner;

public class ValidateUserInput{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1 or 2 to quit or keep looping: ");
        int number = input.nextInt();
        
        while (true){
            System.out.print("Enter 1 or 2 to quit or keep looping: ");
            number = input.nextInt();
            
            if (number == 1 || number == 2){
                break;
            }
        }

    }
}

