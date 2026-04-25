public class Kata{
    public static void main(String... args){
    
        System.out.println(divide(10, 21));
        
        System.out.println(factorialOf(5));
        
        factorOf(10);  
        
        System.out.print(isEven(21));
        
        System.out.println(isPallindrome(231));
        
        System.out.print(isPrimeNumber(20));
        
        System.out.print(maximum(20, 5));
        
        System.out.println(isPerfectSquare(10));
        
        System.out.println(squareOf(50));
        
        System.out.print(subtract(10, 20));
        
        
        
    }
    public static int divide(int firstNumber, int secondNumber){
        if (firstNumber > secondNumber){
            return firstNumber / secondNumber;
        }else{
            return secondNumber / firstNumber;
        }
    }
    
    public static int factorialOf(int number){
        int result = 1;
        
        for (int loop = number; loop >= 1; loop--){
            result *= loop;
        }
        
        return result;
    }
    
    public static void factorOf(int number){
        for (int startNumber = 1; startNumber <= number; startNumber++){
            if (number % startNumber == 0){
                System.out.print(startNumber + " ");
            }
        }
    }
    
    public static boolean isEven(int number){
        if (number % 2 == 0){
            return true;
        }else{
            return false;
        }
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
    
    public static boolean isPrimeNumber(int number){
        if (number % 2 != 0){
            return true;a
        }else{
            return false;
        }
    }
    
    public static int maximum(int firstNumber, int secondNumber){
        if (firstNumber > secondNumber){
            return firstNumber;
        }else{
            return secondNumber;
        }
    }
    
    public static boolean isPerfectSquare(int number){
        int squareRoot = (int) Math.sqrt(number);
        
        if (squareRoot * squareRoot == number){
            return true;
        }else{
            return false;
        }
    }
    
    public static int squareOf(int number){
        return number * number;
    }
    
    public static int subtract(int firstNumber, int secondNumber){
        if (firstNumber > secondNumber){
            return firstNumber - secondNumber;
        }else{
            return secondNumber - firstNumber;
        }
    }
   

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
