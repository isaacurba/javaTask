import java.util.Scanner;

public class Thief {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Are there thieves in the neighborhood? (yes/no): ");
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase("yes")) {

                while (true) {
                    System.out.print("Shout 'thief' to alert the police: ");
                    String shout = input.nextLine();

                    if (shout.equalsIgnoreCase("thief")) {
                        System.out.println("Police are on the way! Thief caught.");
                        return;
                    }
                    System.out.println("That didn't work, shout louder!");
                }
            } else {
                System.out.println("All quiet for now... checking again.");
            }
        }
    }
}
