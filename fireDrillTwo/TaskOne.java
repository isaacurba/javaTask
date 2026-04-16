import java.util.Scanner;
public class TaskOne{
    public static void main(String[] args){
        Scanner inpurcollector = new Scanner(System.in);
        int total = 0;
        
        for (int count = 1; count <= 10; count++){
            System.out.print("Enter score " + count + " :");
            int score = inpurcollector.nextInt();
            
            total += score;
        }
        
        System.out.print("The sum is " + total);
    }
}
