class P41
{
	public static void main(String args[])
	{
		String s1="AAAA";
		String s2="AB";
		String s3="AA";
		String s4="AAXXXX";
		String s5="BAXXXX";
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));
		System.out.println(s3.compareTo(s4));
		System.out.println(s4.compareTo(s3));
		System.out.println(s3.compareTo(s5));
		System.out.println(s5.compareTo(s3));
	}
}

