//constructor in inheritance hierarchical

class cl1
{
	cl1()
	{
		System.out.println("Constructor of cl1");
	}
}

class cl2 extends cl1
{
	cl2()
	{
		System.out.println("Constructor of cl2");
	}
}

class cl3 extends cl1
{
	cl3()
	{
		System.out.println("Constructor of cl3");
	}
}

class P128
{
	public static void main(String args[])
	{
		System.out.println("Main function");
		cl2 ob1 = new cl2();
		cl3 ob2 = new cl3();
	}
}