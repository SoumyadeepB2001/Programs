import java.applet.*;
import java.awt.*;
public class P177 extends Applet
{
	public void paint(Graphics g)
	{
		try
		{
			for(int i=0; i<400; i++)
			{
				g.drawLine(i,i,i+1,i+1);
				Thread.sleep(100);
			}
		}
		catch(Exception ob){}
	}
}


