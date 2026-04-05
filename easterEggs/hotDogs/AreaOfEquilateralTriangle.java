import java.util.Scanner;
public class AreaOfEquilaterlTriangle{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number in miles: ");
        double lengthOfTriangle = input.nextDouble();  
        
        double area = (1.7 / 4) * (sidesOfTriangle * sidesOfTriangle);
        
        System.out.printf("It is %f area", area);
    }
}


