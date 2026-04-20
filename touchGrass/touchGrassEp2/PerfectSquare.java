public class PerfectSquare{
    public static void main(String... args){
        System.out.println(isPerfectSquare(10));
    }
    
    public static boolean isPerfectSquare(int number){
        int squareRoot = (int) Math.sqrt(number);
        
        if (squareRoot * squareRoot == number){
            return true;
        }else{
            return false;
        }
    }
}
