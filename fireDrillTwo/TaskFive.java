import java.util.Scanner;
public class TaskFive{
    public static void main(String[] args){
        Scanner inpurcollector = new Scanner(System.in);
        int even = 0;
        
        for (int count = 1; count <= 10; count++){
            System.out.print("Enter score " + count + " :");
            int score = inpurcollector.nextInt();
            
            if (score % 2 == 0){
                even += score;
            }
            
        }
        
        System.out.println("The sum of the even is " + even);
    }
}
