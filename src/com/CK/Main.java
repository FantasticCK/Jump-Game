package com.CK;

public class Main {

    public static void main(String[] args) {
        int[] nums = {9, 4, 2, 1, 0, 2, 0};
        new Solution().canJump(nums);
    }
}
class Solution {
    public boolean canJump(int[] nums) {
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;
    }
}