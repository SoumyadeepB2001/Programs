import java.util.Scanner;
class P74
{
	public static void main(String args[])
	{
		int a[][]=new int[2][3];			
		Scanner s=new Scanner(System.in);
		for(int i=0; i<a.length; i++)
			for(int j=0; j<a[i].length; j++)
				a[i][j]=s.nextInt();
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		
		int [][]b=new int[2][3];			
		for(int i=0; i<b.length; i++)
			for(int j=0; j<b[i].length; j++)
				b[i][j]=s.nextInt();
		
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<b[i].length; j++)
				System.out.print(b[i][j]+" ");
			System.out.println();
		}
	}
}		
