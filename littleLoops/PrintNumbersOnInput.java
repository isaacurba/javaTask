import java.util.Scanner;
public class PrintNumbersOnInput{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number to print through: ");
        int n = input.nextInt();
        int i = 1;
        while (i <= n){
            System.out.println(i);
            i++;
        }
    }
}

