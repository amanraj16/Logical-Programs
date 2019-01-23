import java.util.Scanner;
public class NumerologyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		int sum=0,sum1=0;
		str=str.trim();
		str=str.toUpperCase();
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(ch=='A'||ch=='I'||ch=='J'||ch=='Q'||ch=='Y')
				sum=sum+1;
			else if(ch=='B'||ch=='K'||ch=='R')
				sum=sum+2;
			else if(ch=='C'||ch=='G'||ch=='L'||ch=='S')
				sum=sum+3;
			else if(ch=='D'||ch=='M'||ch=='T')
				sum=sum+4;
			else if(ch=='E'||ch=='H'||ch=='N'||ch=='X')
				sum=sum+5;
			else if(ch=='U'||ch=='V'||ch=='W')
				sum=sum+6;
			else if(ch=='O'||ch=='Z')
				sum=sum+7;
			else if(ch=='F'||ch=='P')
				sum=sum+8;
		}
		if(sum>=10)
		{
		while(sum!=0)
		{
			int rem=sum%10;
			sum1+=rem;
			sum=sum/10;
		}
		System.out.println(sum1);
		}

	}

}
