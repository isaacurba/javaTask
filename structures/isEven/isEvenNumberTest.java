import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class isEvenNumberTest {
    @Test
    public void testToCheckIfNumberIsEven(){
        int n = 10;
        boolean expectedValue = true;
        boolean actualValue = isEvenNumber.isEven(n);
        assertTrue(expectedValue);
    }
}
