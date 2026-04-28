import java.util.*;

public class Sort {
    public static void main(String[] args) {
        int[] swapNumbers = {9, 3};
        
        SortingAlgorithms swap = new SortingAlgorithms(swapNumbers);

        System.out.println("Before swap: " + Arrays.toString(swapNumbers));
        swap.swapNumbers();
        System.out.println("After swap: " + Arrays.toString(swapNumbers));
    }

}

class SortingAlgorithms {
    private int[] list;

    public SortingAlgorithms(int[] newList) {
        this.list = newList;
    }
    
    public void swapNumbers() {
        int temp = list[0];
        list[0] = list[1];
        list[1] = temp;
    }

    private void swap(int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public void selectionSort() {
        for (int i = 0; i < list.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[minIndex]) {
                    minIndex = j;
                }
            }
            swap(i, minIndex);
        }
    }
}