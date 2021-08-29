package com.algorithm.array;

/**
 * @author gaozhe
 * @date 2021/8/29 8:09 下午
 */

/**
 * 给定一个已按照 升序排列 的整数数组numbers ，请你从数组中找出两个数满足相加之和等于目标数target 。
 *
 * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
 *
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 *
 *
 * 示例 1：
 *
 * 输入：numbers = [2,7,11,15], target = 9
 * 输出：[1,2]
 * 解释：2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 *
 *
 * */
public class Solution06 {
    public int[] twoSum(int[] numbers, int target) {
        int[] nums = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (left >= 0 && right <= numbers.length - 1) {
            if (numbers[left] + numbers[right] == target) {
                nums[0] = left + 1;
                nums[1] = right + 1;
                break;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return nums;
    }
}
