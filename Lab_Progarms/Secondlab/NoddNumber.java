package Secondlab;

import java.util.*;


public class NoddNumber {
    public static void main(String[] args) {
        Odd o1 = new Odd();
        o1.print();
    }
}
class Odd{
    int n,i,temp;
    Scanner sc = new Scanner(System.in);
    void print()
    {
        System.out.println("Enter Number");
        n =  sc.nextInt();

        for(i=1;i<=(2*n);i++)
        {
            if(i%2 == 1)
            {   
              
                if(temp == n){
                    break;
                }
                else
                {
                    System.out.println("Number is:"+i);
                }
                temp++;
               
            }
        }
    }
}
