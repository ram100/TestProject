package programs;

public class AscendingOrder {
	public void meth(){
		int arr[] ={8,5,3,9,4};
		int temp;
		for (int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if (arr[i]>arr[j]){
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				}
				
			}
		}
		System.out.println("the value of array in ascending order");
		for (int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
		
	}
	public static void main(String args[]){
		AscendingOrder ascn = new AscendingOrder();		
		ascn.meth();
		
	}

}
