import java.util.Scanner;
public class NonRepeating {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		char ch1,ch2;
		int i,j,count=0;
		str=str.trim();
		str=str.replaceAll("\\s","");
		int len=str.length();
		int len2=len;
		for(j=0;j<len;j++)
		{
			count=0;
			ch1=str.charAt(j);
				for(i=0;i<len;i++)
				{
					ch2=str.charAt(i);
						if(ch1==ch2&& i!=j)
							{count=1;break;}
				}
				if(count==0)
				{
					System.out.println(ch1);
					System.exit(0);
				}
		}
	}


}
