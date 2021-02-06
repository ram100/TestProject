package com.exercise;
import java.io.*;
import java.net.*;

public class SocketConnectionClient {
	public static void main(String args[]){
		try{
			Socket ss = new Socket("localhost",6666);
			DataOutputStream dstr= new DataOutputStream(ss.getOutputStream());
			dstr.writeUTF("hello server from client");
			System.out.println("inside client try block writing hello");
			dstr.flush();
			dstr.close();
			ss.close();
		}
		catch(Exception e){
			System.out.println("inside the catch"+e);
		}
	}

}
