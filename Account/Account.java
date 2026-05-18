public class Account {
    
    int balance;
    
    public int checkBalance(){
        return balance;
    }
    
    public void deposit(int amount){
        if (amount < 0) throw new illegalArgumentException("Amount cannot be negative");
        
        balance += amount;
    }
    
    
}
