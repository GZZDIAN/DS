package com.algorithm.array;

/**
 * @author gaozhe
 * @date 2021/8/29 9:03 下午
 */

/**
 * 2.使用队列相加（实际上我们也可以把它称作是滑动窗口，这里的队列其实就相当于一个窗口）
 * 我们把数组中的元素不停的入队，直到总和大于等于 s 为止，
 * 接着记录下队列中元素的个数，然后再不停的出队，直到队列中元素的和小于 s 为止（如果不小于 s，也要记录下队列中元素的个数，
 * 这个个数其实就是不小于 s 的连续子数组长度，我们要记录最小的即可）。
 *  * 接着再把数组中的元素添加到队列中……重复上面的操作，直到数组中的元素全部使用完为止。
 *
 * */
public class Solution09 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        minSubArrayLen(7, nums);
    }

    /**
     * 输入：target = 7, nums = [2,3,1,2,4,3]
     * 输出：2
     * 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
     */
    public static int minSubArrayLen(int s, int[] nums) {
        int lo = 0, hi = 0, sum = 0, min = Integer.MAX_VALUE;
        while (hi < nums.length) {
            sum += nums[hi++];
            //只要队列中的值>=s就记录一下
            while (sum >= s) {
                //hi - lo就是队列的长度
                min = Math.min(min, hi - lo);
                //lo++：因为队列是先入先出的
                sum -= nums[lo++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

}
