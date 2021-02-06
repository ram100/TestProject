package programs;

public class ArmstrongNumber {
	public void meth(int n){	
		int a,sum=0;
		int temp=n;
		while (n > 0){
			a =n%10;
			System.out.println("the value of a"+a);
			a=n/10;
			System.out.println("the value of n"+n);
			sum =sum+(a*a*a);
			System.out.println("the value of sum"+sum);
		}
		
			if (temp==sum){
			System.out.println("this is armstrong number");
		}
		else{
			System.out.println("this is not a  armstrong number");
		}
		
	}
	public static void main(String args[]){
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		armstrongNumber.meth(153);
	}

}
