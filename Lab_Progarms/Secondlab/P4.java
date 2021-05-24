public class P4 {
    public static void main(String[] x) {
        // // Declaring required variables
        // int k = 5, ast = 0, pos = 1;
        // // Implementing the program logic
        // System.out.println();
        // for (int i = 0; i < 5; i++) {
        // for (int j = 1; j <= 9; j++) {
        // if (j < k)
        // System.out.print(" ");
        // else {
        // if (ast < pos) {
        // System.out.print("* ");
        // ast++;
        // }
        // }
        // }
        // k--;
        // pos = pos + 2;
        // ast = 0;
        // System.out.println();
        // }

        System.out.println();
        for (int i = 5; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
