//constructor overloading - more than one constructor with different signatures(parameters)

class cl
{
	cl()
	{
		System.out.println("Constructor without argument");
	}
	cl(int x)
	{
		System.out.println("Constructor with single argument");
	}
	cl(int x, int y)
	{
		System.out.println("Constructor with two arguments");
	}
}

class P17
{
	public static void main(String args[])
	{
		cl ob = new cl();
		cl ob1 = new cl(5);
		cl ob2 = new cl(5,7);
	}
}
