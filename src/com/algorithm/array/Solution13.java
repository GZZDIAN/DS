package com.algorithm.array;

/**
 * 反转字符串
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * <p>
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * <p>
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 */
public class Solution13 {
    public void reverseString(char[] nums) {
        if (nums.length <= 1)
            return;

        int herd = 0;
        int tail = nums.length - 1;
        while (herd < tail) {
            //获取尾部下标数据
            char str = nums[tail];
            //尾部数据 = 头步数据
            nums[tail] = nums[herd];
            //头部数据 = 尾部数据
            nums[herd] = str;
            herd++;
            tail--;
        }
    }

}
