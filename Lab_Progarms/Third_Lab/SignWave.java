public class SignWave {
    public static void main(String[] args) {
        Pattern p1 = new Pattern();
        int w_l = 10,w_h = 6;
        p1.print(w_l,w_h);
    }   
}

class Pattern{
    void print(int w_l,int w_h)
    {
        int is = 1, os = 2;
        for (int i = 1; i <= w_h; i++)
        {
            for (int j = 1;j <= w_l; j++)
            {
                for (int k = 1; k <= os; k++)
                {
                    System.out.printf(" ");
                }
                System.out.printf("*");
     
                for (int k = 1; k <= is; k++)
                    System.out.printf(" ");    
     
                // put any symbol
                System.out.printf("*");
     
                for (int k = 1; k <= os; k++)
                    System.out.printf(" ");
                 
                System.out.printf(" ");
            }
     
           
            os = (i + 1 != w_h) ? 1 : 0;
     
            is = (i + 1 != w_h) ? 3 : 5;
     
            System.out.printf("\n");
        
    }
}
}