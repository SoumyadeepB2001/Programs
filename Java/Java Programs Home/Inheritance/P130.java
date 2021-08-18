//parameterized constructor

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
		super(b); //call to super must be first statement in constructor
		System.out.println("Constructor of sub class "+a);
	}
}

class P130
{
	public static void main(String args[])
	{
		cl2 ob = new cl2(5,6);
	}
}


