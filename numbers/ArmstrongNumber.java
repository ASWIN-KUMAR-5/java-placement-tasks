package basics;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=343,sum=0,rem,num=n;
		
		while(n>0) {
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n/=10;
		}
		
		if(num==sum) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not an Armstrong Number");
		}
	}

}
