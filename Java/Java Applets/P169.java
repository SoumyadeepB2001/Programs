import java.applet.Applet;
import java.awt.Graphics;
import java.applet.*;
import java.awt.*;
public class P169 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine(50,50,0,100);
		g.drawLine(50,50,100,100);
		g.drawLine(0,100,100,100);
		g.drawLine(10,100,10,150);
		g.drawLine(10,150,90,150);
		g.drawLine(90,150,90,100);
	}
}


