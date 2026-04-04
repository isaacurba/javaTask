import java.util.Scanner;
public class TaskThirteen{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);    
        
        System.out.print("Enter city: ");
        String city = input.nextLine();

        System.out.printf("I live in %s", city);
    }
}
