import java.applet.*;
import java.awt.*;
public class P175 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawArc(100,100,200,200,90,90);
		g.drawArc(200,200,200,50,90,90);
		g.drawArc(250,250,200,50,180,180);
	}
}


