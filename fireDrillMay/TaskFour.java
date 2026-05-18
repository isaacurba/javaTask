import java.util.Arrays;

public class TaskFour {

    public static int[] evenIndex(int[] arr) {
        int[] evenIndex = new int[(arr.length + 1)/2];
        int count = 0;

        for (int index = 0; index <= arr.length - 1; index ++){
            if (index % 2 == 0){
                evenIndex[count] = arr[index];
                count++;
            }
        }
        return evenIndex;
    }
}
