import java.util.Scanner;
public class TaskTwo{
    public static void main(String[] args){
        Scanner inpurcollector = new Scanner(System.in);
        int total = 0;
        int scoreCount = 0;
        
        for (int count = 1; count <= 10; count++){
            System.out.print("Enter score " + count + " :");
            int score = inpurcollector.nextInt();
            scoreCount++;
            total += score;
        }
        
        double average = total / scoreCount;
        System.out.print("The average is " + average);
    }
}
