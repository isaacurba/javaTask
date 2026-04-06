import java.util.Scanner;

public class AreaOfHexagon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter sides of hexgon: ");
        double sideOfHexagon = input.nextDouble();

        double area = (5.196152423 / 2) * (sideOfHexagon * sideOfHexagon);

        System.out.printf("The area is %.2f", area);

    }
}
