package com.rishi.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem234 {

	public static void main(String[] args) {
		ListNode ls1 = new ListNode(-129);
		ListNode ls2 = new ListNode(-129);
	//	ListNode ls3 = new ListNode(2);
	//	ListNode ls4 = new ListNode(1);
		ls1.next=ls2;
	//	ls2.next=ls3;
	//	ls3.next=ls4;
		List<Integer> list = new ArrayList<Integer>();
		while(ls1!=null) {
			System.out.println(ls1.val);
			list.add(ls1.val);
			ls1 = ls1.next;
		}
		int size = list.size();
		int flag =1;
		for(int i=0;i<list.size()/2;i++) {
			if(!list.get(i).equals(list.get(size-i-1))) {
				System.out.println("Not pali");
				flag =0;
				break;
			}
		}
		if(flag==1)
			System.out.println("Its a pali");
	}

}
