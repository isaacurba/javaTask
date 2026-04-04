import java.util.Scanner;
public class TaskNineteen{
    public static void main(String[] args){
                
        Scanner input = new Scanner(System.in);    
        
        System.out.print("Enter length: ");
        int length = input.nextInt();

        System.out.print("Enter width: ");
        int width = input.nextInt();

        int area = length * width;
        
        System.out.print(area);
        
    }
}

