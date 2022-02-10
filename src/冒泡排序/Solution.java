package 冒泡排序;

import java.util.Arrays;

public class Solution {

    public static void BubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 6, 2, 2, 5};
        Solution.BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
