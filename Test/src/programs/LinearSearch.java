package programs;

public class LinearSearch {
	public static int meth(int arr[],int key){
		for (int i=0;i<arr.length;i++){
			if(arr[i]==key){
				return i;
			}
			
		}
		return -1;
		
	}
	
	public static void main(String args[]){
		int arr[]={10,20,30,40,50,60};
		int key=50;
		LinearSearch linearSearch = new LinearSearch();
		
		System.out.println(key +"index found at :"+linearSearch.meth(arr,key));
	}

}
