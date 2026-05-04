import java.util.Scanner;
import java.util.Arrays;

public class TaskOne {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);

        int[] scores = new int[10];

        for(int index = 0; index <= scores.length - 1; index++){
            System.out.print("Enter scores: ");
            int number = input.nextInt();

            scores[index] = number;

        }
        System.out.print(Arrays.toString(scores));

    }
}
