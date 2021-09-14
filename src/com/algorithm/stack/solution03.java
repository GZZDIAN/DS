package com.algorithm.stack;


import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 每日温度
 * 请根据每日 气温 列表 temperatures，请计算在每一天需要等几天才会有更高的温度。如果气温在这之后都不会升高，请在该位置用0 来代替。
 * <p>
 * 示例 1:
 * <p>
 * 输入: temperatures = [73,74,75,71,69,72,76,73]
 * 输出:[1,1,4,2,1,1,0,0]
 * 示例 2:
 * <p>
 * 输入: temperatures = [30,40,50,60]
 * 输出:[1,1,1,0]
 * 示例 3:
 * <p>
 * 输入: temperatures = [30,60,90]
 * 输出: [1,1,0]
 *
 * 思路：
 *      遍历每个温度将其下标依次push进去，分为两种情况：
 *          1）栈为空，直接push进
 *          2）栈不为空，判断栈顶元素所在的数组中的数是否小于当前遍历的数，
 *              如果小于，则将当前遍历下标 - 栈顶元素赋值到新数组中
 *              如果大于，则就push进去
 */
public class solution03 {

    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] temp = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                temp[stack.peek()] = i - stack.poll();
            }
            stack.push(i);
        }
        return temp;
    }
}












