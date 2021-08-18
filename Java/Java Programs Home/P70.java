import java.util.Scanner;
class P70
{
	public static void main(String args[])
	{
		int a[][]={{10,20},{20,30},{30,40}};
		int r=a.length;
		System.out.println(r);
		
		for(int i=0; i<3; i++)	//row (i=1D array)
		{
			for(int j=0; j<2; j++)	//column (index of ith 1D array)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		
		
	}
}
