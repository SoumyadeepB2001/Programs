/*
sunday
sunda
sund
sun
su
s
*/
import java.util.*;
class P52
{
	public static void main(String args[])
	{
		String s="sunday";
		int l=s.length();
		for(int i=l-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}
}
