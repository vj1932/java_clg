import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Mark m1 = new Mark();
        m1.get();
    }
}
class Mark{
    float m;
    Scanner sc = new Scanner(System.in);
    void get()
    {
        int m1,m2,m3,m4,m5;
        System.out.println("Enter Marks");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();

        m = (m1+m2+m3+m4+m5) / (float)(5);
        print();
    }
    
    void print()
    {
        if(m >= 60)
        {
            System.out.println("First Divison"+m);
        }
        else if(m >= 50 && m <= 59 )
        {
            System.out.println("Second Class"+m);
        }
        else if(m >=40 && m <=49)
        {
            System.out.println("Third Division"+m);
        }
        else{
        System.out.println("Fail"+m);
        }
        
    }
}