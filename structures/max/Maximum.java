public class Maximum {

    public static int max(int a, int b, int c){
        int maxNumber = a;
        if (b > maxNumber) maxNumber = b;
        if (c > maxNumber) maxNumber = c;

        return maxNumber;
    }
}
