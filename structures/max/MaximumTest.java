import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaximumTest {
    @Test
    public void testToGetTheMaximumNumber(){
        int a = 1;
        int b = 2;
        int c = 3;
        int expectedValue = 3;
        int actualValue = Maximum.max(a, b, c);
        assertEquals(actualValue, expectedValue);
    }
}
