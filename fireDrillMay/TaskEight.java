import java.util.Arrays;

public class TaskEight {

    public static int minimumOfIndex(int[] arr) {
        int[] evenIndex = new int[(arr.length + 1)/2];
        int minimum = arr[0];
        int count = 0;

        for (int index = 0; index < arr.length; index ++){
            if (index % 2 == 0){
                evenIndex[count] = arr[index];
                count++;
            }
        }
        for(int index= 1; index < evenIndex.length; index++){
           if (evenIndex[index] < minimum) minimum = evenIndex[index];
        }
        return minimum;
    }
}
