import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;


public class MenstralAppTest {

    @Test
    public void testThatcalculateTheOvulationDay(){
        int cycleLength = 28;
        int exectedVAlue = 14;
        int actualValue = MenstralApp.calculateOvulationDay(cycleLength);
        assertEquals(actualValue, exectedVAlue);
    }

    @Test
    public void testThatCalculateTheFertileWindow(){
        int ovulationDay = 14;
        int exectedVAlue = 9;
        int actualValue = MenstralApp.calculateFertileStart(ovulationDay);
        assertEquals(actualValue, exectedVAlue);
    }

    @Test
    public void testThatCalculateTheFlowEnd(){
        LocalDate startDate = LocalDate.of(2026, 03, 14);
        int flowDuration = 5;
        LocalDate expectedDate = LocalDate.of(2026, 03, 18);
        LocalDate actualValue = MenstralApp.calculateFlowEnd(startDate, flowDuration);
        assertEquals(actualValue, expectedDate);
    }

    @Test
    public void testThatCalculateTheOvulationDate(){
        LocalDate startDate = LocalDate.of(2026, 03, 30);
        int cycleLength = 28;
        LocalDate expectedDate = LocalDate.of(2026, 04, 13);
        LocalDate actualValue = MenstralApp.calculateOvulationDate(startDate, cycleLength);
        assertEquals(actualValue, expectedDate);
    }
























}
