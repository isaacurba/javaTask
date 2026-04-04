import java.util.Scanner;
public class TaskTwnetyTwo{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int radius = input.nextInt();      

        double area = 3.14159 * (radius * radius);
        System.out.println(area);
    }
}
