package programs;

import java.util.Arrays;

public class DynamicArray {
	    int [] numbers = {10,20,30};
	    public int [] items;
	    private int count;
	    public  void print(){
		for(int i=0; i<numbers.length;i++){
			System.out.println("the value of array"+numbers[i]);
		}
		System.out.println("the value of array using Array.tostring"+Arrays.toString(numbers));
	    }
	    
	    public void insert(int item){
	    	items[count++]=item;
	    	System.out.println("Inside the insert method"+Arrays.toString(items));
	    	
	    }
	    
		public static void main(String args[]){
			DynamicArray dynArray = new DynamicArray();
			dynArray.print();
			dynArray.insert(200);
			dynArray.insert(300);
			
		}
					 
		}
		
	
