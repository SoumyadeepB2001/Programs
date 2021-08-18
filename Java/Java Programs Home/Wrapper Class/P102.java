class P102
{
	public static void main(String args[])
	{
		System.out.println("Auto boxing");
		boolean i=true;			//boolean variable
		Boolean iob = i;		//wrapper class - autoboxing for a boolean
		System.out.println("Boolean value i = "+i);
		System.out.println("Boolean class value = "+iob);
		
		System.out.println("Unboxing");
		boolean j = iob; //unboxing
		System.out.println("Boolean value j = "+j);
		System.out.println("Boolean class value = "+iob);
	}
}
