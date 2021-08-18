import java.util.*;
class ArrayInsertion
{
	public static void main(String args[])
	{
		int size,i,pos,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		size=sc.nextInt();
		int ar[]=new int[size+1];

		System.out.println("Enter "+size+" numbers");
		for(i=0;i<size;i++)
			ar[i]=sc.nextInt();
				
		System.out.print("The original array is : ");		
		for(i=0;i<size;i++)
			System.out.print(ar[i]+" ");

		System.out.println("\nEnter the position at which you want to insert a new number");	
			pos=sc.nextInt();
		System.out.println("Enter the new number to be inserted");
			n=sc.nextInt();
		
		for(i=size;i>=pos-1;i--)
			ar[i]=ar[i-1];
		ar[pos-1]=n;

		System.out.print("The new array is : ");		
		for(i=0;i<=size;i++)
			System.out.print(ar[i]+" ");
	}
}