import java.util.Arrays;

public class TaskFour {

    public static void main(String... args){
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print(Arrays.toString(evenIndex(arr)));
    }

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
