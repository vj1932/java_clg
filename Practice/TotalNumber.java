import java.util.Scanner;

public class TotalNumber {
    public static void main(String[] args) {
        CheckNumber c1 = new CheckNumber();
        c1.TakeVal();
        c1.Set();
    }
}

class CheckNumber{
    int k,size;
    int a[];
    void TakeVal()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        size = sc.nextInt();
        a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter Number");
        k = sc.nextInt();
    }

    void Set()
    {
        int i,j,flg = 0,val1 = 0,val2 = 0;
        for ( i = 0; i < a.length; i++) {
            for ( j = i+1; j < a.length; j++) {
                int temp = (a[i]+a[j]);

                if(temp == k)
                {
                    flg = 1;
                    break;
                }
                else
                {
                    flg = 0;
                }
            }   
        }
        if(flg == 0)
        {
            System.out.println("Not");
        }
        else
        {
            System.out.println("Yes");
        }
    }
}
