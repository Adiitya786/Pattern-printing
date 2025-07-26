public class Diamond_pattern {
     public static void main(String[] args) {
        int rows =8;    // as per your choice


        // 1st half
         for(int i =1;i<=rows;i++){
            // spaces
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
                
            }
            // stars
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
                
            }
            System.out.println("");
            
        }

        // 2nd half
         for(int i =rows;i>=1;i--){
            // spaces
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
                
            }
            // stars
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
                
            }
            System.out.println("");
            
        }
    }
}
