import java.util.Scanner;
public class SumOfPrimeFactor{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to get the prime of the sum: ");
        int number = input.nextInt();
        
        int primeSum = 0;
        int count = 2;
        
        while (number != 1){
            if (number % count == 0){
            
                number = number / count; 
                primeSum = primeSum + count; 
                
            }else count++;
            
            
        }
        System.out.print(primeSum);
    }
}
