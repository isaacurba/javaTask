import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    
    @Test
    public void testThatAccountExistAndBalanceIsAtZero(){
        Account account = new Account();
        
        assertNotNull(account);
        
        int expectedBalance = 0;
        int actualBalance = account.checkBalance();
        assertEquals(expectedBalance, actualBalance);
    }
    
    @Test
    public void testThatYouCanDeposit2kInTheAccount(){
    
        Account account = new Account();
    
        
    
    
        
        int amountToDeposit = 2000;
        account.deposit(amountToDeposit);
        
        int expectedBalance = 2000;
        int actualBalance = account.checkBalance();
        assertEquals(expectedBalance, actualBalance);
    }
    
    
    @Test
    public void testToCheckIfAmountToDepositIsANegativeValue(){
    
        Account account = new Account();
        
        account.deposit(5000);
        assertEquals(5000, checkBalance);
        
        assertThrows(illegalArgumentException.class, ()-> account.deposit(-2000));
        
        assertEquals(5000, account.checkBalance());
            
    
    }







}



















