import java.util.Scanner;
public class SecondSmallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements to enter");
		int size=sc.nextInt();
		int ar[]=new int[size];
		int diff,min,i,j,pos=0,pos1=0,diff1;
		System.out.println("Enter "+size+" numbers");
		for(i=0;i<size;i++)
			ar[i]=sc.nextInt();
		min=ar[0];
		for(j=1;j<size;j++)
		{
			if(ar[j]<min)
			{
				min=ar[j];
				pos=j;
			}
		}
		if(pos!=0)
			diff=ar[0]-min;
		else
			diff=ar[1]-min;
		for(i=0;i<size;i++)
		{
			if(i!=pos)
			{
				diff1=ar[i]-min;
				if(diff1<=diff)
				{
					pos1=i;
				}
			}
		}
		System.out.println("Second smallest number is "+ar[pos1]);
		
		

	}

}
