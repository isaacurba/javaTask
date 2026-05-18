import java.util.Arrays;

public class TaskSix {

    public static int sumOfEvenIndex(int[] arr) {
        int sum = 0;

        for (int index = 0; index < arr.length; index++){
            if (index % 2 == 0){
                sum += arr[index];
            }
        }
        return sum;
    }
}
