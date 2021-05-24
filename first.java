import java.util.Scanner;

class There {
    private static final String ENTER_VALUE_FOR_B = "Enter Value For B:";
    private static final String ENTER_VALUE_FOR_B2 = "ENTER VALUE FOR A";

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Just Print It:");
        int a, b;
        System.out.println(ENTER_VALUE_FOR_B2);
        a = sc.nextInt();
        System.out.println(ENTER_VALUE_FOR_B);
        b = sc.nextInt();
        int j = a + b;
        System.out.println("Ans Is:" + j);
    }
}