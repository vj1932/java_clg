import java.util.Scanner;

public class SelectionSort{
    public static void main(String[] args) {
        Selection s1 = new Selection();
        s1.TakeVal();
        s1.Print();
    }
}

class Selection{
    int a[];
    int n;
    void TakeVal()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        n = sc.nextInt();
        a =  new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Elemnet:  ");
            a[i] = sc.nextInt();
        }
    }
    void Print()
    {
        int i,j,k=0;
        for(i=0;i<a.length;i++)
        {
            k = i;
            for (j = i; j < a.length; j++) {
                if(a[j] <= a[k])
                {
                    k = j;
                }
            }
            int temp = a[k];
            a[k] = a[i];
            a[i] = temp;
        }

        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}