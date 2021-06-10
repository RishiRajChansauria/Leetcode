package com.rishi.medium;

public class Problem2 {
	
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode l3,dummyHead;
		dummyHead = new ListNode(0);
		l3 = dummyHead;
		int carry =0;
		while(l1!=null && l2!=null){
			System.out.println(l1.val +"  " + "l1 it is");
			System.out.println(l2.val +"  " + "l2 it is");
			int digitValue = (l1.val + l2.val + carry)%10;
			carry = (l1.val + l2.val + carry)/10;
			l3.next = new ListNode(digitValue);
			l3 =l3.next;
			l2 = l2.next;
			l1 = l1.next;
		}
		
		while(l1!=null){
			int digitValue = (l1.val + carry)%10;
			carry = (l1.val + carry)/10;
			l3.next = new ListNode(digitValue);
			l3 =l3.next;
			l1 = l1.next;
		}
		
		while(l2!=null){
			int digitValue = (l2.val + carry)%10;
			carry = (l2.val + carry)/10;
			l3.next = new ListNode(digitValue);
			l3 =l3.next;
			l2 = l2.next;
		}
		
		if(carry > 0){
			l3.next = new ListNode(carry);
			l3 =l3.next;
			carry=0;
		}
		
		return dummyHead.next;
	 }

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode x = new ListNode(4);
		ListNode y = new ListNode(3);
		l1.setNext(x);
		x.setNext(y);
		
		ListNode l2 = new ListNode(5);
		ListNode a = new ListNode(6);
		ListNode b = new ListNode(4);
		l2.setNext(a);
		a.setNext(b);
		
		Problem2 p = new Problem2();
		ListNode addTwoNumbers = p.addTwoNumbers(l1, l2);
		
		while(addTwoNumbers!=null){
			System.out.println(addTwoNumbers.val);
			addTwoNumbers = addTwoNumbers.next;
		}
		
	}

}
/*	  123   456
l1 --> x -->y*/