import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskEightTest {
   @Test
   public void testToGetTheMinimumOfTheEvenIndex(){
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expectedValue = 0;
        int actualValue = TaskEight.minimumOfIndex(arr);
        assertEquals(expectedValue, actualValue);
   }
}
