import java.util.Scanner;
public class PowerOf5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		while(true)
		{
			if(num%5!=0)
			{
				System.out.println("False");
				break;
			}
			num=num/5;
			if(num==1)
			{
				System.out.println("True");
				break;
			}
		}
		}

	}
