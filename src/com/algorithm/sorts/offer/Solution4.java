package com.algorithm.sorts.offer;
/**
 *  对链表进行插入排序:
 *
 *  插入排序算法：
 *
 * 插入排序是迭代的，每次只移动一个元素，直到所有元素可以形成一个有序的输出列表。
 * 每次迭代中，插入排序只从输入数据中移除一个待排序的元素，找到它在序列中适当的位置，并将其插入。
 * 重复直到所有输入数据插入完为止。
 *
 *
 * 示例 1：
 *
 * 输入: 4->2->1->3
 * 输出: 1->2->3->4
 *
 * */
public class Solution4 {

    public ListNode insertionSortList(ListNode head) {
        if (head == null)
            return null;

        // 创建哑结点，用于将在 head 前插入结点转换为在哑结点后插入，统一处理，更方便
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        // 记录已排序完成的结点末尾
        ListNode lastSorted = head;
        // 当前需要新插入的结点
        ListNode current = head.next;

        while (current != null) {
            if (lastSorted.val <= current.val) {
                // 新插入的值正好是最大值，直接插入链表末尾
                lastSorted = lastSorted.next;
            } else {
                // 从头开始寻找插入位置
                ListNode previous = dummyHead;
                while (previous.next.val <= current.val) {
                    previous = previous.next;
                }
                // 将新结点插入链表
                lastSorted.next = current.next;
                current.next = previous.next;
                previous.next = current;
            }
            // 更新新结点
            current = lastSorted.next;
        }
        return dummyHead.next;
    }


}
