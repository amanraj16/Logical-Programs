import java.util.Scanner;
public class PascalTree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X and Y co-ordinate of Pascal Tree");
		int x=sc.nextInt();
		int y=sc.nextInt();
		String str;
		char chr[][]=new char[4][4];
		int k=0;
		for(int i=0;i<4;i++)
		{
			str=Integer.toString((int)Math.pow(11,i));
			for(int j=0;j<str.length();j++)
			{
				chr[k][j]=str.charAt(j);
			}
			k++;
		}
		if((x==1&&y==2)||(x==1&&y==3)||(x==1&&y==4)||(x==2&&y==3)||(x==2&&y==4)||(x==3&&y==4))
			System.out.println("Wrong co-ordinates entered. Please try again");
		else
			System.out.println("Element at "+x+","+y+" of Pascal Tree is "+chr[x-1][y-1]);

	}

}
