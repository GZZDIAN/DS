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
        int[] arr = {20,40,30,10,60,50};
        SelectSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void SelectSort(int[] arr) {
        int i;     //有序区的末尾位置
        int j;     //无序区的起始位置
        int minPos;   //无序区中最小元素位置
        int temp;    //用来交换变量
        for (i = 0; i < arr.length; i++) {
            minPos = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }

            //若minPos!=i,则交换arr[i]和arr[minPos]
            //交换之后，保证了arr[0] ... arr[i]之间的元素是有序的
            if (minPos != i) {
                temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
            }
        }

    }
}
