import java.util.ArrayList;
import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        int sem , sub;
        Scanner sc = new Scanner(System.in);
        sem = sc.nextInt();
        sub = sc.nextInt();
        Result rs = new Result(sem, sub);

        rs.takeValue();

        rs.display();

        rs.avgerage();
    }
}
class Result{
    private int result[][];
    private int semster,subject;
    private ArrayList<String> subjects;

    
    public Result(int semster, int subject) { 
        this.semster = semster;
        this.subject = subject;
        this.result = new int[semster][subject];
        this.subjects = new ArrayList<>();
    }

    public void takeValue(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < this.semster ;i++){
            for(int j = 0; j < this.subject; j++){
                System.out.println("Enter Name of Subject : " + (j + 1));
                String name = sc.next();
                subjects.add(name);
                System.out.print("Enter Marks of subject : " + (j + 1));
                result[i][j] = sc.nextInt();
            }
        }
    }

    public void display(){
        int index = 0;
        for(int i = 0; i < this.semster; i++){
            System.out.println("Semester : " + (i + 1) );
            for(int j = 0; j < this.subject; j++){
                System.out.println(subjects.get(index++)+ " : " + result[i][j]);
            }
        }
    }

    public void avgerage(){
        double avg;
        for (int i = 0; i < this.semster; i++) {
            avg = 0;
            System.out.println("Semester : " + (i + 1) );
            for (int j = 0; j < this.subject; j++) {
                avg += result[i][j];
            }
            avg /= this.subject;
            System.out.println(avg);
        }
    }
}
