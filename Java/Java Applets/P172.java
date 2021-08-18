import java.applet.*;
import java.awt.*;
public class P172 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawOval(50,50,100,100);
		g.setColor(Color.blue);
		g.drawOval(70,90,20,20);
		g.setColor(Color.green);
		g.fillOval(110,90,20,20);
		
	}
}


