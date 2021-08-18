//calculate number of vowel and consonants

import java.util.Scanner;
class P44
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=sc.nextLine();
		int l=s1.length();
		int v=0,c=0;
		char ch;
		
		for(int i=0; i<l; i++)
		{
			ch=s1.charAt(i);
			if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
				v++;
			else
				c++;
		}
		System.out.println("Vowels are "+v);
		System.out.println("Consonants are "+c);
	}
}
