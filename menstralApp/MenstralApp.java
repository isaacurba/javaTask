import java.time.LocalDate;
import java.util.Scanner;

public class MenstralApp {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your menstration start date in this format (yyyy-mm-dd): ");
        String inputDate = input.nextLine();

        LocalDate startDate = LocalDate.parse(inputDate);

        System.out.print("Enter your menstration flow duration: ");
        int flowDuration = input.nextInt();

        LocalDate flowEnd =  calculateFlowEnd(startDate, flowDuration);

        System.out.print("Your flow end is: " + flowEnd);


    }




    public static int calculateOvulationDay(int cycleLength) {
        return cycleLength - 14;
    }

    public static int calculateFertileStart(int ovulationDay) {
        return ovulationDay - 5;
    }

    public static LocalDate calculateFlowEnd(LocalDate startDate, int flowDuration) {
        return startDate.plusDays(flowDuration - 1);
    }

    public static LocalDate calculateOvulationDate(LocalDate startDate, int cycleLength) {
        int ovulationDay = calculateOvulationDay(cycleLength);
        return startDate.plusDays(ovulationDay);
    }

///
}
