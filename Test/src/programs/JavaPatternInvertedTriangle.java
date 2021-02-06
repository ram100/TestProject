package programs;

public class JavaPatternInvertedTriangle {
	
	public static void main(String args[]){
		int n=7;
	//	 System.out.println();  
		for (int i=0;i<n;i++){
			for(int k=0;k>i;k++){
				System.out.print(" ");
		}
			for(int j=n;j>i;j--){
				System.out.print("*");
			}
				//System.out.print(" "+(char)(65 + i));  
				
			
			System.out.println();
		}	
		
		
	}

}
