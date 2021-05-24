import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        day d1 = new day();
        d1.print();
    }
}

class day{
    int d;
    String daysc;
    Scanner sc = new Scanner(System.in);
    void print()
    {
        System.out.println("Enter Number Between 1 To 7");
        d = sc.nextInt();
        display();
    }

    void display()
    {
        switch (d) {
            case 1:
                daysc = "Monday";
                System.out.println(daysc);
                break;
            case 2:
                daysc = "Tuesday";
                System.out.println(daysc);
                break;
            case 3:
                daysc = "wednesday";
                System.out.println(daysc);
                break;
            case 4:
                daysc = "Thursday";
                System.out.println(daysc);
                break;
            case 5:
                daysc = "Friday";
                System.out.println(daysc);
                break;
            case 6:
                daysc = "Saturday";
                System.out.println(daysc);
                break;
            case 7:
                daysc = "Sunday";
                System.out.println(daysc);
                break; 
        }
    }
}
