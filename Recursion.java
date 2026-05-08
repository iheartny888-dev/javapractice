public class Recursion {
    public static void main(String[] args) {
    RecursionAlgos r = new RecursionAlgos();
    r.countDown(5);
    }
}

class RecursionAlgos {
    public void infinite() {
        infinite();
    }

    public void countDown(int n) {
        if (n <= 0) {
            System.out.println("Hooray!");
            return;
        }
        System.out.println(n);
        countDown(n - 1);
    }
}
