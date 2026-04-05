import java.util.Scanner;
public class volume{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of triangle: ");
        double lengthOfTriangle = input.nextDouble();  
        
        double area = (1.7 / 4) * (lengthOfTriangle * lengthOfTriangle);

        double volume = area * lengthOfTriangle;
        
        System.out.printf("It is %f volume", volume);
    }
}


