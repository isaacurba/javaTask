import java.util.Scanner;
public class NewtonsEquation{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount of water in kilogram: ");
        double water = input.nextDouble();      

        System.out.print("Enter final ltemperature :");
        double finalTemp = input.nextDouble();

        System.out.print("Enter initial ltemperature :");
        double initialTemp = input.nextDouble();

        double q = water * (finalTemp - initialTemp) * 4184;

        System.out.println("The energy needed to heat water is: " + q);
        
    }   
}
