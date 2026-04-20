public class isPallindrome{
    public static void main(String... args){
        System.out.println(isPallindrome(231));
    }
    
    public static boolean isPallindrome(int number){
        int originalNumber = number;
        int lastDigit;
        int reverseDigit = 0;
        
        while (number > 0){
            lastDigit = number % 10;
            reverseDigit = (reverseDigit * 10) + lastDigit;
            number /= 10;
        }     
        
        return originalNumber == reverseDigit;
    }
}
