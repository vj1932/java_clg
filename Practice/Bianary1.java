import java.util.Scanner;

public class Bianary1 {
    public static void main(String[] args) {
        Test1  t1 = new Test1();

     t1.getval();
    //   if(temp == 0)
    //   {
    //       System.out.println("Found");
    //   }
    //   else
    //   {
    //       System.out.println("Not Found");
    //   }
    }
}

class Test1
{
    int mid,high,low,temp=0;
    int a[] = {1,5,10,15,28,30,33,45};
    int Number;

    void getval()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        Number = sc.nextInt();

        low = 0;
        (high) = (a.length)-1;

        mid = ((low+high)/2);
        
       while(temp!=1)
       {
           mid = ((low+high)/2);
           if(a[mid] == Number)
           {
               System.out.println("number Found At:"+mid);
               temp = 1;
           }
           else if(a[mid] > Number)
           {
             high = (mid-1);
           }
           
           else if(a[mid] < Number)
           {
                low = (mid+1);
           }
       }
    }
}
