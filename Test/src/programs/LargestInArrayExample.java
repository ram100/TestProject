package programs;

public class LargestInArrayExample {
	
	public static int getLargest(int arr[],int count){
		int temp;
		for (int i=0;i<count;i++){
			for(int j=i+1;j<count;j++){
				if (arr[i]> arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				System.out.println("the value of inner loop arr[j] value"+arr[j]);
				
			}
		//	System.out.println("the value of outer loop"+arr[i]);
			}
		
		return arr[count-1];
		
	}
	
	public static void main(String args[]){
		
		LargestInArrayExample largestNo = new LargestInArrayExample();
		int a[] ={8,6,3,4,9};
		int b[]={5,6,7,8,9,10,11,12};
		
		System.out.println("the largest no is:"+largestNo.getLargest(a,5));
	}
}
