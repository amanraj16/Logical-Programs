import java.util.Arrays;
import java.util.Scanner;
public class Median {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of first array");
		int size1=sc.nextInt();
		int ar1[]=new int[size1];
		int median;
		System.out.println("Enter size of second array");
		int size2=sc.nextInt();
		int ar2[]=new int[size2];
		System.out.println("Enter "+size1+" numbers in first array");
		for(int i=0;i<size1;i++)
			ar1[i]=sc.nextInt();
		System.out.println("Enter "+size2+" numbers in second array");
		for(int j=0;j<size2;j++)
			ar2[j]=sc.nextInt();
		int size=size1+size2;
		int ar[]=new int[size];
		for(int i=0;i<size1;i++)
			ar[i]=ar1[i];
		for(int j=0;j<size2;j++)
			ar[j+size1]=ar2[j];
		Arrays.sort(ar);
		System.out.println("Median is "+ar[size/2]);
		

	}

}
