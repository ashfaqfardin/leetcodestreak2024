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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead = new ListNode(0);
        ListNode curr = newHead;

        while (list1 != null && list2 != null){
            if(list1.val < list2.val){
                curr.next = list1;
                list1 = list1.next;
            }
            else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if(list1 == null){
            curr.next = list2;
        }
        if(list2 == null){
            curr.next = list1;
        }

        return newHead.next;
    }
}

/*
 * Problem Name: 21. Merge Two Sorted Lists
 * Problem Link: https://leetcode.com/problems/merge-two-sorted-lists/description/
 * 
 * INPUT: list1 = [1,2,4], list2 = [1,3,4]
 * OUTPUT: [1,1,2,3,4,4]
 * 
 * Time Complexity: O(n + m)
 * Space Complexity: O(1)
 * 
*/