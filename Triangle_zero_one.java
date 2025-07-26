public class Triangle_zero_one {
    public static void main(String[] args) {
        int rows =5;  // as per choice e.g. (n)
         for(int i =1;i<=rows;i++){
            // spaces
            for(int j=1;j<=i;j++){
                if((i+j)%2==0)
                System.out.print(1+" ");
                else
                System.out.print(0+" ");
                
            }
            System.out.println("");
            
        }
    }
}
