import java.util.Scanner;
public class MissingCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String inp=sc.nextLine();
		String given="abcdefghijklmnopqrstuvwxyz";
		inp=inp.replaceAll("\\s","");
		inp=inp.toLowerCase();
		missingCharacters(inp,given);
	}
	private static void missingCharacters(String input,String give)
	{
		int len=input.length();
		int count;
		System.out.print("Missing characters from string are--> ");
		for(int i=0;i<26;i++)
		{
			count=0;
			char ch1=give.charAt(i);
			for(int j=0;j<len;j++)
			{
				char ch2=input.charAt(j);
				if(ch1==ch2)
					count=1;
			}
			if(count==0)
				System.out.print(ch1+" ");
			}
		}
}
