package com.algorithm.array;

/**
 * 合并有序数组
 * 将两个有序数组合并成一个
 * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 输出：nums = [1,2,2,3,5,6]
 * 解释：需要合并 [1,2,3] 和 [2,5,6] 。
 * <p>
 * 双指针 ：
 * p指针：nums1
 * p1指针：nums_copy
 * p2指针：nums2
 * 思路：复制一份nums1为nums1_copy
 * 将nums1_copy和nums2从头开始分别进行比较，将小的放在nums1的p指针的位置上，再依次遍历
 */
public class Solution05 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1_copy = new int[m];
        System.arraycopy(nums1, 0, nums1_copy, 0, m);

        int p1 = 0;
        int p2 = 0;
        int p = 0;

        while ((p1 < m) && (p2 < n)) {
            nums1[p++] = (nums1_copy[p1] < nums2[p2]) ? nums1_copy[p1++] : nums1[p2++];
        }

        //将未排序完的nums_copy 扩容到nums1
        if (p1 < m) {
            System.arraycopy(nums1_copy, p1, nums1, p1 + p2, m + n - p1 - p2);
        }

        //将未排序完的nums2 扩容到nums1
        if (p2 < n) {
            System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2);
        }

    }

}
