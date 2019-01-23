import java.util.Scanner;
public class PrimeFraction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int pro=1;
		int n=num;
		int c=0;
		if(num==1||num<=0)
			System.out.print("No Prime Fraction ");
		else
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					c++;
			}
			if(c==2)
				System.out.println("Prime Fraction is 1 "+num);
			else
				System.out.print("Prime Fraction is ");
				for(int i=2;i<=n/2;i++)
				{
					while(num%i==0)
					{
						System.out.print(i+" ");
						num=num/i;
					}
				}
		}
	}
}

	


