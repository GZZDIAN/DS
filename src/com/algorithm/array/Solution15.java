package com.algorithm.array;

import java.util.Arrays;


/**
 * 荷兰国旗问题2: 要求输入一个数，将array将小于这个数的放在左边 大于这个数的放在右边
 * 
 * 
 */

public class Solution15 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,4,5,1,2,8,9};
        partition(nums, 5, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void partition(int[] nums, int p, int left, int right) {
        int l = left - 1;
        int r = right;
        int cur = 0;

        while (cur < r) {
            while (cur < r && nums[cur] == p) {
                cur++;
            }

            while (cur < r && nums[cur] < p) {
                swap(nums, ++l, cur++);
            }

            while (cur < r && nums[cur] > p) {
                swap(nums, r--, cur++);
            }
        }
    }



    public static void swap(int[] nums,int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
