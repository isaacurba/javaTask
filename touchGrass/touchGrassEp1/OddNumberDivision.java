public class OddNumberDivision {
    public static void main(String... args) {

        double sum = 0;

        for (int numerator = 1; numerator <= 99; numerator += 2) {
            int denominator = numerator + 2;

            System.out.print(numerator + "/" + denominator);

            sum += (double) numerator / denominator;

            if (numerator < 99) {
                System.out.print(" + ");
            }
        }

        System.out.println();
        System.out.println("Sum = " + sum);
    }
}


