package programs;

public class ReverseString {
	
	public static void main(String args[]){
		String str="hello world";
		String str1="";
		//for(int i=0;i<str.length();i++){
		for(int i=str.length()-1;i>=0 ;i--){
			str1=str1+str.charAt(i);
					
		}
		System.out.println("the reverse string value:"+str1);
		
	}

}
