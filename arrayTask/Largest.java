public class Largest {
    
    public static void main(String... zicco){
        int[] numbers = {10, 20, 30, 40, 50};
        
        int result = largest(numbers);    
        
        System.out.print(result);
    }
    
    public static int largest(int[] array){
        int largest = array[0];
        
        for (int index = 0; index < array.length; index++){
            if (array[index] > largest){
                largest = array[index];
            }
        }
        return largest;
    }
}
