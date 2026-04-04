import java.util.Scanner;
public class Task{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();      

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.printf("I am %s and i am %d years old", name, age);
    }
}
