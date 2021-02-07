package com.test;

import java.util.*;

public class TreeSet1 {
	public static void main(String args[]){
	TreeSet set1 = new TreeSet();
	set1.add("one");
	set1.add("two");
	set1.add("testing");
	set1.add("one");
	Iterator itr=set1.iterator();
	while(itr.hasNext()){
		itr.next();
		System.out.println("the value of itr:"+itr.next());
	}
	

	}
	
}
