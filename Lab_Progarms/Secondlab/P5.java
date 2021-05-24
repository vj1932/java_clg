import java.util.*;

public class P5 {
    public static void main(String[] args) {
        patte5 p = new  patte5();
         p.print();
        
    }

}
class patte5{
    int i,j,n;
    Scanner sc = new Scanner(System.in);
    void print()
    {
        System.out.println("Enter number:");
        n = sc.nextInt();
        for ( i = n; i > 0; i--) {
            for ( j = 1; j <= n; j++) {
                if (j < i) {
                    System.out.print(" ");
                }

                else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }

    }

    