public class TaskFive {
    public static int[] oddIndex(int[] arr) {

    int[] result = new int[arr.length / 2];
    int count = 0;

    for (int index = 0; index < arr.length; index++){
        if (index % 2 != 0){
            result[count++] = arr[index];
        }
    }
    return result;


    }
}
