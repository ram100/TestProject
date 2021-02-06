package programs;

public class JavaPatternTriangle {
	
	public static void main(String args[]){
		int n=7;
		 System.out.println();  
		for (int i=1;i<=n;i++){
			for(int j=n; j>i;j--){
				System.out.print("#" +"");
			}
				//System.out.print(" "+(char)(65 + i));  
				for(int k=0;k<(2*i-1);k++){
					System.out.print("*");
				}
			
			System.out.println();
		}
		
		
		
		
		
	}

}
