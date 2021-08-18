//parameterized constructor and static block with single inheritance

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



class P133
{
	public static void main(String args[])
	{
		cl2 ob1 = new cl2(5,6);
	}
}
