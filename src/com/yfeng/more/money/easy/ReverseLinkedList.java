package com.yfeng.more.money.easy;

import com.yfeng.more.money.common.ListNode;

/**
 * 
 * Reverse a singly linked list.
 *
 */

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode pre = head;
        ListNode cur = head.next;
        
        while(cur != null){
        	ListNode temp = cur.next;
        	cur.next = pre;
        	pre = cur;
        	cur = temp;
        }
        
        head.next = null;
        return pre;
    }
}
