import java.util.*;

public class P2 {
    public static void main(String[] args) {
        Patt2 p2 =  new Patt2();
        p2.print();
    }
}

class Patt2
{
    int i,j,n;
    Scanner sc= new Scanner(System.in);

    void print()
    {
        System.out.println("Enter Number:");
        n =  sc.nextInt();

        for(i=0;i<n;i++)
        {
            System.out.println();
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
        }
    }
}
