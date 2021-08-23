package com.algorithm.array;

public class Solution01 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int len = removeElement(nums, 3);
        System.out.println(len);
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == val)
                count++;
            else {
                nums[i - count] = nums[i];
            }
        }
        return len - count;
    }
}
