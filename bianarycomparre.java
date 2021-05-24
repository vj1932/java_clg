import java.util.Scanner;

public class bianarycomparre {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int a = 8, temp = 0, i, temp1 = 0, b;
        System.out.println("Enter Value For A:");
        a = sc.nextInt();
        String abc = Integer.toBinaryString(a);
        
        for (i = 0; i < abc.length(); i++) {
            if (abc.charAt(i) == '1') {
                temp++;
            }
        }
        System.out.println(temp);
        b = a;
        while (temp1 != temp) {
            temp1 = 0;
            b++;
            String zxc = Integer.toBinaryString(b);
            for (i = 0; i < zxc.length(); i++) {
                if (zxc.charAt(i) == '1') {
                    temp1++;
                }
            }

        }

        System.out.println("Value is:" + b);

    }
}