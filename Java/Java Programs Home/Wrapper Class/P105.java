/*
isDigit()
isLetter()
isUpperCase()
isLowerCase()
isWhitespace()
isLetterOrDigit()
toLowerCase()
toUpperCase()

/n, tab, backspace, enter = whitespace
*/

import java.util.*;
class P105
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter a character. Enter $ to quit");
			
			char c = sc.next().charAt(0);
			
			if(c=='$')
				break;
			
			if(Character.isDigit(c))
				System.out.println("You have entered a digit");
			
			if(Character.isLetter(c))
				System.out.println("You have entered a letter");
			
			if(Character.isUpperCase(c))
				System.out.println("You have entered an upper case letter");
			
			if(Character.isLowerCase(c))
				System.out.println("You have entered a lower case letter");
			
			if(Character.isLetterOrDigit(c))
				System.out.println("You have entered a letter or a digit");
				
			if(Character.isWhitespace(c))
				System.out.println("You have entered a white space");
		}
		sc.close();
	}
}		
