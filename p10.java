public class p10 {
    public static void main(String[] args) {
        patt10 p10 = new patt10();
        p10.print();
    }
}

class patt10 {
    void print() {
        int i,j;
        int k = 5, ast = 0, pos = 1;
        // Implementing the program logic
        System.out.println();
        for ( i = 0; i < 5; i++) {
            for ( j = 1; j <= 9; j++) {
                if (j < k)
                    System.out.print(" ");
                else {
                    if (ast < pos) {
                        if (ast == 0 || ast == pos - 1)
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
            k = 0;
            pos = 7;
            for ( i = 0; i < 5; i++) {
                for ( j = 1; j <= 8; j++) {
                    if (j <= k + 1)
                        System.out.print(" ");
                    else {
                        if (ast < pos) {
                            if (ast == 0 || ast == pos - 1)
                                System.out.print("* ");
                            else
                                System.out.print(" ");
                            ast++;
                        }
                    }
                }
                k++;
                pos = pos - 2;
                ast = 0;
                System.out.println();
            }

        }

    }
}
