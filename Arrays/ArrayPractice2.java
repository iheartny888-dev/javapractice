import java.util.*;

public class ArrayPractice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] nums = new int[3][2];

        for (int[] num : nums) {
            for (int n : num) {
                System.out.println("Enter a value for the row: " + num + " and column: " + n);
                nums[0][0] = input.nextInt();
            }
        }
        input.close();
    }
}
