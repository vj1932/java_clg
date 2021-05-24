import java.util.Arrays;

public class RemoveNegativeNumber {
    public static void main(String[] args) {
        ArrCheck a1 = new ArrCheck();
        a1.sort();
    }
}


class ArrCheck
{
    int a[] = {5,6,7,-3,-3,-4};
    int t = (a.length);
    int temp[] = new int[t];
    int n,i;
    void sort()
    {
        Arrays.sort(a);
        Change();
    }
    void Change()
    {
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]!=a[i+1])
            {
                temp[n++] = a[i];
            }
        }
        print();
    }

    void print()
    {
        for (int i = 0; i < a.length; i++) {
            if(a[i] < 0)
            {
                a[i] = 0;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(a[i] + ",");
        }
    }
}
