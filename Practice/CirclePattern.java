public class CirclePattern {
    public static void main(String[] args)
    {
        int r = 6;
        PATT p1 = new PATT();
        p1.print(r);
       
    }
}

class PATT
{
    void print(int r)
    {
        double dist;
  
    // for horizontal movement
    for (int i = 0; i <= 2 * r; i++) {
  
    // for vertical movement
    for (int j = 0; j <= 2 * r; j++) {
        dist = Math.sqrt((i - r) * (i - r) +
                         (j - r) * (j - r));
  
        if (dist > r - 0.5 && dist < r + 0.5)
        {
            System.out.print("*");
        }
        else
        {
            System.out.print(" ");
        }
        
    }
  
    System.out.print("\n");
    }
    }

}






    
   
    
