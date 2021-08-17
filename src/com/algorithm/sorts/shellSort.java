package com.algorithm.sorts;

import java.util.Arrays;

public class shellSort {
    public static void main(String[] args) {
        int[] arr = {5,2,3,1,8,7,6};
        ShellSort(arr);
    }

    /**
     *希尔排序(Shell Sort)是插入排序的一种，它是针对直接插入排序算法的改进。该方法又称缩小增量排序，因DL．Shell于1959年提出而得名。
     *
     *      希尔排序实质上是一种分组插入方法。
     * 它的基本思想是：对于n个待排序的数列，取一个小于n的整数gap(gap被称为步长)将待排序元素分成若干个组子序列，
     * 所有距离为gap的倍数的记录放在同一个组中；然后，对各组内的元素进行直接插入排序。
     * 这一趟排序完成之后，每一个组的元素都是有序的。然后减小gap的值，并重复执行上述的分组和排序。重复这样的操作，当gap=1时，整个数列就是有序的。
     *
     *
     *
     *
     *      希尔排序时间复杂度:
     * 希尔排序的时间复杂度与增量(即，步长gap)的选取有关。例如，当增量为1时，希尔排序退化成了直接插入排序，此时的时间复杂度为O(N²)，而Hibbard增量的希尔排序的时间复杂度为O(N3/2)。
     *
     *      希尔排序稳定性:
     * 希尔排序是不稳定的算法，它满足稳定算法的定义。对于相同的两个数，可能由于分在不同的组中而导致它们的顺序发生变化。
     * 算法稳定性 -- 假设在数列中存在a[i]=a[j]，若在排序之前，a[i]在a[j]前面；并且排序之后，a[i]仍然在a[j]前面。则这个排序算法是稳定的！
     */

    public static void ShellSort(int[] arr) {
        int j;
        int temp;
        int gap;  //gap表示步长
        for (gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                temp = arr[i];      //存储arr[gap]的值
                j = i;
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
