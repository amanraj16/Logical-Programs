import java.util.Scanner;
public class Duplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String w="";
		int sp=0;
		str=str.trim();
		int len=str.length();
		char ch;
		int i,count=0,j;
		String[] words=str.split(" ");
		for(i=0;i<words.length;i++)
		{
			if(words[i]!=null)
			{
			for(j=i+1;j<words.length;j++)
			{
				
				if(words[i].equals(words[j]))
				{
					words[j]=null;
				}
			}
		}
		}
		for(i=0;i<words.length;i++)
		{
			if(words[i]!=null)
			{
			System.out.print(words[i]+" ");
		}
		}

	}

}
