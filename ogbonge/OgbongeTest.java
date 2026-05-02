import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OgbongeTest{

    @Test
    public void testThatIHaveAListOfNumbersIGetTheLargest(){
        int [] numbers = {50, 20, 12, 8, 36, 200, 67};
        int expectedHighest = 200;
        int actualHighest = Ogbonge.getLargestOf(numbers);
        assertEquals(actualHighest, expectedHighest);
    } 

    @Test
    public void testThatReverseArrayGivesArrayFromTheLastElement(){
        int [] numbers = {50, 20, 12, 8, 36, 200, 67};
        int [] expectedReversedArray = {67,200, 36, 8, 12, 20, 50};
        int [] actualReversedArray = Ogbonge.reverseArray(numbers);
        assertArrayEquals(actualReversedArray, expectedReversedArray);
    }


    @Test
    public void testThatGivenItemIsFoundInArrayOrNot(){
        int [] numbers = {50, 20, 12, 8, 36, 200, 67};
        int numberToFind = 8;
        boolean isPresent = Ogbonge.isPresent(numbers, numberToFind);
        assertTrue(isPresent);
    }  

    @Test
    public void testThatGivenNumberGivesArrayOfDigits(){
        String number = "2801";
        String [] expectedExtractedDigits = {"2","8","0","1"};
        String [] actualExtractedDigits = Ogbonge.extractDigitsOf(number);
        assertArrayEquals(actualExtractedDigits, expectedExtractedDigits);
    } 
    
    @Test
    public void testThatGivenArrayOfnumbersAppearsInOddPositions(){
        int[] number = {10, 20, 30, 40, 50, 60};
        int[] expectedExtractedDigits = {10, 30, 50};
        int[] actualOddPositions = Ogbonge.oddPosition(number);
        assertArrayEquals(expectedExtractedDigits, actualOddPositions);
    }
    
    @Test
    public void testToCheckElementIsOnEvenPositionsOnAnArray(){
        int[] number = {20, 21, 22, 23, 24, 25};
        int[] expectedEvenPosition = {20, 22, 24};
        int[] actualPosition = Ogbonge.evenPosition(number);
        assertArrayEquals(expectedEvenPosition, actualPosition);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

      



}
