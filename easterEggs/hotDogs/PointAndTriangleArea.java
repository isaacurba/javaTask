import java.util.Scanner;

public class PointAndTriangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
    

        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        System.out.print("Enter x3: ");
        double x3 = input.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = input.nextDouble();
        
        // side 1
        double dx1 = x2 - x1;
        double dy2 = y2 - y1;

        double side1 = Math.sqrt((dx1 * dx1) + (dy1 * dy1));

        // side 2
        double dx2 = x3 - x2;
        double dy2 = y3 - y2;

        double side2 = Math.sqrt((dx2 * dx2) + (dy2 * dy2));

        // side 3
        double dx3 = x3 - x1;
        double dy3 = y3 - y1;

        double side3 = Math.sqrt((dx3 * dx3) + (dy3 * dy3));
    }
}
