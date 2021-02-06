package com.exercise;

public class BubbleSort {
	public static void main(String arg[]){
		int arr [] ={50,20,10,5,30};
		
		for (int i=0;i<arr.length;i++){
		//	System.out.println("the array i value"+arr[i]);
			for (int j=0;j<i;j++){
			//	System.out.println("the array j value"+arr[j]);
				if(arr[i]<arr[j]){
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					//System.out.println("after swap"+arr[i]);
					
				}		
			//	System.out.println("the array i value"+arr[i]);
			//	System.out.println("the array j value"+arr[j]);
			
		}
			
		}
		
		for (int i=0;i<arr.length;i++){
		System.out.println("the final value"+arr[i]);
		}
		
	}

}
