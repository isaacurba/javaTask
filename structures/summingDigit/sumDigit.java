public class sumDigit {

    public static int sumOfDigit(int n) {
        int sum = 0;
        int lastDigit = 0;
        while (n > 0){
            lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        return sum;
    }
}
