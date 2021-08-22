package q169_多数元素.s1_哈希表;

import java.util.HashMap;

public class Solution {

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Integer integer : map.keySet()) {
            if (map.get(integer) > nums.length / 2) {
                return integer;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int element = majorityElement(nums);
        System.out.println(element);
    }
}
