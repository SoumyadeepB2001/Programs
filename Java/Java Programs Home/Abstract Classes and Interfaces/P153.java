interface cl1
{
	void input();	//public and abstract by default
}

class cl2 implements cl1
{
	public void input()	//if we do not use the keyword public the following error will be displayed
	{
		System.out.println("1st interface program");
	}
}

/*
P152.java:8: error: input() in cl2 cannot implement input() in cl1
	void input()
	     ^
  attempting to assign weaker access privileges; was public
1 error
*/

class P153
{
	public static void main(String args[])
	{
		cl1 ob = new cl1(); //error
		ob.input();
	}
}

/*
P153.java:26: error: cl1 is abstract; cannot be instantiated
		cl1 ob = new cl1();
		         ^
1 error
*/

