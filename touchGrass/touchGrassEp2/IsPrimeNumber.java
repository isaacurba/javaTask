public class IsPrimeNumber{
    public static void main(String... args){
    
        System.out.print(isPrimeNumber(20));
    
    }
    
    public static boolean isPrimeNumber(int number){
        if (number % 2 != 0){
            return true;
        }else{
            return false;
        }
    }
}
