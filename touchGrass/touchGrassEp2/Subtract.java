public class Subtract{
    public static void main(String... args){
    
        System.out.print(subtract(10, 20));
    
    }
    
    public static int subtract(int firstNumber, int secondNumber){
        if (firstNumber > secondNumber){
            return firstNumber - secondNumber;
        }else{
            return secondNumber - firstNumber;
        }
    }
}
