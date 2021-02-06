package programs;

public class BinarySearch {
	
	public static void  meth(int arr[],int first,int last,int key){
		int mid = (first+last)/2;
		
		while (first <= last){
		if (arr[mid]<key){
			 first=mid+1;
		}	
		else if (arr[mid]==key){
				System.out.println("the index of key is "+mid);
				break;
		}
				else{
					last =mid-1;
					
				}
		mid = (first + last)/2;  
		}
		
		if (first>last){
			System.out.println("the index not found");
		}
		
	}
	
	public static void main(String args[]){
		int arr[]={10,20,30,40,50,60};
		int first=100;
		int last=arr.length-1;
		int key=20;
		BinarySearch binarySearch = new BinarySearch();
		binarySearch.meth(arr,first,last,key);
		
	}

}
