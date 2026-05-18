import java.util.Arrays;
import java.util.Scanner;
public class DuplicateElimination {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int index = 0; index < numbers.length; index++){
            for (int count = 10; count < numbers.length; count+=10){
                numbers[index] = count;
            }
        }
        System.out.print(Arrays.toString(numbers));
    }
}
