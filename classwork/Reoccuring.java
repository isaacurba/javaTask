public class Reoccuring{

    public static void main(String[] args){

        int[] arr = {2,5,2,2,4};
        System.out.println(countMostOccuring(arr));


    }
    public static int countMostOccuring(int[] arr){
        int count = 0;

        for (int index = 0; index < arr.length; index++){

            for (int indexTwo = index + 1; indexTwo < arr.length; indexTwo++){

                if (arr[index] == arr[indexTwo]){
                    count++;
                }
            }
        }
        return count;
    }
}
