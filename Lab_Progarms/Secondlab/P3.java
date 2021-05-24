import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Patt3 p =  new Patt3();
        p.print();
    }
}

class Patt3{
    int i,j,n;
    Scanner sc = new Scanner(System.in);

    void print()
    {
        System.out.println("Enter Number:");
        n =  sc.nextInt();

        for(i=0;i<n;i++)
         {
             System.out.println();
            for(j=i;j<n;j++)
            {
                System.out.print(" *");
            }
            System.out.println();
         }
    }
}
