import java.applet.Applet;
import java.awt.Graphics;
import java.applet.*;
import java.awt.*;
public class P168 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(10,20,40,20);
		g.drawLine(40,20,40,30);
		g.drawLine(40,30,10,30);
		g.drawLine(10,30,10,20);
	}
}


