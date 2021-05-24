public class _7_4 {
    // implementing the main method
    public static void main(String[] x) {
        // Implementing the program logic
        System.out.println();
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= 5; j++) {
                if (j < i) {
                    System.out.print(" ");
                }

                else {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }
}
