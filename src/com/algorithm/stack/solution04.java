package com.algorithm.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 栈的压入、弹出序列
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如，序列 {1,2,3,4,5} 是某栈的压栈序列，序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
 * 输出：true
 * 解释：我们可以按以下顺序执行：
 * push(1), push(2), push(3), push(4), pop() -> 4,
 * push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * 输入：pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
 * 输出：false
 * 解释：1 不能在 2 之前弹出。
 *
 *     思路：
 *          每次遍历都要把pushed数组压入栈中，如果栈顶元素等于了下标为k的poped数组的数
 *          就将栈顶元素pop出去，k++，如果遍历完了，栈中没有元素了：返回true
 *
 */
public class solution04 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int k = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int p : pushed) {
            stack.push(p);
            while (!stack.isEmpty() && popped[k] == stack.peek()) {
                stack.pop();
                k++;
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
















