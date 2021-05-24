package Lab_Progarms.Secondlab;

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Check c1 = new Check();
        c1.print();
    }
}

class Check{
    int n,i = 1,temp = 0;
    Scanner sc = new Scanner(System.in);

    void print()
    {
        System.out.println("Enter Number");
        n = sc.nextInt();
        for(i=2;i<n/2;i++)
        {
            if(n % i == 0)
            {
                temp++; 
            }
        }  
        if(temp == 2)
        {
            System.out.println("No is prime");
        }
        else
        {
            System.out.println("No is Not Prime");
        }
    
    }
}

