import java.util.Scanner;
public class RightAngleTriangle{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length you want: ");
        int length = input.nextInt();
        
        for(int count = 1; count <= length; count++){
            for (int counter = 1; counter <= count; counter++) System.out.print("*");
            System.out.println();
        }         
    }
}
