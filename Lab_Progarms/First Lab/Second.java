import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        MaxNumber m1 = new MaxNumber();
        m1.print();
    }
}

class MaxNumber{
    int a,b,c;
    Scanner sc = new Scanner(System.in);
    void print()
    {
        System.out.println("Enter Three Number:");
        System.out.println("A:");
        a = sc.nextInt();
        System.out.println("B:");
        b = sc.nextInt();
        System.out.println("C:");
        c = sc.nextInt();

        if(a > b && a > c)
        {
            System.out.println(" A is Big");
        }

        else if( b > a  && b > c)
        {
            System.out.println("B is Big");
        }
        else
        {
            System.out.println("C is Big");
        }
    }
}
