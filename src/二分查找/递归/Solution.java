package 二分查找.递归;

public class Solution {

    private int halfSearch(int[] a, int left, int right, int target) {
        int mid = (left + right) / 2;
        int midValue = a[mid];
        if (left < right) {
            if (midValue > target) {
                return halfSearch(a, left, mid - 1, target);
            } else if (midValue < target) {
                return halfSearch(a, mid + 1, right, target);
            } else {
                return mid;
            }
        }
        return -1;
    }
}
