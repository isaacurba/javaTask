import java.util.Scanner;
public class LeapYear {
    public static void main(String... args) {
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter the year to check if it's leap year: ");
        int year = inputCollector.nextInt();
        
        System.out.print(leapYear(year)); 
    }

    public static boolean leapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
