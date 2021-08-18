class P37
{
	public static void main(String args[])
	{
		String s1="sunday"; 
		String s2="Sunday";	//first place is capital
		String s3="sunday";
		if(s1.equals(s2))
		{
			System.out.println("s1 and s2 are same");
		}
		else
		{
			System.out.println("s1 and s2 are not same");
		}
		if(s3.equals(s2))
		{
			System.out.println("s3 and s2 are same");
		}
		else
		{
			System.out.println("s3 and s2 are not same");
		}
		if(s3.equals(s1))
		{
			System.out.println("s3 and s1 are same");
		}
		else
		{
			System.out.println("s3 and s1 are not same");
		}
	}
}

