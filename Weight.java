import java.util.Scanner;
public class Weight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch;
		int wt=0;
		int len=str.length();
		String str1=str;
		str1=str1.toUpperCase();
		for(int i=0;i<len;i++)
		{
			ch=str1.charAt(i);
			wt=wt+((int)ch-64);
		}
		System.out.println("The weight of string "+str+" is "+wt);
	}

}
