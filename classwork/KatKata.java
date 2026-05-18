// write a program that collect ten inputs and stores it in an array and prints the array
import java.util.Scanner;

public class Katakata {
    public static void main(String... isaac){
        Scanner input = new Scanner(System.in);
        
        int number;
        int storage[] = new int[10];
        
        for (int index = 0; index < 10; index++){
        
            System.out.printf("Enter numer %d: ", index);
            number = input.nextInt();
            
            storage[index] = number;
            
        }
        
        for (int index = 0; index < 10; index++){
            
            System.out.printf("%d, \n", storage[index]);
        }
               
    }
}
