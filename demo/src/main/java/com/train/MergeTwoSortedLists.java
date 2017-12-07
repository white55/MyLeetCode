package com.train;

/**
 * Created by 张超 on 2017/11/29.
 */
//QUESTION:
//Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
    //合并两个排序列表并将其作为一个新列表返回，新的列表应该是由 前两个列表的节点拼接成的。
public class MergeTwoSortedLists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    //COPY
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }
}
