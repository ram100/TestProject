package programs;

public class BubbleSort {
	public void meth(int[] arr){
		int temp =0;
	
		for(int i=0;i<arr.length;i++){
			for (int j=0;j<arr.length-1;j++){
			 if (arr[i]<arr[j]){
				 temp=arr[i];
			 	 arr[i]=arr[j];
				 arr[j]=temp;	 
				 
			 }
		}
	}
		for(int i=0;i<arr.length;i++){
			System.out.println("the value of array"+arr[i]);
		}
	}

	public static void main(String args[]){
		int arr[] ={100,30,20,50,40};
		BubbleSort bubblesort = new BubbleSort();
		bubblesort.meth(arr);
	}
}
