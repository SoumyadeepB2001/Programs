interface cl1
{
	void input();	//All methods of an interface are public and abstract by default
}

class cl2 implements cl1
{
	public void input()	//If we do not use the keyword public the following error will be displayed
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

class P152
{
	public static void main(String args[])
	{
		cl2 ob = new cl2();
		ob.input();
	}
}

