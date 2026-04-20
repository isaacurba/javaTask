public class IsEven{
    public static void main(String... args){
        System.out.print(isEven(21));
    }
    
    public static boolean isEven(int number){
        if (number % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
