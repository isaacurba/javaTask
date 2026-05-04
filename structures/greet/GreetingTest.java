import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GreetingTest {
    @Test
    public void testToConcatonateTheGreeting(){
        String name = "Mercy";
        String expectedValue = "Hello Mercy";
        String actualValue = Greeting.greet(name);
        assertEquals(expectedValue, actualValue);
    }
}
