package programs;

public class PrimeNumber {	
	
	static void checkPrime(int n){		
		int i,m=0,flag=0;
		m=n/2;
		if(n==0 || n==1){
			System.out.println("this is not a prime no");
		}
		else{
			for(i=2;i<m;i++){
				if(n%i==0){
					System.out.println("this is not a prime no");
					flag=1;
					break;
				}
			}
			if (flag==0){
				System.out.println("this is  a prime no");
			}
		}
		
		
	}

	public static void main(String args[]){		
		PrimeNumber prime = new PrimeNumber();
		prime.checkPrime(5);				
		//prime.checkPrime(5);
	}
	
}
