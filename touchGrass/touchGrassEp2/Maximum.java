public class Maximum{
    public static void main(String... args){
        System.out.print(maximum(20, 5));
    }
    
    public static int maximum(int firstNumber, int secondNumber){
        if (firstNumber > secondNumber){
            return firstNumber;
        }else{
            return secondNumber;
        }
    }
}
