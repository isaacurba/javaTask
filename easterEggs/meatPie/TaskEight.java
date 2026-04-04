import java.util.Scanner;
public class TaskSeven{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();

        int cube = num * num * num; 
        System.out.print(cube);
    }
}
