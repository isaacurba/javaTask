import java.util.Scanner;
public class PatternTwo{
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int row = input.nextInt();
        
        for (int count = 1; count <= row; count++ ){
            for(int counter = 1; counter <= count; counter++){
                System.out.print("*");
            }
                System.out.println();
        }
        
        
    }
}
