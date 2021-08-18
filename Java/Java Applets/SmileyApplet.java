import java.applet.*;
import java.awt.*;
public class SmileyApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.drawOval(50,50,100,100);
		g.drawOval(70,77,20,20);
		g.drawOval(110,77,20,20);
		g.drawArc(70,104,60,30,180,180);
	}
}


