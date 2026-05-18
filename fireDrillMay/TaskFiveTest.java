import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFiveTest {
   @Test
   public void testToGetEvenIndexOfAnArray(){
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expectedValue = {1, 3, 5, 7, 9};
        int[] actualValue = TaskFive.oddIndex(arr);
        assertArrayEquals(expectedValue, actualValue);
   }
}
