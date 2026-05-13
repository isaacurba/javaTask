// Less than 5_000 (STARTER10(not applicable below 5k))

// Between 5_000 - 14_999 discount 10% for code STARTER10

// Between 15_000 - 29_999 discount is 20% for code BIGBOY20

// Above 30_000 and above discount is 35% for code OSHOFREE35


public class OshoFreePromo {
    
    public static int calculateDiscount(int cartTotal, String promoCode){
        
        int total = cartTotal;
        
        if (promoCode == null || promoCode.isEmpty()){
            total = cartTotal;
        }
        if (cartTotal < 5000){
            total = cartTotal;
        }
        if (cartTotal >= 5000 && cartTotal <= 14999 && promoCode.equalsIgnoreCase("STARTER10")){
            total = cartTotal - (cartTotal * 10 / 100);
        } 
        if (cartTotal >= 15000 && cartTotal <= 29999 && promoCode.equalsIgnoreCase("BIGBOY20")){
            total = cartTotal - (cartTotal * 20 / 100);
        }       
        if (cartTotal >= 30000 && promoCode.equalsIgnoreCase("OSHOFREE35")){
            total = cartTotal - (cartTotal * 35 / 100);
        } 
        
        return total;
    }
}



