import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int d=0,sum=0,rem;
		int n=num;
		while(n!=0)
		{
			d++;
			n=n/10;
		}
		n=num;
		while(n!=0)
		{
			rem=n%10;
			sum+=Math.pow(rem,d);
			n=n/10;
		}
		if(sum==num)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");

	}

}
