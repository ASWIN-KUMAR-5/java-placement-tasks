package numbers;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum=0,rem;
		int temp=n,num=n;
		int count=0;
		
		//count digits
		while(temp>0) {
			count++;
			temp/=10;
		}
		
		while(n>0) {
			rem=n%10;
			sum=sum+(int)Math.pow(rem, count);
			n/=10;
		}
		
		if(num==sum) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not an Armstrong Number");
		}
		
		sc.close();
	}

}
