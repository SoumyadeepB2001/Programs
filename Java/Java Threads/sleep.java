import java.lang.*;
class cl1 extends Thread
{
	public void run()
	{		
		for(int i=0; i<5; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception ob1)
			{
			}
			System.out.println("cl1 - "+i);
		}
	}

	public static void main(String args[])
	{
		System.out.println("Start of main()");
		cl1 ob = new cl1();
		ob.start();
		System.out.println("End of main()");
	}
}

