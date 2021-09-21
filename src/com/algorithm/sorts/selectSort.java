package com.algorithm.sorts;

import java.util.Arrays;
/*
* 选择排序(Selection sort)是一种简单直观的排序算法。
它的基本思想是：首先在未排序的数列中找到最小(or最大)元素，
然后将其存放到数列的起始位置；接着，再从剩余未排序的元素中继续寻找最小(or最大)元素，
然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。



    选择排序时间复杂度
选择排序的时间复杂度是O(N2)。
假设被排序的数列中有N个数。遍历一趟的时间复杂度是O(N)，需要遍历多少次呢？N-1！因此，选择排序的时间复杂度是O(N2)。

    选择排序稳定性
选择排序是稳定的算法，它满足稳定算法的定义。
算法稳定性 -- 假设在数列中存在a[i]=a[j]，若在排序之前，a[i]在a[j]前面；并且排序之后，a[i]仍然在a[j]前面。则这个排序算法是稳定的！
* */


public class selectSort {
    public static void main(String[] args) {
        int[] arr = { 20, 40, 30, 10, 60, 50 };
        SelectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void SelectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
    }
}
