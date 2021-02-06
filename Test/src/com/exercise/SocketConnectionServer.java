package com.exercise;
import java.io.*;
import java.net.*;

public class SocketConnectionServer {
	public static void main(String args[]){
		try{
			System.out.println("entering inside server try block");
			ServerSocket ss = new ServerSocket(6666);
			Socket st=ss.accept();
			InputStream istr=st.getInputStream();
			DataInputStream dstr= new DataInputStream(istr);
			String str=dstr.readUTF();
			System.out.println("reading the client message in server");
			System.out.println("the value of stream"+str);
		}
		catch(Exception e){
			
		}
	}

}
