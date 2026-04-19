public class MultiplicationTable {
    public static void main(String... args) {

        for (int i = 1; i <= 12; i++) {          // outer loop (rows)
            for (int j = 1; j <= 12; j++) {      // inner loop (columns)
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
            }
            System.out.println(); // move to next line after each row
        }

    }
}
