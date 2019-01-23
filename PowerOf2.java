import java.util.Scanner;
public class PowerOf2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		while(true)
		{
			if(num%2!=0)
			{
				System.out.println("False");
				break;
			}
			num=num/2;
			if(num==1)
			{
				System.out.println("True");
				break;
			}
		}

	}

}
