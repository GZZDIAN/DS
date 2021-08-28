package com.algorithm.array;

/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 最多出现两次 ，返回删除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 * 输入：nums = [0,0,1,1,1,1,2,3,3]
 * 输出：7, nums = [0,0,1,1,2,3,3]
 * 解释：函数应返回新长度 length = 7, 并且原数组的前五个元素被修改为 0, 0, 1, 1, 2, 3, 3 。 不需要考虑数组中超出新长度后面的元素。
 *
 *
 *
 * */
public class Solution03 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3};
        removeDuplicates(nums);
    }
    public static int removeDuplicates(int[] nums) {
        return process(nums, 2);
    }
    static int process(int[] nums, int k) {
        int u = 0;
        for (int x : nums) {
            // 为什么是u-k：因为要得到的数组前面有两个相同的
            if (u < k || nums[u - k] != x)
                nums[u++] = x;
        }
        return u;
    }


}
