//parameterized constructor multi level

class cl1
{
	cl1(int a)
	{
		System.out.println("Constructor of super class "+a);
	}
}

class cl2 extends cl1
{
	cl2(int a, int b)
	{
		super(b);
		System.out.println("Constructor of sub class cl2 "+a);
	}
}

class cl3 extends cl2
{
	cl3(int a, int b, int c)
	{
		super(b,c);
		System.out.println("Constructor of sub class cl3 "+a);
		//super(b,c); 			call to super must be first statement in constructor
	}
}

class P131
{
	public static void main(String args[])
	{
		cl3 ob = new cl3(5,6,7);
	}
}


