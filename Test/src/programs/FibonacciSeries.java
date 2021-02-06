package programs;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String args[]){
		int maxNo=10;
		int prevNo=0;
		int nextNo=1;
//		Scanner scanner = new Scanner(System.in);
//        int maxNo = scanner.nextInt();
		
		for (int i=0;i<maxNo;i++){
			System.out.println("the value of prev no"+prevNo);
			int sum = prevNo+nextNo;
			prevNo=nextNo;
			nextNo=sum;
		}
		
	}

}
