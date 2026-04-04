import java.util.Scanner;
public class TaskNineteen{
    public static void main(String[] args){
                
        Scanner input = new Scanner(System.in);    
        
        System.out.print("Enter number: ");
        int num = input.nextInt();

        int remainderByDivideTwo = num % 2;
        
        System.out.print(remainderByDivideTwo);
        
    }
}

