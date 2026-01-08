public class ArrayPractice {
    public static void main(String[] args) {
        int[] array = {-20, -5, -62, 1};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);

        int target = 6;
        int[] nums = {0, 2, 4, 6, 8};
        boolean targetFound = false;

        for (int x = 0; x < nums.length; x++) {
            if (nums[x] == target) {
                targetFound = true;
                System.out.println(targetFound);
                break;
            }
            System.out.println(targetFound);
        }

        int[] numbers = {0, 0, 0, 1, 0};
        boolean allSame = true;
        for (int y = 1; y < numbers.length; y++) {
            if (numbers[0] != numbers[y]) {
                allSame = false;
                break;  
            }
                     
        }
        System.out.println(allSame);

        String[] names = {"George", "Jill", "Xinyi", "Ravi"};
        for (String name : names) {
            System.out.println(name);            
        }
    }
}
