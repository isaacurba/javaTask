// Less than 5_000 (STARTER10(not applicable below 5k))

// Between 5_000 - 14_999 discount 10% for code STARTER10

// Between 15_000 - 29_999 discount is 20% for code BIGBOY20

// Above 30_000 and above discount is 35% for code OSHOFREE35

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class OshoFreePromoTest {
    
    @Test
    public void testTOCalculateDiscountNottoBeAppliedIfCartTotalIsLesserThan5000(){
        int cartTotal = 1000;
        String promoCode = "starter10";
        int expected = 1000;
        int actualValue = OshoFreePromo.calculateDiscount(cartTotal, promoCode);
        assertEquals(expected, actualValue);
    }
    
    @Test
    public void testToCalculateDiscountIfThereIsNoDiscount(){
        int cartTotal = 30000;
        String promoCode = "";
        int expected = 30000;
        int actualValue = OshoFreePromo.calculateDiscount(cartTotal, promoCode);
        assertEquals(expected, actualValue);
    }
    
    @Test
    public void testToCalculateDiscountIfCartTotalIsBetween5_000And14_999(){
        int cartTotal = 5000;
        String promoCode = "starter10";
        int expected =  4500;
        int actualValue = OshoFreePromo.calculateDiscount(cartTotal, promoCode);
        assertEquals(expected, actualValue);        
    }
    
    @Test
    public void testToCalculateDiscountIfCartTotalIsBetween15_000And29_999(){
        int cartTotal = 20000;
        String promoCode = "bigBoy20";
        int expected = 16000;
        int actualValue = OshoFreePromo.calculateDiscount(cartTotal, promoCode);
        assertEquals(expected, actualValue);
    }
    
    @Test
    public void testToCalculateDiscountIfCartTotalIs30_000Above(){
        int cartTotal = 35000;
        String promoCode = "oshofree35";
        int expected = 22750;
        int actualValue = OshoFreePromo.calculateDiscount(cartTotal, promoCode);
        assertEquals(expected, actualValue);
    }
    
    
    
    
}
















