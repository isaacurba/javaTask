import java.util.Scanner;
public class RandomRainbow{
    public static void main(String[] args){
        
        int num = (int)(Math.random() * 7) + 1;

        if(num == 1){
            System.out.print("violet");        
        }
        else if(num == 2){
            System.out.print("indigo");       
        }

        else if(num == 3){
            System.out.print("blue");        
        }

        else if(num == 4){
            System.out.print("green");        
        }

        else if(num == 5){
            System.out.print("yellow");        
        }

        else if(num == 6){
            System.out.print("orange");       
        }

        else if(num == 7){
            System.out.print("red");       
        }
    }
}
