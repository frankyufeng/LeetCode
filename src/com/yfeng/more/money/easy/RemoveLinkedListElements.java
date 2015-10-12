package com.yfeng.more.money.easy;

import com.yfeng.more.money.common.ListNode;

/**
 * 
 * Remove all elements from a linked list of integers that have value val.
 * 
 * Example
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 *
 */

public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode dummyHead = new ListNode(val + 1);
        dummyHead.next = head;
        ListNode cur = dummyHead.next;
        ListNode pre = dummyHead;
        
        while(cur != null){
        	if(cur.val == val){
        		pre.next = cur.next;
        	}
        	else{
        		pre = cur;
        	}
        	cur = cur.next;
        }
        
        return dummyHead.next;
    }
}
