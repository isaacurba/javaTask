import java.util.Scanner;
public class NewtonsEquation{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial velocity in meter/second: ");
        double u = input.nextDouble();      

        System.out.print("Enter time span in seconds: ");
        double t = input.nextDouble();


        System.out.print("Enter accceleration in meters: ");
        double a = input.nextDouble();

        double distanceCovered_S = (u * t) + (1/2 * a * (t * t));

        System.out.println("Distance covered is: " + distanceCovered_S);

    

        
    }   
}

