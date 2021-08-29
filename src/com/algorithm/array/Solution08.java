package com.algorithm.array;

/**
 * @author gaozhe
 * @date 2021/8/29 8:54 下午
 */

/**
 * 给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。
 * <p>
 * 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "hello"
 * 输出："holle"
 * 。
 */
class Solution8 {
    public static String reverseVowels(String s) {
        char[] target = stringChangeToCharArray(s);
        int start = 0;
        int end = target.length - 1;
        while (start < end) {
            while (start < end && !isvowel(target[start])) {
                start++;
            }
            while (end > start && !isvowel(target[end])) {
                end--;
            }
            exchange(target, start, end);
            start++;
            end--;
        }
        return new String(target);
    }

    private static void exchange(char[] target, int start, int end) {
        if (start >= end) {
            return;
        }
        char temp = target[start];
        target[start] = target[end];
        target[end] = temp;
    }

    private static boolean isvowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            return true;
        else
            return false;
    }

    private static char[] stringChangeToCharArray(String s) {
        return s.toCharArray();
    }
}
