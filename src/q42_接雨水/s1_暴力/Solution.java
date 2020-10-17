package q42_接雨水.s1_暴力;

public class Solution {

    public int trap(int[] height) {
        int res = 0;
        // 遍历每个柱子
        for (int i = 1; i < height.length; i++) {
            int leftMax = 0, rightMax = 0;
            // 计算当前柱子左侧的柱子中的最大高度
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }
            // 计算当前柱子右侧的柱子中的最大高度
            for (int j = i; j < height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }
            res += Math.min(leftMax, rightMax) - height[i];
        }
        return res;
    }


    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Solution solution = new Solution();
        int trap = solution.trap(height);
        System.out.println(trap);
    }
}
