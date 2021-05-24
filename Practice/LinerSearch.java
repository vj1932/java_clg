import java.util.Scanner;

public class LinerSearch {
    public static void main(String[] args) {
        Liner L1 = new Liner();
        L1.print();
    }
}

class Liner{
    private int n,i,flg;

    int a[] = {1,5,9,3,7,4,6};
    Scanner sc= new Scanner(System.in);
    public void print()
    {
        System.out.println("Enter Number:");
        n = sc.nextInt();
        for(i=0;i<a.length;i++)
        {
            if(n == a[i])
            {
                flg = 1;
                System.out.println("Yes Found At:"+i);
                break;
            }
           
        }
        if(flg == 0)
        {
            System.out.println("Not Found");
        }
        
    }
}
