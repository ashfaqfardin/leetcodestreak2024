/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// this code will not run unless you change the classname to file name.
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

/*
 * Problem Name: 237. Delete Node in a Linked List
 * Problem Link: https://leetcode.com/problems/delete-node-in-a-linked-list/description/
 * 
 * INPUT: head = [4,5,1,9], node = 5
 * OUTPUT: [4,1,9]
 * EXPLANATION: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
 * 
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 * 
*/