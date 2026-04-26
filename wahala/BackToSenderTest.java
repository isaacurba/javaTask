import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackToSenderTest{

    @Test
    public void TestToCheckIfRateIsLessThan50(){
        // Given
        int number = 25;
        
        //when
        int actual = BackToSender.allowanceOf(number);
        
        int expected = 9000;
        
        assertEquals(actual, expected); 
    }
    
    @Test
    public void TestToCheckIfRateIsGreaterThan70(){
        // Given
        int number = 80;
        
        //when
        int actual = BackToSender.allowanceOf(number);
        
        int expected = 45000;
        
        assertEquals(actual, expected); 
    } 
    
    @Test
    public void TestToCheckIfRateIsBetween50and59(){
        // Given
        int number = 55;
        
        //when
        int actual = BackToSender.allowanceOf(number);
        
        int expected = 16000;
        
        assertEquals(actual, expected); 
    }
    
    @Test
    public void TestToCheckIfRateIsBetween60and69(){
        // Given
        int number = 65;
        
        //when
        int actual = BackToSender.allowanceOf(number);
        
        int expected = 21250;
        
        assertEquals(actual, expected); 
    }
    
    
    
    
}
