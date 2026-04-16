import java.util.Scanner;
public class TaskSeven{
    public static void main(String[] args){
        Scanner inpurcollector = new Scanner(System.in);
        
        int totalNumber = 0;
        int sum = 0;
        
        for (int count = 1; count <= 10; count++){
            System.out.print("Enter score " + count + ": ");
            int score = inpurcollector.nextInt();
            
            if (score >= 0 && score <= 100){
                sum += score;
            }else{
                System.out.println("invalid score");
            }

            
        }
        System.out.println("The sum is " + sum);

    }
}

