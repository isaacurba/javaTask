import java.util.Scanner;

public class MonthAndDay {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("There are 31 days in this month");
        }

        else if(month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("There are 30 days in this month");
        }

        else if(month == 2) {
            // Leap year check
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("This is a leap year. February has 29 days");
            } else {
                System.out.println("February has 28 days");
            }
        }

        else {
            System.out.println("Enter a valid month");
        }
    }
}
