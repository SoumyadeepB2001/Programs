import java.util.*;
class ArraySum
{
	public static void main(String args[])
	{
		int size,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter "+size+" elements of the array");
		for(i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
			sum+=ar[i];
		}
		System.out.println("The sum of all the elements of the array = "+sum);	
	}
}