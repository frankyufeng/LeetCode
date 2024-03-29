package com.yfeng.more.money.easy;

import com.yfeng.more.money.common.ListNode;

/**
 * 
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.
 *
 */

public class DeleteNodeInLinkedList {
	public void deleteNode(ListNode node) {
        if(node == null) return;
        if(node.next == null){
        	node = null;
        	return;
        }
        ListNode after = node.next;
        node.val = after.val;
        node.next = after.next;
    }
}
