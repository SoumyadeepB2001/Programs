class cl1
{
	void f()
	{
		System.out.println("I am in super class");
	}
}

class cl2 extends cl1
{
	void f()
	{
		System.out.println("I am in sub class cl2");
	}
}

class P142
{
	public static void main(String args[])
	{
		cl1 ob1 = new cl1();
		ob1.f();
		cl2 ob2 = new cl1();	//error: incompatible types: cl1 cannot be converted to cl2
		ob2.f();
	}
}

