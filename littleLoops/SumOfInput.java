import java.util.Scanner;
public class SumOfInput{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number to sum through: ");
        int n = input.nextInt();
        int i = 1;
        while (i <= n){
            int sum = n + i;
            System.out.println(sum);
            i++;
        }
    }
}

