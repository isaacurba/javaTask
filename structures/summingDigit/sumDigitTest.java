import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class sumDigitTest {
    @Test
    public void testToAddTheSumOfEachDigit(){
        int n = 123;
        int expectedValue = 6;
        int actualValue = sumDigit.sumOfDigit(n);
        assertEquals(expectedValue, actualValue);
    }
}
