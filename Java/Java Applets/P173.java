import java.applet.*;
import java.awt.*;
public class P173 extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawRect(100,100,200,200);
		g.setColor(Color.green);
		g.drawRect(150,150,100,100);
		g.setColor(Color.blue);
		g.fillRect(175,175,50,50);
	}
}


