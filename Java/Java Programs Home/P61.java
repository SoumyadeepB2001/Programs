class P61
{
	public static void main(String args[])
	{
		StringBuffer s = new StringBuffer(5);	//capacity = 5, but length = 0
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println(s.length());
		s.append("abcdefg");
		System.out.println(s.capacity());
	}
}
