import java.util.Arrays;

public class ReverseArray {
    public static void main(String... kelechi){
        int[] number = {109, 20, 30, 40, 50, 89};
        
        int[] result = reversed(number);
        
        System.out.print(Arrays.toString(result));
    }
    
    public static int[] reversed(int[] array){
        int[] reversed = new int[array.length];
        int reverseCount = 0;
        for (int index = array.length - 1; index >= 0; index--){
            reversed[reverseCount] = array[index];
            reverseCount++;
        }
        
        return reversed;
    }
}
