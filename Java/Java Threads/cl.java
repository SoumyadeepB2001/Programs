class cl extends Thread
{
	public void run()
	{
		System.out.println("Thread is running using extending");
	}
	
	public void start()
	{
		System.out.println("Thread start() is running using extending");
	}
	
	public static void main(String args[])
	{
		cl ob = new cl();
		ob.start();
		ob.run();
	}
}
