import java.text.DecimalFormat;

public class StandardDeviation {
    
    public static int sumOfAllNumbers(int[] numbers){
        int sum = 0;
        for (int index = 0; index < numbers.length; index++){
            sum += numbers[index];
        }
        return sum;
    }    
    
    
    
    public static int numberLength(int[] numbers){
        return numbers.length;
    }
    
    
    
    public static double mean(int[] numbers){
        return ( (double) sumOfAllNumbers(numbers) / numberLength(numbers));
    }
    
    
    
    public static double[] numberSubtractedFromMean(int[] numbers){
        double[] subtracted = new double[numbers.length];
        
        double mean = mean(numbers);
        for (int index = 0; index < numbers.length; index++){
            
            subtracted[index] = numbers[index] - mean;
        }
        return subtracted;  
    }
 
 
 
    public static double[] squareOfSubtractedValue(int[] numbers){
        
        double[] square = new double[numbers.length];
        
        double[] subtracted = numberSubtractedFromMean(numbers);
        
        for (int index = 0; index < numbers.length; index++){
        
            square[index] = Math.pow(subtracted[index], 2);
        }
        return square;
    }   
    
    
    
    public static double sumTheSquares(int[] numbers){
        double sum = 0;
        double[] square = squareOfSubtractedValue(numbers);
        for (int index = 0; index < numbers.length; index++){
            sum += square[index];
        }
        return sum;
    }
    
    public static String squareRootOfVariance(int[] numbers){
    
        DecimalFormat df = new DecimalFormat("#.###");
        double result = Math.sqrt(sumTheSquares(numbers) / numberLength(numbers));
        
        return df.format(result) ;
    }
    
    
    
    
    
    
}
