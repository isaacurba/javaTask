// write a function that takes in threes numbers and gives the highest of the numbers
import java.util.Scanner;
public class LargestInFunction{

    public static int largestNumber(){
        Scanner input = new Scanner(System.in);
        int number = 0;
        int largest = 0;
        while (number > -1){
            System.out.print("Enter number to get the largest (-1 to quit): ");
            number = input.nextInt();
            
            if (number > largest){
                largest = number;
            }

        }
        return largest;
    }   
    
    public static void main(String... args){
//        Scanner input = new Scanner(System.in);
        
        System.out.print(largestNumber());
    }
}
