import java.util.*;

public class ArrayPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] nums = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Enter a value for the row: " + i + " and column: " + j);
                nums[i][j] = input.nextInt();
            }
        }
        input.close();

        System.out.println(Arrays.deepToString(nums).replace("], ", "]\n"));
    }
}
