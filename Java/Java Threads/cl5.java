class cl5 implements Runnable
{
	public void run()
	{
		System.out.println("run() is running");
	}
	
	public void start()
	{
		System.out.println("Thread start() is running");
	}
	
	public static void main(String args[])
	{
		cl5 ob = new cl5();
		ob.start();
		ob.run();
	}
}
