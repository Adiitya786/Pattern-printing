public class Butterfly_pattern {
    public static void main(String[] args) {
        int rows1 =4;

        //   simple using concept of mirror image
        
       //   1st half

        for(int i =1;i<=rows1;i++){
            // stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
                
            }

            //space
             for(int k=1;k<=2*(rows1-i);k++){
                System.out.print(" ");
             }
            for(int l=1;l<=i;l++){
                System.out.print("*");
                
            }
            System.out.println();
        }
          // 2nd half 

        for(int i =rows1;i>=1;i--){    // only reversing the outer loop to print the mirror of pattern.
            // stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
                
            }

            //space
             for(int k=1;k<=2*(rows1-i);k++){
                System.out.print(" ");
             }
            for(int l=1;l<=i;l++){
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
}




     /*     code by simple logic


        // 1st half of upper side


         for(int i =1;i<=rows1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
                
            }
             for(int l=1;l<=rows1-i;l++){
                System.out.print(" ");
             }
            for(int m=1;m<=rows1-i;m++){
                System.out.print(" ");
                
            }
             for(int n=1;n<=i;n++){
                System.out.print("*");
            }
           System.out.println("");   
        } 


        // 2nd half of lower side
         for(int i =1;i<=rows1;i++){
            for(int j=1;j<=rows1-i+1;j++){
                System.out.print("*");
                
            }
             for(int k=1;k<=i-1;k++){
                System.out.print(" ");
             }
            for(int l=1;l<=i-1;l++){
                System.out.print(" ");
                
            }
             for(int m=1;m<=rows1-i+1;m++){
                System.out.print("*");
            }
           System.out.println("");   
        } 

        */
