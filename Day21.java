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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;

        ListNode slow = newHead;
        ListNode fast = newHead;

        for(int i = 0; i < n; i++){
            fast = fast.next;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return newHead.next;
    }
}

/*
 * Problem Name: 19. Remove Nth Node From End of List
 * Problem Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
 * 
 * INPUT: head = [1,2,3,4,5], n = 2
 * OUTPUT: [1,2,3,5]
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
*/