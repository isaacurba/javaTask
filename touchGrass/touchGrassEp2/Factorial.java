public class FactorialOf{
    public static void main(String... args){
        System.out.println(factorialOf(5));
    }
    
    public static int factorialOf(int number){
        int result = 1;
        
        for (int loop = number; loop >= 1; loop--){
            result *= loop;
        }
        
        return result;
    }
}
