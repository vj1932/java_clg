import java.util.Scanner;

public class FirstProgarm{
    public static void main(String[] args) {
        GetVal g1 = new GetVal();
        g1.print();
    }
}
class GetVal{
    int a;
    Scanner sc = new Scanner(System.in);
    void print()
    {
        System.out.println("Enter Number:");
        a = sc.nextInt();

        if (a >= 0 )
        {
          System.out.println("Number is Postive:");
        }
        else
        {
            System.out.println("Number is Negative:");
        }
    }
}