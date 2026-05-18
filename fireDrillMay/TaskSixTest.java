import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskSixTest {
   @Test
   public void testToGetTheSumOfEvenIndexes(){
        int[] arr = {0, 1, 10, 20, 40};
        int expectedValue = 50;
        int actualValue = TaskSix.sumOfEvenIndex(arr);
        assertEquals(expectedValue, actualValue);
   }
}
