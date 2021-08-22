package com.algorithm.sorts.offer;

/**
 * 给定整数数组 nums 和整数 k，请返回数组中第 k 个最大的元素。
 * <p>
 * 请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,2,1,5,6,4] 和 k = 2
 * 输出: 5
 */
public class Solution3 {
    public int findKthLargest(int[] nums, int k) {
        int temp;
        int maxIndex;
        // 执行 k 次选择
        for (int i = 0; i < k; i++) {
            maxIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[maxIndex] < nums[j]) {
                    // 记录最大值的下标
                    maxIndex = j;
                }
            }
            // 将最大元素交换至首位
            temp = nums[maxIndex];
            nums[maxIndex] = nums[i];
            nums[i] = temp;
        }
        return nums[k - 1];
    }
}














