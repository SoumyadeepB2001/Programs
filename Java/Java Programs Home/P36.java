class P36
{
	public static void main(String args[])
	{
		String s1="sunday";
		String s2=new String("sunday");
		if(s1.equals(s2))		//checks value
		{
			System.out.println("Two string are same");
		}
		else
		{
			System.out.println("The string are not same");
		}
		if(s1==s2)			//checks reference
		{
			System.out.println("Two string are same");
		}
		else
		{
			System.out.println("The string are not same");
		}
	}
}

