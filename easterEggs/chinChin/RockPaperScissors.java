import java.util.Scanner;
public class RockPaperScissors{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        int computer = (int)(Math.random() * 3);
        
        System.out.print("Lets play ROCK, PAPER, SCISSORS (0 - 1 - 2): ");
        int user = input.nextInt();

//        rock = 0;
//        paper = 1;
//        paper = 2;

//        Rock beats Scissors
//        Scissors beats Paper
//        Paper beats Rock

        if (computer == user){
            System.out.print("It's a draw'");   
        }
        else if((user == 1 && computer == 2) || (user == 1 && computer == 0) ||(user == 2 && computer == 1)) {
            System.out.println("You win!");
        }else{
            System.out.println("Computer winsss");
        }
   
    }
}
