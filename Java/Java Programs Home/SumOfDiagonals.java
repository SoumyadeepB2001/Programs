import java.util.*;
class SumOfDiagonals
{
	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the length of the matrix");
		n=sc.nextInt();
		int ar[][]=new int[n][n];
		System.out.println("Enter the elements of the matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				ar[i][j]=sc.nextInt();

		}
		System.out.println("The diagonal elements are: ");	
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++){
				if(i+j==n-1 || i==j){
					sum+=ar[i][j];
					System.out.print(ar[i][j]+" ");
				}
				else
					System.out.print("  ");		
			}
		System.out.println();		
		}
		System.out.println("Sum of both the diagonals = "+sum);	
	}
}