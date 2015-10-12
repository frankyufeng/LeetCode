package com.yfeng.more.money.easy;

import com.yfeng.more.money.common.ListNode;

/**
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 *
 */

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) throw new IllegalArgumentException();
        // One thing to discuss here is whether we should return the non-null list directly, or do a deep copy so that the returned list is separate from the inputs
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        ListNode head = new ListNode(0);
        int carry = 0;
        
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode curResult = head;
        
        while(cur1 != null && cur2 != null){
        	int sum = cur1.val + cur2.val + carry;
        	carry = sum / 10;
        	sum = sum % 10;
        	
        	curResult.next = new ListNode(sum);
        	curResult = curResult.next;
        	
        	cur1 = cur1.next;
        	cur2 = cur2.next;
        }
        
        //Remove the duplicates
        while(cur1 != null){
        	int sum = cur1.val + carry;
        	carry = sum / 10;
        	sum = sum % 10;
        	curResult.next = new ListNode(sum);
        	curResult = curResult.next;
        	cur1 = cur1.next;
        }
        
        while(cur2 != null){
        	int sum = cur2.val + carry;
        	carry = sum / 10;
        	sum = sum % 10;
        	curResult.next = new ListNode(sum);
        	curResult = curResult.next;
        	cur2 = cur2.next;
        }
        
        //Carry can be non-zero at this point
        if(carry > 0){
        	curResult.next = new ListNode(carry);
        }
        
        return head.next;
    }
}
