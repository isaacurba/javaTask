public class MultiplicationTable {
    public static void main(String... args) {

        for (int number = 1; number <= 12; number++) {          
            for (int secondNumber = 1; secondNumber <= 12; secondNumber++) {      
                System.out.print(number + " x " + secondNumber + " = " + (number * secondNumber) + "\t");
            }
            System.out.println(); 
        }

    }
}
