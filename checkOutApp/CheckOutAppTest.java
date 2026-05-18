import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CheckOutAppTest {

    @Test
    public void testTocheckIfCustomersNameExist(){
        String expectedName = "Adam smith";
        String actualValue = CheckOutApp.customerName(expectedName);
        assertEquals(expectedName, actualValue);
    }
    
    @Test
    public void testTocheckIfCustomersNameDoesNotExist(){
        String actualValue = CheckOutApp.customerName("");
        assertEquals("Enter a valid name", actualValue);
    }
    
    @Test
    public void testToCheckTheNameOgTheItemCustomerBought(){
        String expected = "parfait";
        String actualValue = CheckOutApp.customerItem(expected);
        assertEquals(expected, actualValue);
        
    }
    
    @Test
    public void testToCheckIfCustomerDoesNotNameAnyItem(){
        String actualValue = CheckOutApp.customerItem("");
        assertEquals("Enter a valid item", actualValue);
    }
    
    @Test
    public void testToCheckTheQuantityOfItemTheCustomerBought(){
        int piece = 2;
        int perUnit = 2100;
        int total = 4200;
        int[] expected = {piece, perUnit, total};
        int[] actualValue = CheckOutApp.customerItemPrice(piece, perUnit);
        assertArrayEquals(expected, actualValue);
    }
    
    @Test
    public void testToCheckIfThePriceOrQuantityDoesNotExist(){
        int[] actualValue = CheckOutApp.customerItemPrice(0, 0);
        assertEquals(null, actualValue);
    }

    @Test
    public void testToGetCashiersNameExist(){
        String name = "Aliya samuel";
        String actualValue = CheckOutApp.cashierName(name);
        assertEquals(name, actualValue); 
    }
    
    @Test
    public void testToCheckIfCashiersNameIsEmpty(){
        String actualValue = CheckOutApp.cashierName("");
        assertEquals("Enter cashier's name", actualValue);
    }
    
    @Test
    public void testToCheckTheDiscountOfTheItem(){
        int[] dummyItemDetail = {10, 400, 4000};
        int discountPercent = 10;
        int expectedDiscountAmount = 400;
        double actualDiscountAmount = CheckOutApp.discount(dummyItemDetail, discountPercent);
        assertEquals(expectedDiscountAmount, actualDiscountAmount);
    }
    
    @Test 
    public void testToReturn_0_IfTheDiscountWsNotGiven(){
         int[] dummyItemDetail = {10, 400, 4000};
         double actualValue = CheckOutApp.discount(dummyItemDetail);
         assertEquals(0, actualValue);
    }
    
    @Test
    public void testToCalculateVAT(){
        int[] dummyItemDetail = {2, 2100, 4200};
        int expectedTotal = 735;
        double actualValue = CheckOutApp.vat(dummyItemDetail);
        assertEquals(expectedTotal, actualValue);   
    }
    
    @Test
    public void testToCalculateTheBillTotal(){
        int[] dummyItemDetail = {2, 2100, 4200};
        int discount = 10;
        int expectedBillTotal = 5355;
        double actual = CheckOutApp.billTotal(dummyItemDetail, discount);
        assertEquals(expectedBillTotal, actual);
    }
    
    @Test
    public void testToCheckHowMuchCustorPaid(){
        double customerAmount = 6000;
        double expected = 6000;
        double actual = CheckOutApp.customerAmount(customerAmount);
        assertEquals(expected, actual);
    }
    
//    @Test
//    public void testToCalculateTheBalanceOfTheCustomer(){
//        
//        assertEquals(196.50, CheckOutApp.customerBalance()) 
//    }
}














