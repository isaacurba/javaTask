import java.util.Scanner;

public class PopulationProjection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        int currentPopulation = 312032486;

        int secondsInYear = 365 * 24 * 60 * 60;

        int birthsPerYear = secondsInYear / 7;
        int deathsPerYear = secondsInYear / 13;
        int immigrantsPerYear = secondsInYear / 45;

        int populationChangePerYear = birthsPerYear + immigrantsPerYear - deathsPerYear;

        int futurePopulation = currentPopulation + (populationChangePerYear * years);

        System.out.println("The population after " + years + " years is " + futurePopulation);

        input.close();
    }
}
