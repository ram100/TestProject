package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

 class eeee {
	
	void meth() throws FileNotFoundException {
		FileInputStream fs = new FileInputStream("super.txt");
	}

}

public class ExceptionHandling5 extends eeee{
	
	void meth() throws  SQLException{
		FileInputStream fi = new FileInputStream("sub.txt");
	
	}
}