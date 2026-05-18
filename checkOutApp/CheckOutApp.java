import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CheckOutApp {

    public static void main(String... vivien){
        Scanner input = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.now(); 
        DateTimeFormatter formatter  = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
         String newDateTime = dateTime.format(formatter);
         
         
         
        
        System.out.println("What is the customer's Name");
        String cusName = input.nextLine();
        System.out.println();
        
        System.out.println("What did the user buy?");
        String cusItem = input.nextLine();
        System.out.println();
        
        System.out.println("How many pieces?");
        int piece = input.nextInt();
        System.out.println();
        
        System.out.println("How much per unit?");
        int pricePerUnit = input.nextInt();
        System.out.println();
        
        input.nextLine();
        
        System.out.println("Add more items?");
        String continueMessage = input.nextLine();  
        
        boolean addMore = true;
        
        while(addMore){
    
            System.out.println("What did the user buy?");
            String anotherCusItem = input.nextLine();
            System.out.println();
            
            System.out.println("How many pieces?");
            int anotherPiece = input.nextInt();
            System.out.println();
            
            System.out.println("How much per unit?");
            int anotherPricePerUnit = input.nextInt();
            System.out.println();
            
            input.nextLine();
            
            System.out.println("Add more items?");
            continueMessage = input.nextLine();
            
            if (continueMessage.equalsIgnoreCase("no")){
                addMore =  false;
            }
        
            
        }      
        
        System.out.println();
        
        System.out.println("What is me name?");
        String cashName = input.nextLine();
        
        System.out.println();
        
        System.out.println("How much discount will he get?");
        int discountOfItem = input.nextInt();
        
        System.out.println();
        
        
        
        
        
        
        
        
        System.out.print("""
            SEMICOLON STORES
            MAIN BRANCH
            LOCATION: 312 HERBERT MACAULAY WAY, SABO YABA, LAGOS.
            TEL: 03293828343
            DATE : %s
            Cashier: %s
            Customer Name: %s
            ------------------------------------------------------
            ------------------------------------------------------

                     ITEM     QTY     PRICE           TOTAL(NGN)
            
            ------------------------------------------------------            
                    
        
        
        
        
        
        """.formatted(newDateTime, cashName, cusName));
        
        
        
        
    }

    public static String customerName(String name){
        if (name.equals("") || name.equals(" ")){
            return "Enter a valid name";
        }else return name;
    }
    
    public static String customerItem(String item){
        if (item.equals("")){
            return "Enter a valid item";
        }else return item;
    }
    
    public static int[] customerItemPrice(int piece, int perUnit){
        int total = perUnit * piece;
        int[] itemDetails = {piece, perUnit, total};
        if(piece == 0 || perUnit == 0){
            return null;
        }else return itemDetails;
    }
    
    public static String cashierName(String name){
        if (name.equals("")){
            return "Enter cashier's name";
        }else return name;
    }
    
    public static double discount(int[] itemDetails, double discountPercent){
        int total = itemDetails[2];
        
        return (total * discountPercent) / 100;
    }
    
    public static double discount(int[] itemDetails){
                
        return discount(itemDetails, 0);
    }
    
    public static double vat(int[] itemDetails){
        int total = itemDetails[2];
        double vatPercent = 17.50;
         
        return (total * vatPercent) / 100;
    }
    
    public static double billTotal(int[] itemDetails, double discount){
        
        int total = itemDetails[2];
        double billTotal = total + discount(itemDetails, discount) + vat(itemDetails);
        
        return billTotal;
    }
    
    
    public static double customerAmount(double amount){
        return amount;
    }
    
//    public static double customerBalance(int billTotal, int customerAmount){
//        int customerAmount = customerAmount(customerAmount);
//        int billTotal =  billTotal()
//    }
//    
}











