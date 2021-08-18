class cl6 implements Runnable
{
	public void run()
	{
		System.out.println("run() is running");
		for(int i=0; i<5; i++)
		{
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception ob1)
			{
			}
			System.out.println(i);
		}
			
	}
	
	public static void main(String args[])
	{
		cl6 ob = new cl6();
		Thread t1 = new Thread(ob);
		t1.start();
		//ob.start();		//error
		Thread t2 = new Thread(ob);
		t2.start();
	}
}
	
