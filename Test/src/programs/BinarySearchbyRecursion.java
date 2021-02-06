package programs;

public class BinarySearchbyRecursion {
	
	public static int  meth(int arr[],int first,int last,int key){
		int mid = (first+last)/2;
		
		if (first <= last){
			if (arr[mid]==key){
				return mid;
			}			
			if (arr[mid]<key){
			 first=mid+1;
			 return meth(arr,first,last,key);
		}	
			else {
			 last=mid-1;
			 return meth(arr,first,last,key);
		}
				
		}
		return -1;
	}
	
	public static void main(String args[]){
		int arr[]={10,20,30,40,50,60};
		int first=0;
		int last=arr.length-1;
		int key=30;
		BinarySearchbyRecursion binarySearch = new BinarySearchbyRecursion();
		int result=binarySearch.meth(arr,first,last,key);
		System.out.println("the index of key is "+result);
		if (result ==-1){
			System.out.println("the index not found");
		}
		
		
	}

}
