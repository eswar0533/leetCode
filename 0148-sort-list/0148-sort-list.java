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
class Solution {
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> li= new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            li.add(temp.val);
            temp = temp.next;
        }
        temp = head;
        int i = 0;
        Collections.sort(li);
        while(temp != null){
            temp.val =  li.get(i++);
            temp = temp.next;
        }
        return head;
    }
}