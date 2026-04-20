public class Divide{
    public static void main(String... args){
    
        System.out.print(divide(10, 21));
    
    }
    
    public static int divide(int firstNumber, int secondNumber){
        if (firstNumber > secondNumber){
            return firstNumber / secondNumber;
        }else{
            return secondNumber / firstNumber;
        }
    }
}
