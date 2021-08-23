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
        int[] arr = {1,1,1,2,2,3};
        int i = removeDuplicates(arr);
        System.out.println(i);
    }

    //nums = [1,1,1,2,2,3]
    //输出：5, nums = [1,1,2,2,3]
    public static int removeDuplicates(int[] nums) {
        if (nums == null) {
            return -1;
        }
        if (nums.length == 1) {
            return nums.length;
        }
        int slow = 0;
        int fast = 1;
        //定义一个计数
        int count = 0;
        while (fast < nums.length) {
            if (count == 1 && nums[fast] == nums[slow]) {
                fast++;
                continue;
            } else if (nums[fast] != nums[slow]) {
                nums[++slow] = nums[fast];
                count = 0;
                fast++;
                continue;
            }
            if (nums[slow] == nums[fast]) {
                nums[++slow] = nums[fast];
                count++;
            }
            fast++;
        }
        return ++slow;
    }
}
