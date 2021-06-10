package com.rishi.easy;


public class Problem876 {
	
   public ListNode middleNode(ListNode head) {
       
	   ListNode slow;
	   ListNode fast;
	   
	   slow = head;
	   fast = head;
	   
	   while(fast !=null && fast.next!=null) {
		   slow = slow.next;
		   fast = fast.next.next;
	   }
	   
	   return slow;
    }
	

	public static void main(String[] args) {
		Problem876 p876 = new Problem876();
		ListNode ls = new ListNode(1);
		ListNode ls1 = new ListNode(2);
		ListNode ls2 = new ListNode(3);
		ListNode ls3 = new ListNode(4);
		ls.next = ls1;
		ls1.next = ls2;
		ls2.next = ls3;
		ListNode middleNode = p876.middleNode(ls);
		System.out.println(middleNode.val);
	}

}
