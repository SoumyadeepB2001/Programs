import java.util.*;
class Array
{
	public static void main(String args[])
	{
		int size,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		size=sc.nextInt();
		int ar[]=new int[size];

		System.out.println("Enter "+size+" numbers");
		for(i=0;i<size;i++)
			ar[i]=sc.nextInt();
				
		System.out.print("The original array is : ");		
		for(i=0;i<size;i++)
			System.out.print(ar[i]+" ");

		System.out.println();	
		
		System.out.print("The reversed array is : ");
		for(i=size-1;i>=0;i--)
			System.out.print(ar[i]+" ");
	}
}