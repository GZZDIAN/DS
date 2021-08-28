package com.algorithm.sorts.offer;

import java.util.Arrays;

public class Solution1 {

    /**
     * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
     * <p>
     * 示例 1:
     * 输入: [10,2]
     * 输出: "102"
     */

    public static void main(String[] args) {
        int[] arr = {5, 56, 8, 0};
        String s = minNumber(arr);
        System.out.println(s);
    }

    public static String minNumber(int[] nums) {
        bubbleSort(nums);
        return Arrays.toString(nums).replaceAll("\\[|]|,|\\s", "");
    }


    public static void bubbleSort(int[] arr) {
        boolean swapped = true;
        // 最后一个没有经过排序的元素的下标
        int indexOfLastUnsortedElement = arr.length - 1;
        // 上次发生交换的位置:因为交换了之后会改变之前的大小判断，需要重新判断到交换值的位置
        int swappedIndex = -1;
        int temp;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < indexOfLastUnsortedElement; i++) {
                if (("" + arr[i] + arr[i + 1]).compareTo("" + arr[i + 1] + arr[i]) > 0) {
                    // 如果 "" + arr[i] + arr[i + 1] 组成的字符串大于 "" + arr[i + 1] + arr[i] 组成的字符串，则交换
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    // 表示发生了交换
                    swapped = true;
                    // 更新交换的位置
                    swappedIndex = i;
                }
            }
            // 最后一个没有经过排序的元素的下标就是最后一次发生交换的位置
            indexOfLastUnsortedElement = swappedIndex;
        }


    }


}
