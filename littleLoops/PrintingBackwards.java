import java.util.Scanner;
public class PrintingBackwards{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number to countdown: ");
        int n = input.nextInt();

        for (int i = n; i >= 1; i--){
           System.out.println(i);
        }
    }
}

