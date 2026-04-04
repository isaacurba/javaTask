import java.util.Scanner;
public class Task{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = input.nextInt();      

        System.out.print("Enter height: ");
        int height = input.nextInt();

        int area = 1/2 * (base * height);
        System.out.println(area);
    }
}
