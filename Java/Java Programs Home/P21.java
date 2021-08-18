class cl
{
	cl(float x)
	{
		System.out.println("Constructor with single float argument");
	}
	cl(double x)
	{
		System.out.println("Constructor with single double argument");
	}
}

class P21
{
	public static void main(String args[])
	{
		cl ob2 = new cl(2.5f);
		cl ob3 = new cl(2.5);
	}
}
