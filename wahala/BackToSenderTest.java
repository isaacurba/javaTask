import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackToSenderTest{

    @Test
    public void TestThatBackToSenderReturnCorrectValue(){
        // Given
        int number = 80;
        
        // when
        int expected = BackToSender.allowanceOf(number);
        
        // check
        int actual = 45000;
        assertEquals(actual, expected);
    }
}
