import java.util.Scanner;
public class TaskSeven{
    public static void main(String[] args){
        Scanner inpurcollector = new Scanner(System.in);
        int even = 0;
        int totalNumber = 0;
        int sum = 0;
        
        for (int count = 1; count <= 10; count++){
            System.out.print("Enter score " + count + ": ");
            int score = inpurcollector.nextInt();
            
            if (score % 2 == 0){
                sum += score;
            }
            
            if (score % 2 == 0){
                totalNumber++;
                even += score;
            }
            
        }
        double average = even / totalNumber;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }
}

