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
class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode[] a = new ListNode[100];
        int cnt = 0;
        while (head != null) {
            a[cnt++] = head;
            head = head.next;
        }
        return a[cnt / 2];
    }
}