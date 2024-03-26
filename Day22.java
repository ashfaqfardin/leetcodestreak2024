/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// this code will not run unless you change the classname to file name.
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}

/*
 * Problem Name: 206. Reverse Linked List
 * Problem Link: https://leetcode.com/problems/reverse-linked-list/description/
 * 
 * INPUT: head = [1,2,3,4,5]
 * OUTPUT: [5,4,3,2,1]
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
*/