class cl1 extends Thread
{
	public void run()
	{
		System.out.println("Thread is running using extending");
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
		cl1 ob = new cl1();
		ob.start();
	}
}

