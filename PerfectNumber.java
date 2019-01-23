import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int mid=num/2;
		int sum=0;
		for(int i=1;i<=mid;i++)
		{
			if(num%i==0)
				sum+=i;
		}
		if(num==sum)
			System.out.println("It is a Perfect Number");
		else
			System.out.println("It is not a Perfect Number");

	}

}
