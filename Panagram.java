import java.util.Arrays;
import java.util.Scanner;
public class Panagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int j;char c;
		str=str.trim();
		str=str.toLowerCase();
		int len=str.length();
		int sp=0,count=0;
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
				sp++;
		}
		char[] arstr=str.toCharArray();
		Arrays.sort(arstr);
		for(c='a';c<='z';c++)
		{
		for(j=sp;j<len;j++)
			{
			if(c==arstr[j])
				{count++;
			break;}
			}
	}
		if(count==26)
			System.out.println("It is a Panagram String");
		else
			System.out.println("Not a Panagram String");
}
}
