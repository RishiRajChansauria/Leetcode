package com.rishi.easy;

import java.util.LinkedList;
import java.util.List;

public class Problem412 {

	 public List<String> fizzBuzz(int n) {
	  List<String> list = new LinkedList<String>();
	   for(int i=1;i<=n;i++) {
		   if(i%5 == 0 && i%3 == 0) list.add("FizzBuzz");
		   else if(i%3 == 0) list.add("Fizz");
		   else if(i%5 == 0) list.add("Buzz");
		   else {
			   list.add(Integer.toString(i));
		   }
	   }
		 
		 return list;
	 }
	
	public static void main(String[] args) {
		Problem412 p = new Problem412();
		List<String> fizzBuzz = p.fizzBuzz(15);
		for (String m : fizzBuzz) {
			System.out.println(m);
		}

	}

}
