import java.util.Scanner;
public class PanagramDetector {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String sentence=sc.nextLine();
		String given="abcdefghijklmnopqrstuvwxyz";
		sentence=sentence.replaceAll("\\s","");
		sentence=sentence.toLowerCase();
		panagramDetector(sentence,given);
	}
	private static void panagramDetector(String input,String give)
	{
		int len=input.length();
		int count,ind=0,lenmiss;
		char[] miss=new char[26];
		for(int i=0;i<26;i++)
		{
			count=0;
			char ch1=give.charAt(i);
			for(int j=0;j<len;j++)
			{
				char ch2=input.charAt(j);
				if(ch1==ch2 && i!=j)
					{count=1;break;}
			}
			if(count==0)
			{
				miss[ind]=ch1;
				ind++;
			}
		}
		if(miss==null)
			System.out.println("It is a Panagram Sentence");
		else
		{
			System.out.print("Missing characters are--> ");
			System.out.println(miss);
		}
			
				

	}

}
