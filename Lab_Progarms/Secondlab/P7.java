public class P7 {
    public static void main(String[] x) {
        patte7 p7 = new patte7();
        p7.print();
    }
}

class patte7 {
    void print() {
        int k = 0, ast = 0, pos = 9;

        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j < k + 1)
                    System.out.print(" ");
                else {
                    if (ast < pos) {
                        System.out.print("* ");
                        ast++;
                    }
                }
            }
            k++;
            pos = pos - 2;
            ast = 0;
            System.out.println();
        }

        k = 5;
        pos = 3;

        for(int i = 0 ; i < 4 ; i++)
         {
                for(int j = 1 ; j <= 9 ; j++) 
                {
                    if(j < k - 1)
                    {
                        System.out.print(" ");
                    }
                
                    else 
                    {
                        if(ast < pos)
                         {
                        System.out.print("* ");
                        ast++;
                        }
                    }
                }
         
            k--;
            pos = pos + 2;
            ast = 0;
            System.out.println();
         }
    }
}
