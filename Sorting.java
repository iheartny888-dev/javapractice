import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> oldints = new ArrayList<>();
        oldints.add(47);
        oldints.add(12);
        oldints.add(83);
        oldints.add(29);
        oldints.add(61);
        ArrayList<Integer> newints = new ArrayList<>();
        int c = 0;
        for (int i : oldints) {
            boolean counter = true;
            for (int j = 0; j < oldints.size() - 1; j++) {
                if (i > oldints.get(j)) {
                    counter = false;
                }
            }
            if (counter == true) {
                c--;
                newints.add(i);
                oldints.set(oldints.indexOf(i - c), 999);
                
            }
        }
        System.out.println(newints);
    }
}