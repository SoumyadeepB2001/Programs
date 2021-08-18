//concat function

class P30
{
	public static void main(String args[])
	{
		String s1="Sun";		
		String s2=s1.concat("day");	//concatination with string value
		String s3="Holiday";
		String s4=s2.concat(s3);	//concatination with object
		
		System.out.println("String s1 = "+s1);
		System.out.println("String s2 = "+s2);
		System.out.println("String s3 = "+s3);
		System.out.println("String s4 = "+s4);
	}
}

