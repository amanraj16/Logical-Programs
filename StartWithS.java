import java.util.Scanner;
public class StartWithS {

	public static void main(String[] args) {
		String[] inp= {"apple","sample","search","cat"};
		char[] w;
		for(int i=0;i<inp.length;i++)
		{
			w=inp[i].toCharArray();
			if(w[0]=='S'||w[0]=='s')
				System.out.print(w);System.out.print(" ");
		}

	}

}
