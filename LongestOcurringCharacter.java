import java.util.Scanner;
public class LongestOcurringCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		int len=str.length();
		char[] st=str.toLowerCase().toCharArray();
		int ary[]=new int[26];
		for(int i=0;i<26;i++)
			ary[i]=0;
		for(int i=0; i<len; i++)
		{
			int d=((int)st[i])-97;
			ary[d]++;
		}
		int max=ary[0],j=0;
		for(int i=0; i<26; i++)
		{
			if(max<ary[i])
			{
				max=ary[i];
				j=i;
			}
		}
		int index=0;
		
		char alpha=(char)(j+97);
		for(int i=0; i<len; i++)
		{
			if(st[i]==alpha)
			{
				index=i;
				break;
			}
		}
		System.out.println("Longest occuring character is "+alpha+" and length is "+max+" at index "+index);
	}
}
