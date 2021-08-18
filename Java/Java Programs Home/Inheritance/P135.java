//parameterized constructor static block hierarchical inheritance

class cl1
{
	cl1(int a)
	{
		System.out.println("Constructor of super class "+a);
	}
	static
	{
		System.out.println("Static block of cl1");
	}
}

class cl2 extends cl1
{
	cl2(int a, int b)
	{
		super(b);
		System.out.println("Constructor of sub class cl2 "+a);
	}
	static
	{
		System.out.println("Static block of cl2");
	}
}

class cl3 extends cl1
{
	cl3(int a, int b)
	{
		super(b); //call to super must be the first statement in constructor
		System.out.println("Constructor of sub class cl3 "+a);
		//super(b,c); 			call to super must be the first statement in constructor
	}
	static
	{
		System.out.println("Static block of cl3");
	}
}

class P134
{
	public static void main(String args[])
	{
		cl2 ob1 = new cl2(5,6);
		cl3 ob2 = new cl3(7,8);
	}
}


