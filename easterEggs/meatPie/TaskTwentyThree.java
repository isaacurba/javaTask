import java.util.Scanner;
public class TaskTwnetyThree{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String fName = input.nextLine();

        System.out.print("Enter last name: ");
        String lName = input.nextLine();      

        System.out.printf("%s %s", fName, lName);
    }
}
