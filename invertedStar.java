import java.util.Scanner;

public class invertedStar {
    public static void main(String[] args) {
        System.out.print("enter the no. of lines of star to be printed:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                 System.out.print("*");
            }
             System.out.println();
        }
        sc.close();
    }
}
    
