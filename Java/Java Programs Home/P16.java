class cl
{
	cl()
	{
		System.out.println("Constructor");
	}
}

class P16
{
	public static void main(String args[])
	{
		cl ob = new cl();
		System.out.println("Main Function");
		cl ob1 = new cl();
		System.out.println("End of Main Function");
	}
}
