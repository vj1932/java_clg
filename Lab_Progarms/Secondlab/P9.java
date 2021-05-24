public class P9 {
    public static void main(String[] args) {
        patt9 p9 = new patt9();
        p9.print();
    }
}



class patt9
{
    void print()
    {
        int k = 5, ast = 0, pos = 1;
        System.out.println();
        for(int i = 0 ; i < 4 ; i++)
         {
            for(int j = 1 ; j <= 9 ; j++)
            {
                if(j < k)
                    System.out.print(" ");
                else 
                {
                    if(ast < pos)
                    {
                        if(ast == 0 || ast == pos - 1)
                            System.out.print("* ");
                        else
                            System.out.print(" ");
                        ast++;
                    }
                }
        }
        k--;
        pos = pos + 2;
        ast = 0;
        System.out.println();
    }
    for(int i = 0 ; i < 9 ; i++)
         System.out.print("* ");


    System.out.println();
    }
    }

