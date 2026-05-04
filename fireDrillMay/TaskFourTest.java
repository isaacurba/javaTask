import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFourTest {
   @Test
   public void testToGetEvenIndexOfAnArray(){
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expectedValue = {0, 2, 4, 6, 8, 10};
        int[] actualValue = TaskFour.evenIndex(arr);
        assertArrayEquals(expectedValue, actualValue);
   }
}
