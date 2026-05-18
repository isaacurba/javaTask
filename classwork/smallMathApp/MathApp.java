public class MathApp {
    double firstNumber = 10;
    double secondNumber = 10;
    
    public void operator(String sign){
        if (sign.equals("+")){
            sum();
        }
        else if (sign.equals("-")){
            subtract();
        }
        else if (sign.equals("/")){
            divide();
        }
        else if (sign.equals("*")){
            multilply();
        }else{
            throw new IllegalArgumentException("Invalid sign"); 
        }
        
    }
    
    
    
    
    public double sum(){
        return firstNumber + secondNumber;
    }
    
    public double subtract(){
        return firstNumber - secondNumber;
    }    
    
    public double divide(){
        return firstNumber / secondNumber;
    }    

    public double multilply(){
        return firstNumber * secondNumber;
    }
    
}
