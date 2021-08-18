interface cl1
{
	default void f1()
	{
		System.out.println("cl1");
	}
}

interface cl2 extends cl1
{
	default void f1()
	{
		System.out.println("cl2");
	}
}

interface cl3 extends cl1
{
	default void f1()
	{
		System.out.println("cl3");
	}
}

class cl4 implements cl2,cl3
{
}

class P166
{
	public static void main(String args[])
	{
		cl4 ob = new cl4();
		ob.f1();
	}
}

/*
P166.java:25: error: class cl4 inherits unrelated defaults for f1() from types cl2 and cl3
class cl4 implements cl2,cl3
^
1 error
*/
