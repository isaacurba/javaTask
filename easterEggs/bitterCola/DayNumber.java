import java.util.Scanner;
public class DayNumber{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter day 1 - 7: ");
        int day = input.nextInt();    
    
        if (day == 0){
            System.out.print("Its Monday: ");
        }  
        else if(day == 1){
            System.out.print("Its Tuesday: ");
        }
        else if(day == 2){
            System.out.print("Its Wednesday: ");
        }
        else if(day == 3){
            System.out.print("Its Thursday: ");
        }
        else if(day == 4){
            System.out.print("Its Friday: ");
        }
        else if(day == 5){
            System.out.print("Its Saturday: ");
        }          
        else if(day == 6){
            System.out.print("Its Sunday: ");
        }else{
            System.out.print("Enter a valid day");
        }
    }
}
