import java.util.Scanner;
public class TaskSeven{
    public static void main(String[] args){
        Scanner inpurcollector = new Scanner(System.in);
        
        int totalNumber = 0;
        int sum = 0;
        int scoreCount = 0;
        
        for (int count = 1; count <= 10; count++){
            System.out.print("Enter score " + count + ": ");
            int score = inpurcollector.nextInt();
            
            if (score >= 0 && score <= 100){
                scoreCount++;
                sum += score;
            }else{
                System.out.println("invalid score");
            }            
        }
        double average = sum / scoreCount;
        
        System.out.println("The average is " + average);

    }
}

