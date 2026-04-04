import java.util.Scanner;
public class TaskThirteen{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);    
        
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();


        System.out.print("Enter third nmber: ");
        int num3 = input.nextInt();

        int average = (num1 + num2 + num3) / 3;

        System.out.print(average);
    }
}
