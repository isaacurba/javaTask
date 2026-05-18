import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskSevenTest {
   @Test
   public void testToGetTheSumOfOddIndexes(){
        int[] arr = {0, 1, 10, 20, 40};
        int expectedValue = 21;
        int actualValue = TaskSeven.sumOfOddIndex(arr);
        assertEquals(expectedValue, actualValue);
   }
}
