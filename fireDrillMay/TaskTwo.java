import java.util.Scanner;
import java.util.Arrays;

public class TaskTwo {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);

        int[] scores = new int[10];

        for(int index = 0; index <= scores.length - 1; index++){
            System.out.print("Enter scores: ");
            int number = input.nextInt();

            scores[index] = number;
        }

        for (int index = 0; index <= scores.length - 1; index++){
            System.out.println(scores[index]);
        }

    }
}
