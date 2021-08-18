import java.util.*;
class VariableArgs2
{
	void f1(int s[])
	{
		int max=s[0],min=s[0],sum=0;
		double avg;
		System.out.println("\n"+s.length+" Integer Arguments:");
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
			
			if(s[i]>=max)
				max=s[i];
			if(s[i]<=min)
				min=s[i];
			
			sum+=s[i];
		}
		System.out.println();
		System.out.println("Greatest Number = "+max);
		System.out.println("Smallest Number = "+min);
		avg=(double)sum/(double)s.length;
		System.out.println("Sum = "+sum+"\nAverage = "+avg);		
	}

	public static void main(String[] args) {
		VariableArgs2 ob=new VariableArgs2();
		int i1[]={1,2,3,4,5};
		int i2[]={10,18,36,41,26,33,24,40,21};
		int i3[]={150,507,340,408};
		ob.f1(i1);
		ob.f1(i2);
		ob.f1(i3);
	}
}