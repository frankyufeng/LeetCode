package com.yfeng.more.money.easy;

import com.yfeng.more.money.common.ListNode;

/**
 * Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.
 * @author yfeng
 *
 */

public class RemoveNthNodeFromEndOfList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        if(null == head || n <= 0) throw new IllegalArgumentException();
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode end = head;
        ListNode cur = head;
        for(int i = 0; i < n; i++) end = end.next;
        while(end != null){
        	end = end.next;
        	cur = cur.next;
        	pre = pre.next;
        }
        pre.next = cur.next;
        return dummyHead.next;
    }
}
