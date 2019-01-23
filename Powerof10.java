import java.util.Scanner;
public class Powerof10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		while(true)
		{
			int rem=num%10;
			if(rem!=0)
				{System.out.println("False");
				break;}
			else	
			num=num/10;
			if(num==1)
				{System.out.println("True");
				break;}
				
			
		}
	}

}
