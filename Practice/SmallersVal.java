import java.util.Arrays;
import java.util.Scanner;

public class SmallersVal {
    public static void main(String[] args) {
        Smalles s1 = new Smalles();
        s1.print();
    }
}

class Smalles{
    int size;
    int a[] = {3,4,1,-5,-1,5};

    // void GetVal()
    // {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter size:");
    //     size = sc.nextInt();
    //     a = new int[size];

    //     System.out.println("Enter Array");
    //     for (int i = 0; i < a.length; i++) {
            
    //     }

    
    void print()
    {
        int temp = a[0],flg = 0,flg1 = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > temp)
            {
                temp = a[i];
            }
            }
            Arrays.sort(a);
             flg = a[0]; 

             
        System.out.println("Smalles"+flg+"Largest"+temp);
        for (int i = flg; i <= temp ;i++) {
            for (int j = 0; j < a.length; j++) {
                if(i == a[j])
                {
                   continue;
                 }
                else
                {
                     flg1 = i;
                }
            }
            
        }
        System.out.println("Val"+flg1);
    }
}
