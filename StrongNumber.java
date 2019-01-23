import java.util.Scanner;
public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sum=0,rem,f=1;
		int n=num;
		while(n!=0)
		{
			rem=n%10;
			for(int i=1;i<=rem;i++)
				f=f*i;
			sum+=f;
			n=n/10;
			f=1;
		}
		if(sum==num)
			System.out.println("It is a Strong Number");
		else
			System.out.println("It is not a Strong Number");
	}

}
