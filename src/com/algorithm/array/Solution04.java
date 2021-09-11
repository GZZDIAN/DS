package com.algorithm.array;


/**
 * 颜色分类
 * 给定一个包含红色、白色和蓝色，一共n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * <p>
 * 此题中，我们使用整数 0、1 和 2 分别表示红色、白色和蓝色。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [2,0,2,1,1,0]
 * 输出：[0,0,1,1,2,2]
 */
public class Solution04 {
    /**
     * 思路将0、1、2分为不同的区间，将区间分为以下的情况：
     * 保证分的区间中不包含任何一个数也就是说一定要是一个空区间
     * 默认从索引0开始-->i = 0
     */
    //
    public void sortColors(int[] nums) {
        /**
         * [0,p0) --> 0
         * [p0,i) --> 1
         * (p2,length-1] -->2
         * */
        int p0 = 0;
        int p2 = nums.length - 1;
        int i = 0;
        //由于i不包括p2：(p2,length-1]
        while (i <= p2) {
            if (nums[i] == 2) {
                swap(nums, i, p2);
                p2--;
            } else if (nums[i] == 0) {
                //因为要满足区间，所以要交换
                swap(nums, i, p0);
                p0++;
                i++;
            } else {
                i++;
            }
        }
    }

    public void sortColors2(int[] nums) {
        /**
         * [0,p0] --> 0
         * (p0,i) --> 1
         * [p2,length-1] -->2
         * */
        int p0 = -1;
        int p2 = nums.length;
        int i = 0;
        while (i < p2) {
            if (nums[i] == 2) {
                swap(nums, i, --p2);
            } else if (nums[i] == 0) {
                swap(nums, i, ++p0);
                i++;
            } else {
                i++;
            }
        }
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
