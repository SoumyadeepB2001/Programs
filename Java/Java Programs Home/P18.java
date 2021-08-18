class cl 
{
	cl() //Ambiguity error - duplicate constructor
	{
		System.out.println("Constructor without argument");
	}
	cl() //Ambiguity error - duplicate constructor
	{
		System.out.println("Constructor with single argument");
	}
	cl(int x, int y)
	{
		System.out.println("Constructor with two arguments");
	}
}

class P18
{
	public static void main(String args[])
	{
		cl ob = new cl();
		cl ob1 = new cl();
		cl ob2 = new cl(5,7);
	}
}
