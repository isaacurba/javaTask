public class BackToSender {

    public static int allowanceOf(int number){
        int rate;
        if (number >= 50 && number <= 59){
           rate = 200;
        }
        else if (number >= 60 && number <= 69){
           rate = 250;
        }
        else if (number < 50){
            rate = 160;
        }else{
            rate = 500;
        }
        int result = number * rate + 5000;
        
        return result;
    }
}   
