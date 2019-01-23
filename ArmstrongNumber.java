
public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.print("Armstrong Numbers are--> ");
		for(int i=1;i<=1000;i++)
		{
			int num=i;
			int d=0,sum=0,rem,n=i;
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
				System.out.println(num+" ");
		}
}
}
