import java.util.*;
class ArrayDeletion
{
	public static void main(String args[])
	{
		int size,i,pos;
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

		System.out.println("\nEnter the position at which you want to  delete the number");	
			pos=sc.nextInt();
		
		for(i=pos-1;i<size-1;i++)
			ar[i]=ar[i+1];

			System.out.print("The new array is : ");		
			for(i=0;i<size-1;i++)
				System.out.print(ar[i]+" ");	
	}
}