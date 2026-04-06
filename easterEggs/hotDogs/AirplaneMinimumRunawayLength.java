import java.util.Scanner;
public class AirplaneMinimumRunawayLength{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter v the take off speed: ");
        double v = input.nextDouble();  

        System.out.print("Enter a the acceleration: ");
        double a = input.nextDouble();  

        double length = (v * v) / (2 * a);
        
        System.out.printf("The length is %f.2f", length);
        
    }
}
