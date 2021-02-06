package com.test;

import java.util.*;

public class TreeSet2 {
	public static void main(String args[]){
	TreeSet set1 = new TreeSet();
	set1.add("2");
	set1.add(1);
	set1.add("test");
	set1.add("one");
	Iterator itr=set1.iterator();
	while(itr.hasNext())
		itr.next();
		System.out.println(itr.next());
	
	

	}
	
}
