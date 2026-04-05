import java.util.Scanner;
public class MeterToFeetConverter{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number in meter: ");
        double meter = input.nextDouble();

        double feet = meter * 3.2786;
        System.out.printf("%f feet", feet);
    }
}
