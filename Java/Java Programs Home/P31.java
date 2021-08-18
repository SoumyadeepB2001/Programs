class P31
{
	public static void main(String args[])
	{
		String s1="sunday";
		String s2=new String("sunday");
		if(s1==s2)	//if we compare with == operator, ther value of string is not compared the reference of string is compared
		{
			System.out.println("Two string are same");
		}
		else
			System.out.println("The string are not same");
	}
}

