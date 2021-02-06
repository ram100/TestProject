

package com.test;
import package com.test1;
import java.lang.*;

abstract class AAA {
	abstract final void meth1();
	}
abstract class BBB extends AAA{
	abstract void meth2();
	}
public class ABSTRACT extends BBB{
	public static void main(String args[]){
		System.out.println("abstract class testing");
	}
	
	

}
