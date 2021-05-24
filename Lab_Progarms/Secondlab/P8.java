public class P8 {
    public static void main(String[] args) {
        patt8 p8 = new patt8();
        p8.print();
    }
}

class patt8 {
    void print() {
        int n = 1;
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
}
