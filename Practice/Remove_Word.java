import java.util.Scanner;

public class Remove_Word {
    public static void main(String[] args) {
        TestString t1 = new TestString();
        t1.TakeVal();
    }
}

class TestString{
    String s1;
    int i,j;
    Scanner sc= new Scanner(System.in);
    
    char c1[];
    char c2;

    void TakeVal()
    {
        c1 = sc.next();
    }
}
