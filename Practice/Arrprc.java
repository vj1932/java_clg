import java.util.Scanner;

public class Arrprc{
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.getdata();
    }
}
class Test{
    int sem,sub;
    int a[][];
    int semsstore[];
    String[] substore;
    Scanner sc= new Scanner(System.in);
    
    void getdata()
    {
        System.out.println("Enter Semster");
        sem = sc.nextInt();
        System.out.println("Enter Total Subject");
        sub = sc.nextInt();

        a = new int[sem][sub];
        substore = new String[sub*sub];

        System.out.println("subject"+sub);
        System.out.println("Length is:"+substore.length);
        print();
        //get();
    }

    void print()
    {
          
        int i,j;
        for(i=0;i<sem;i++)
        {
            System.out.println("Enter Semster Number:");
            semsstore[i] = sc.nextInt();
            
            for(j=0;j<sub;j++)
            {
                sc.nextLine();
                System.out.println("Enter Subject Name");
                substore[j] = sc.nextLine();
                System.out.println("Enter Mark:");
                a[i][j] = sc.nextInt();
            }
        }

        for(i=0;i<sem;i++)
        {
            System.out.println("Semster:"+semsstore[i]);
            for(j=0;j<sub;j++)
            {
               System.out.println(substore[j]+":"+a[i][j]);
            }
        }
    }


    // void get()
    // {
        
    //     for(int i=0;i<substore.length;i++)
    //     {
    //         substore[i] = sc.nextLine();
    //     }
    //     for(int i=0;i<5;i++)
    //     {
    //         System.out.println(substore[i]);
    //     }
    // }
    
}