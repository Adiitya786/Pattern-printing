public class Rhombus_pattern {
    public static void main(String[] args) {
        int rows =10;    // as per your choice
         for(int i =1;i<=rows;i++){
            // spaces
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
                
            }
            for(int k=1;k<=rows-1;k++){
                System.out.print("*");
                
            }
            System.out.println("");
            
        }
    }
}
