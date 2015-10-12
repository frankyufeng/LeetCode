package com.yfeng.more.money.easy;

import com.yfeng.more.money.common.ListNode;

/**
 * 
 * Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 ¡ú a2
                   ¨K
                     c1 ¡ú c2 ¡ú c3
                   ¨J            
B:     b1 ¡ú b2 ¡ú b3
begin to intersect at node c1.


Notes:

If the two linked lists have no intersection at all, return null.
The linked lists must retain their original structure after the function returns.
You may assume there are no cycles anywhere in the entire linked structure.
Your code should preferably run in O(n) time and use only O(1) memory.
 * 
 * @author yfeng
 *
 */

public class IntersectionOfTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        int lengthA = getLinkedListLength(headA);
        int lengthB = getLinkedListLength(headB);
        ListNode curLong = lengthA > lengthB ? headA : headB;
        ListNode curShort = lengthA > lengthB ? headB : headA;
        int diff = Math.abs(lengthB - lengthA);
        int count = 0;
        while(count < diff){
        	curLong = curLong.next;
        	count++;
        }
        while(curLong != null){
        	if(curLong == curShort) return curLong;
        	curLong = curLong.next;
        	curShort = curShort.next;
        }
        return null;
    }
	
	private int getLinkedListLength(ListNode head){
		int length = 0;
		if(head == null) return length;
		ListNode cur = head;
		while(cur != null){
			length++;
			cur = cur.next;
		}
		return length;
	}
}
