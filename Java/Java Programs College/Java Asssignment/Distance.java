import java.util.Scanner;
public class Distance
{
    public static void main(String[]args)
    {
        String[] planet={"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
        double[] dist={57910000.0,108200000.0,149600000.0,227900000.0,778500000.0,1434000000.0,2871000000.0,4495000000.0};
        long c=300000; double t;
        int pos;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the planet's position from sun to calculate the time required by sunlight to reach that planet");
        pos=sc.nextInt();
        t=dist[pos-1]/c;
        t=t/60;
        System.out.println("The amount time required by the light from sun to reach planet "+planet[pos-1]+" is = "+t+" Minutes");       
    }
}
    