public class P6 {
    // implementing the main method
    public static void main(String[] x) {
        patt7 p7 =  new patt7();
        p7.print();
    }
}

class patt7 {
    void print() {
        int k = 5, ast = 0, pos = 1;

        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j < k)
                    System.out.print(" ");
                else {
                    if (ast < pos) {
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
        // Reverse logic
        // Reseting necessary variables
        k = 0;
        pos = 7;
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 8; j++) {
                if (j <= k + 1)
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
    }
}
