import java.util.Scanner;

public class charPattern {
    public static void main(String[] args) {
        System.out.print("enter the no. of lines of character to be printed:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        char ch = 'A';
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                 System.out.print(ch);
                 ch++;
            }
             System.out.println();
        }
        sc.close();
}
}