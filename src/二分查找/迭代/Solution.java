package 二分查找.迭代;

public class Solution {

    private int halfSearch(int[] a, int target) {
        int i = 0;
        int j = a.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            int midValue = a[mid];
            if (midValue > target) {
                j = mid - 1;
            } else if (midValue < target) {
                i = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
