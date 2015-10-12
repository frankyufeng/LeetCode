package com.yfeng.more.money.easy;

import java.util.Stack;

import com.yfeng.more.money.common.ListNode;

/**
 * 
 * Given a singly linked list, determine if it is a palindrome.
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 *
 */

public class PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        Stack<Integer> stack = new Stack<Integer>();
        
        ListNode cur = head;
        while(cur != null){
        	stack.push(cur.val);
        	cur = cur.next;
        }
        
        cur = head;
        while(cur != null){
        	if(cur.val != stack.pop()) return false;
        	cur= cur.next;
        }
        
        return true;
    }
}
