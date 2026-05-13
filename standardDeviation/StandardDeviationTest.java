import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationTest {
    
    @Test
    public void testToGettheSumOfDigitInAnArray(){
        int[] numbers = {46, 69, 32, 60, 52, 41};
        int expected = 300;
        int actualValue = StandardDeviation.sumOfAllNumbers(numbers);
        assertEquals(expected, actualValue);
    }
    
    @Test
    public void testToGetTheLengthOfTheArray(){
        int[] numbers = {46, 69, 32, 60, 52, 41};
        int expected = 6;
        int actualValue = StandardDeviation.numberLength(numbers);
        assertEquals(expected, actualValue);
    }
    
    @Test
    public void testToCalculateTheMean(){
        int[] numbers = {46, 69, 32, 60, 52, 41};
        double expected = 50.0;
        double actualValue = StandardDeviation.mean(numbers);
        assertEquals(expected, actualValue);
    }
    
    @Test
    public void testToSubtractMeanFromEachNumber(){
        int[] numbers = {46, 69, 32, 60, 52, 41};
        double[] expected = {-4, 19, -18, 10, 2, -9};
        double[] actualValue = StandardDeviation.numberSubtractedFromMean(numbers);
        assertArrayEquals(expected, actualValue);
    }
    
    @Test 
    public void testToCalculateTheSquareOfThesubtractedValue(){
        int[] numbers = {46, 69, 32, 60, 52, 41};
        double[] expected = {16, 361, 324, 100, 4, 81};
        double[] actualValue = StandardDeviation.squareOfSubtractedValue(numbers);
        assertArrayEquals(expected, actualValue);
    }
    
    @Test
    public void testToSumTheSquares(){
        int[] numbers = {46, 69, 32, 60, 52, 41};
        double expected = 886;
        double actualValue = StandardDeviation.sumTheSquares(numbers);
        assertEquals(expected, actualValue);
    }
    
    @Test
    public void testToCalculateTheSquareRootOfVariance(){
        int[] numbers = {46, 69, 32, 60, 52, 41};
        String expected = "12.152";
        String actualValue = StandardDeviation.squareRootOfVariance(numbers);
        assertEquals(expected, actualValue);
    }
    
}











