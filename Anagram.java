import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two strings");
		String str1=sc.next();
		String str2=sc.next();
		int len1,len2;
		len1=str1.length();
		len2=str2.length();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char[] arstr1=str1.toCharArray();
		char[] arstr2=str2.toCharArray();
		Arrays.sort(arstr1);
		Arrays.sort(arstr2);
		if(len1!=len2)
			System.out.println("Strings are not Anagrams");
		else
		{
			if(Arrays.equals(arstr1,arstr2))
				System.out.println("Strings are Anagrams");
			else
				System.out.println("Strings are not Anagrams");
		}

	}

}
