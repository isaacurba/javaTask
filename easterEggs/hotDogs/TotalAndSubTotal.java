import java.util.Scanner;
public class TotalAndSubTotal{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Subtotal: ");
        double subTotal = input.nextDouble();

        System.out.print("Enter Gratuity rate in percent: ");
        double gratuityRate = input.nextDouble();
        
        double subCalc = subTotal * (gratuityRate / 100);
        double gratCalc = subTotal + subCalc;
        
        System.out.printf("$%f is the subtotal %n", subCalc);
        System.out.printf("$%f is the Gratuity rate", gratCalc);
    }
}
