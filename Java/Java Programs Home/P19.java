class cl
{
	cl()
	{
		System.out.println("Constructor without argument");
	}
	cl(int x)
	{
		System.out.println("Constructor with single integer argument");
	}
	cl(float x)
	{
		System.out.println("Constructor with single float argument");
	}
	cl(int x, int y)
	{
		System.out.println("Constructor with two integer arguments");
	}
}

class P19
{
	public static void main(String args[])
	{
		cl ob = new cl();
		cl ob1 = new cl(5);
		cl ob3 = new cl(2.5f);
		cl ob2 = new cl(5,7);
	}
}
