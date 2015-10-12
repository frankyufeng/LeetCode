package com.yfeng.more.money.easy;

import com.yfeng.more.money.common.ListNode;

/**
 * 
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 */

public class RemoveDuplicatesFromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode cur = head.next;
        ListNode pre = head;
        while(cur != null){
        	if(cur.val == pre.val){
        		pre.next = cur.next;
        		cur = cur.next;
        	}
        	else{
        		pre = cur;
        		cur = cur.next;
        	}
        }
        return head;
    }
}
