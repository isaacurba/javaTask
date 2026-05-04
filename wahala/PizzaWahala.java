import java.util.Scanner;
public class PizzaWahala {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("""
            --------------------------------------------------
                        IYA ARAMIDE PIZZA JOINT MENU
            ---------------------------------------------------
            |PIZZA TYPE  |  NUMBER OF SLICES  | PRICE PER BOX |            
            |-------------------------------------------------|
            |            |                    |               |  
            | Sapa size  |         4          |   2,500       |  
            |------------|--------------------|---------------|  
            |            |                    |               |  
            |Small Money |         6          |   2,900       |  
            |------------|--------------------|---------------|  
            |            |                    |               |
            | Big boys   |         8          |   4,000       |
            |------------|--------------------|---------------|  
            |            |                    |               |
            | Odogwu     |         12         |   5,200       |  
            ---------------------------------------------------
            
                         """);
                         
    int remainingSlice;
                         
    System.out.print("How many guests are you expecting: ");
    int guest = input.nextLine();
                         
                         
    System.out.print("What type of pizza do you want: ");
    String pizzaType = input.nextLine();
    
    System.out.print("How many boxes of pizza do you want: ");
    int boxes = input.nextLine();
    
    
    if (pizzaType.equalsIgnoreCase("sapa size")){
        
    } 
    else if (pizzaType.equalsIgnoreCase("Small money")){
        
    }
    else if (pizzaType.equalsIgnoreCase("Big boys")){
        
    }
    else if (pizzaType.equalsIgnoreCase("Odogwu")){
        
    }
                         
    }
}
