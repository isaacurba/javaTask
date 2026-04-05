import java.util.Scanner;
public class YearsToMinutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of years: ");
        int years = input.nextInt();
        
        // how to get days
        int days = years * 365;
        // ho to get minutes 
        int minutes = days * 24 * 60;

        System.out.println(years + " years is " + minutes + " minutes");
        System.out.println("Total days: " + days);
    }
}
