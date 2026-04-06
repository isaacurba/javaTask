import java.util.Scanner;
public class BMI{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight: ");
        double weight = input.nextDouble();  

        System.out.print("Enter weight: ");
        double height = input.nextDouble();   

        weight = weight * 0.45359237; // in pounds
        height = height * 0.0254; // in inches

        double BMI = weight / (height * height);

        System.out.print("The BMI is: " + BMI);
    }
}
