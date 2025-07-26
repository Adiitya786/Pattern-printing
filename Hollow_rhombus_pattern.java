public class Hollow_rhombus_pattern {
     public static void main(String[] args) {
        int rows =5;    // as per your choice
         for(int i =1;i<=rows;i++){
            // spaces
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
                
            }
            for(int k=1;k<=rows;k++){
                if(i==1||k==1||i==rows||k==rows)
                System.out.print("*");
                else
                System.out.print(" ");
                
            }
            System.out.println("");
            
        }
    }
}
