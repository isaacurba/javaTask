public class PatternUpsideDown {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++){
            
            for (int count = 1; count <= row; count++){
                
                System.out.print("* " );
            }
        System.out.println();    
        }
        
        for (int row = 4; row >= 1; row--){
            for (int count = 1; count <= row; count++){
                System.out.print("* ");
            }
        System.out.println();
        }

    }
}
