import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
    

        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y2 = input.nextDouble();

        double xDifference = x2 - x1;

        double yDifference = y2 - y1;

        double xSquared = xDifference * xDifference;
        double ySquared = yDifference * yDifference;

        double sum = xSquared + ySquared;

        double distance = Math.sqrt(sum);

        System.out.printf("The distance between the two points is %.2f", distance);

    }
}
