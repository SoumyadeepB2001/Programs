import java.applet.*;
import java.awt.*;
import java.util.*;
public class P170 extends Applet
{
	public void paint(Graphics g)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of x and y");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		g.drawLine(x,y,x-50,y+50);
		g.drawLine(x,y,x+50,y+50);
		g.drawLine(x+50,y+50,x-50,y+50);
		g.drawLine(x-40,y+50,x-40,y+100);
		g.drawLine(x-40,y+100,x+40,y+100);
		g.drawLine(x+40,y+100,x+40,y+50);
	}
}


