import java.util.Scanner;

public class halfPyramid {
    public static void main(String[] args) {
        System.out.print("enter the no. of lines of star to be printed:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                 System.out.print(j);
            }
             System.out.println();
        }
        sc.close();
    }
}
