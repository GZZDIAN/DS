package com.algorithm.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "()"
 * 输出：true
 * 示例2：
 * <p>
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例3：
 * <p>
 * 输入：s = "(]"
 * 输出：false
 * 示例4：
 * <p>
 * 输入：s = "([)]"
 * 输出：false
 * 示例5：
 * <p>
 * 输入：s = "{[]}"
 * 输出：true
 * <p>
 * <p>
 * 我们遍历字符串中的所有字符
 * <p>
 * 1，如果遇到了左括号，就把对应的右括号压栈（比如遇到了字符'('，就把字符')'压栈）。
 * 2，如果遇到了右括号
 * 1）查看栈是否为空，如果为空，说明不能构成有效的括号，直接返回false。
 * 2）如果栈不为空，栈顶元素出栈，然后判断出栈的这个元素是否等于这个右括号，如果不等于，说明不匹配，直接返回false。如果匹配，就继续判断字符串的下一个字符。
 * 3，最后如果栈为空，说明是完全匹配，是有效的括号，否则如果栈不为空，说明不完全匹配，不是有效的括号。
 */
public class solution02 {

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] chars = s.toCharArray();
        //遍历所有的元素
        for (char c : chars) {
            //如果是左括号，就把他们对应的右括号压栈
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                //否则就只能是右括号。
                //1，如果栈为空，说明括号无法匹配。
                //2，如果栈不为空，栈顶元素就要出栈，和这个右括号比较。
                //如果栈顶元素不等于这个右括号，说明无法匹配，
                //直接返回false。
                return false;
            }
        }
        //最后如果栈为空，说明完全匹配，是有效的括号。
        //否则不完全匹配，就不是有效的括号
        return stack.isEmpty();
    }

}
