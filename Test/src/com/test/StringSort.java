package com.test;

  class StringSort {
	  static String  temp;
	public static void main(String args[])
		{
			for (int i=0;i<args.length-1;i++){
				for (int j=i+1;j<args.length;j++){
					if (temp=args[i].compareTo(args[j]>0)){
						temp=args[i];
						args[i]=args[j];
						args[j]=temp;
					
						
					}
				}
		}
			for (int i=0;i<args.length;i++){
				System.out.println(args[i]);
			}
	
	}
  }
  

