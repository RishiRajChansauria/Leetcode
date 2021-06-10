package com.rishi.easy;

public class Problem237 {
	
    public void deleteNode(ListNode node) {
        
    	if(node==null || node.next==null) return;
    	
    	node.val=node.next.val;
    	node.next=node.next.next;
    
    }

	public static void main(String[] args) {
	
		Problem237 p237 = new Problem237();
		ListNode ls1 = new ListNode(1);
		ListNode ls2 = new ListNode(2);
		ListNode ls3 = new ListNode(3);
		ListNode ls4 = new ListNode(4);
		ListNode ls5 = new ListNode(5);
		ls1.next = ls2;
		ls2.next = ls3;
		ls3.next = ls4;
		ls4.next = ls5;
		
		p237.deleteNode(ls2);
	}

}
