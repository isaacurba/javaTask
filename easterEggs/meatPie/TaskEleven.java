import java.util.Scanner;
public class TaskEleven{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int num = input.nextInt();

        int half = num / 2;
        System.out.print(half);
    }
}
