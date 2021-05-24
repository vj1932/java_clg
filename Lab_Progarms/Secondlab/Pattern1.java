package Lab_Progarms.Secondlab;
import java.util.Scanner;


public class Pattern1 {
    public static void main(String[] args) {
        Abc  a1 = new Abc();
        a1.print();
    }
}
class Abc{
    int n,i,j;
    Scanner sc = new Scanner(System.in);
    void print()
    {
        System.out.println("Enter number");
        n = sc.nextInt();
        for(i=0;i<n;i++)
         {
             System.out.println();
             for(j=0;j<n;j++)
             {
                System.out.print("*");
             }
         }
    }
    
}
