package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

 class dddd {
	
	void meth() throws FileNotFoundException {
		FileInputStream fs = new FileInputStream("super.txt");
	}

}

public class ExceptionHandling4 extends dddd{
	
	void meth() throws  IOException{
		FileInputStream fi = new FileInputStream("sub.txt");
	
	}
}