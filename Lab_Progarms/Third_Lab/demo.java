import java.util.*;

class demo {
    public static void main(String[] args) {
        ArrayList<HashSet<Integer>> arr = new ArrayList<HashSet<Integer>>();
        for (int i = 0; i <= 20; i++) {
            arr.add(new HashSet<Integer>());
        }
        for (int i = 0; i <= 360; i += 5) {
            HashSet<Integer> tmp = arr.get((int) (Math.round(Math.sin(Math.toRadians(i)) * 10)) + 10);
            tmp.add(i/5);
        }
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j < 72; j++) {
                if (arr.get(i).contains(j)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}