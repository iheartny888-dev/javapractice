public class Recursion {
    public static void main(String[] args) {
    RecursionAlgos r = new RecursionAlgos();
    r.infinite();
    }
}

class RecursionAlgos {
    public void infinite() {
        infinite();
    }
}
