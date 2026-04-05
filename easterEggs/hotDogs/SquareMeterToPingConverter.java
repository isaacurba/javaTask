import java.util.Scanner;
public class SquareMeterToPingConverter{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number in meter: ");
        double squareMeter = input.nextDouble();

        double ping = squareMeter * 0.3035;
        System.out.printf("%f ping", ping);
    }
}
