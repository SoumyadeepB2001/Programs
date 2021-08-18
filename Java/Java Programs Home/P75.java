import java.util.Scanner;
class P75
{
	public static void main(String args[])
	{
		int a[][][]=new int[2][3][2];			
		Scanner s=new Scanner(System.in);
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				for(int k=0; k<a[i][j].length; k++)
					a[i][j][k]=s.nextInt();
			}
		}

		for(int i=0; i<a.length; i++)
		{
			System.out.println("2D array no. "+i);
			for(int j=0; j<a[i].length; j++)
			{
				for(int k=0; k<a[i][j].length; k++)
					System.out.print(a[i][j][k]+" ");
				System.out.println();
			}
		}
	}
}
