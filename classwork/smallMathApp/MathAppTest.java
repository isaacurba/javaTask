import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathAppTest {
    
    @Test
    public void testToChecKForTheOperatorAdditionAndItsAdding(){
        MathApp math = new MathApp();
        math.operator("+");
        math.operator("-");
        math.operator("/");
        math.operator("*");
    }
    
    @Test
    public void testToCheckIfAdditionIsWorking(){
        MathApp math = new MathApp();
        
    }
}
