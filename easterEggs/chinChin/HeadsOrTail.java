import java.util.Scanner;
public class HeadsOrTail{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        int HeadOrTail = (int)(Math.random() * 2);
        
        System.out.print("Guess if its HEADS or TAILS (0 - 1: )");
        int guess = input.nextInt();

        if (guess == HeadOrTail){
            System.out.print("Correct you are an OG");   
        }else{
            System.out.print("Wrong try again");
        }
   
    }
}
