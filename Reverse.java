import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String rev="",state="";
		String str=sc.nextLine();
		int c=0,len=str.length();
		char arstr[]=str.toCharArray();
		char arfin[]=new char[len];
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
				arfin[i]=' ';
		}
		
		for(int i=len-1;i>=0;i--)
		{
			char ch=str.charAt(i);
			rev=rev+ch;
		}
		rev=rev.replaceAll("\\s","");
		int len2=rev.length();
		int j=0;
		for(int i=0;i<len;i++)
		{
			if(arfin[i]!=' ')
			{
				arfin[i]=rev.charAt(j);
				j++;
			}
		}
		for(int i=0;i<len;i++)
			System.out.print(arfin[i]);
		
			

	}

}
