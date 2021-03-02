package my.algorithm.leetcode;

// https://leetcode.com/problems/add-two-numbers/
 public class AddTwoNumber {
	 class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	 
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode input1 = l1;
        ListNode input2 = l2;
        ListNode output = new ListNode(0);
        ListNode curr = output;
        
        int carry = 0;
        
        while (input1 != null || input2 != null) {
            int input1Value = input1 != null ? input1.val : 0;
            int input2Value = input2 != null ? input2.val : 0;
            
            int sum = carry + input1Value + input2Value;

            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            
            if (input1 != null) input1 = input1.next;
            if (input2 != null) input2 = input2.next;
        }
        
        if (carry > 0) curr.next = new ListNode(carry);
        
        return output.next;   
     }
}