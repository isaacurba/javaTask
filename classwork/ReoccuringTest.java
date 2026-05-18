import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReoccuringTest{
    @Test
    public void testThatCountsTheMostReOccuringNumber(){
        int[] number = {1, 2, 2, 2, 2, 3};
        int expectedAnswer = 4;
        int actualVaue = Reoccuring.countMostOccuring(number);
        assertEquals(actualVaue, expectedAnswer);
    }
}
