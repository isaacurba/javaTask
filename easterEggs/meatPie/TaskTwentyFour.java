import java.util.Scanner;
public class Task{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        int a = input.nextInt();

        System.out.print("Enter last name: ");
        int b = input.nextInt(); 
        
        // this swaps the number from each input
        a = b;
        b = a;

        System.out.printf("First number is now %d %n", a);
        System.out.printf("Second number is now %d", b);
        
    }
}

