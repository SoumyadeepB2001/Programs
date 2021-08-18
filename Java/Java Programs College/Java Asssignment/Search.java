import java.util.*;
class Search
{
	public static void main(String args[])
	{
		int size,i,n,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter "+size+" numbers");
		for(i=0;i<size;i++)
			ar[i]=sc.nextInt();
		
		System.out.println("Enter the number to search");
		n=sc.nextInt();

		for(i=0;i<size;i++)
		{
			if(ar[i]==n)
			{
				flag++;
			if(flag==1)	
			{
				System.out.print(n+" has been found at positions: "); 
				System.out.print((i+1)+" ");
			}	
			if(flag>1)
				System.out.print((i+1)+" ");	
			}							
		}
		
		if(flag==0)
		System.out.print(n+" was not found in the array");
	}
}