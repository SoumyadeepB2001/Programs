class P12
{
	int a,b;
	void input()
	{
		a=5;
		b=6;
	}
	void output()
	{
		System.out.println("a = "+a+" b = "+b);
	}
	public static void main(String args[])
	{
		P12 ob = new P12();	//dynamic object creation
		ob.input();		//calls input function
		ob.output();		//calls output function
	}
}		
