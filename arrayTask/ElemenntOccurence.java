public class ElemenntOccurence {
    public static void main(String... kelechi){
        int[] number = {109, 20, 30, 40, 50, 89};
        
        System.out.print(contains(number, 20));

    }
    
    public static String contains(int[] array, int finder){
        
        for(int find : array){
            if (find == finder){
                return "The element is in the array";
            }
        }
        
        return "The element is not part of the ";
        
    }
}
