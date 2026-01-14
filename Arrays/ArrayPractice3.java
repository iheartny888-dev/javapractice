public class ArrayPractice3 {
    public static void main(String[] args) {
        // challenge 1: 7 6 5 4
        // challenge 2: prints array number for number
        // challenge 3: prints 2
        // challenge 4: will triple the value of each j and add i to it, which should just be a bunch of zeroes
        // challenge 5: prints each number of the same index in each array
        // challenge 6: 333 444
        // challenge 7: 333 765

        //practice 4
        double[] winners = new double[18];
        int[] first_array = {1, 2, 3, 5, 7, 11, 13, 17};
        int[] num = new int[20];
        for (int n : num) {
            n = n * 2;
        }
        int[][] maze = new int[30][40];
        int[][] loop = new int[16][32];
        for (int[] l : loop) {
            for (int j : l) {
                System.out.println(j);
            }
        }
        // challenge 6: prints out the whole array number for number
        // challenge 7: prints 0
        // challenge 8: 12, 8, 6, 8, 6, 4
    }
}
