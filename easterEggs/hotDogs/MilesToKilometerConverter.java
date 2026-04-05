import java.util.Scanner;
public class AreaOfEquilateralTriangle{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number in miles: ");
        double miles = input.nextDouble();  
        
        double kilometer = miles * 1.6;
        
        System.out.printf("It is %f kilometer", kilometer);
    }
}


