package com.algorithm.sorts.offer;

import java.util.Arrays;

public class Solution2 {
    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     *
     * 示例:
     * 输入: [0,1,0,3,12]
     * 输出: [1,3,12,0,0]
     *
     * 说明:
     * 必须在原数组上操作，不能拷贝额外的数组。
     * 尽量减少操作次数。
     */

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12,32,0,21,0,22};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int temp;
        boolean swapped;
        for (int i = 0; i < nums.length - 1; i++) {
            swapped = true;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if(nums[j] == 0){
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                    swapped = false;
                }
            }
            if(swapped)
                break;
        }
        System.out.println(Arrays.toString(nums));
    }
}


















