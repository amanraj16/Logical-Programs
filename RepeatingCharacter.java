import java.util.Scanner;
public class RepeatingCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ar[]= {"array","apple","rat"};
		int len=ar.length;
		char arf[]=new char[3];
		int count=0;
		int ind=0,i;
		for(int k=0;k<len;k++)
		{
			String w="";
			w=ar[k];
			int lenw=w.length();
			for(int j=0;j<lenw;j++)
			{
				count=0;
				char ch1=w.charAt(j);
					for(i=0;i<lenw;i++)
					{
						char ch2=w.charAt(i);
							if(ch1==ch2&& i!=j)
								{count=1;break;}
					}
					if(count==0)
					{
						System.out.print(ch1+" ");
						break;
					}
			}
		}
		}
		
	}
