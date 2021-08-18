//constructor in inheritance

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

class P127
{
	public static void main(String args[])
	{
		System.out.println("Main function");
		cl2 ob = new cl2();
	}
}
