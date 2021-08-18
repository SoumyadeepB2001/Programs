import java.util.Scanner;
class P71
{
	public static void main(String args[])
	{
		int a[][]={{10,20},{20,30},{30,40}};
		int r=a.length;
		System.out.println("Total number of rows = "+r);
		System.out.println("Total number of columns in 1st row = "+a[0].length);
		System.out.println("Total number of columns in 2nd row = "+a[1].length);
		System.out.println("Total number of columns in 3nd row = "+a[2].length);
		
		for(int i=0; i<a.length; i++)	//row (i=1D array)
		{
			for(int j=0; j<a[i].length; j++)	//column (index of ith 1D array)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		
		
	}
}
