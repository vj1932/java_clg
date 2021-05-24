import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Bianary b1 = new Bianary();
        b1.getVal();
    }
}

class Bianary{

    int mid,high,low;
    int a[] = {1,5,10,15,28,30,33,45};
    int n;

    void getVal()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        n = sc.nextInt();

        low = 0;
        (high) = (a.length)-1;

        mid = ((low+high)/2);
        // System.out.println(mid+":"+a[mid]);
        // System.out.println(low+":"+a[low]);
        // System.out.println(high+":"+a[high]);
       
        Check();
    }
    
    public void Check()
    {
        if(n > a[high] || n < a[low])
        {
            System.out.println("Element Not Found"); 
        }
        else
        {   
            if(a[mid] == n)
            {
                System.out.println("Element Found At:"+mid);
            }
            else
            {
                print();
            }
           
        }
    }

    public void print()
    {
        int flg = 0,temp = 0;
        while(flg!=1)
        {

                if(n > a[mid])
                {
                    low = (mid);
                    mid = ((low+high)/2);

                    while(flg!=1)
                    {
                        if(n == a[mid])
                        {
                            System.out.println("Elemnt Found At:"+mid);
                            flg = 1;
                        }
                        else
                        {
                            low = (mid);
                            mid = ((low+high)/2);
                            for (int i = low; i < high; i++) {
                                if(n == a[i])
                                {
                                    System.out.println("Elemnt Found At:"+i);
                                    flg = 1;
                                }
                                else
                                {
                                    System.out.println(a[i]);
                                    temp++;
                                }
                            }
                            if(temp == high)
                            {
                                System.out.println("Elemnt not Found");
                                flg = 1;
                            }  
                        }
                    }
                }
                    else
                    {
                        high = (mid);
                        mid = ((low+high)/2);
                        {
                            while(flg!=1)
                            {
                                if(n == a[mid])
                                {
                                    System.out.println("Elemnet Found At:"+mid);
                                    flg = 1;
                                }
                                else
                                {
                                    high = (mid);
                                    mid = ((low+high)/2);
                                    for (int i = low; i < high; i++) {
                                        if(n == a[i])
                                        {
                                            System.out.println("Elemnt Found At:"+i);
                                            flg = 1;
                                        }
                                        else
                                        {
                                            System.out.println(a[i]);
                                            temp++;
                                        }
                                    }
                                    if(temp == high)
                                    {
                                        System.out.println("Elemnt not Found");
                                        flg = 1;
                                    }
                                }
                            }
                        }
                    }   
        }
    }
}
