public class TabularOutput {
    public static void main(String[] args) {

        System.out.println("n  n^2  n^3  n^4");

        for (int count = 1; count <= 4; count++) {
            System.out.printf("%d %d %d %d%n",
                count,
                count * count,
                count * count * count,
                count * count * count * count
            );
        }
    }
}
