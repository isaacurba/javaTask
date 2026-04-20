public class FactorOf{
    public static void main(String... args){
        factorOf(10);  
    }
    
    public static void factorOf(int number){
        for (int startNumber = 1; startNumber <= number; startNumber++){
            if (number % startNumber == 0){
                System.out.print(startNumber + " ");
            }
        }
    }
}   
