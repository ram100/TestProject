package com.test;

import java.util.*;

public class TreeSet1 {
	public static void main(String args[]){
		System.out.println("entering the main"));
	TreeSet set1 = new TreeSet();
	set1.add("one");
	set1.add("two");
	set1.add("testing");
	set1.add("one");
	Iterator itr=set1.iterator();
	while(itr.hasNext()){
		itr.next();
		System.out.println("entering the iterator:");
		System.out.println("the value of itr:"+itr.next());
		System.out.println("coming out of the iterator:");
	}
	

	}
	
}
