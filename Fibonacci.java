import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0,b=1,c,num;
		System.out.println("Enter number of terms of Fibonacci Series to be displayed");
		num=sc.nextInt();
		if(num==1)
			System.out.print(a);
		else if(num==2)
			System.out.print(a+" "+b);
		else
		{
			System.out.print(a+" "+b+" ");
			for(int j=3;j<=num;j++)
			{
				c=a+b;
				a=b;
				b=c;
				System.out.print(c+" ");
			}
		}
		

	}

}
