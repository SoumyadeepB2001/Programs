import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
public class Colors extends Applet {
	public void paint(Graphics g) {
		setBackground(Color.cyan);
  		setForeground(Color.red);
		g.drawString("Hello World",20,20);		
	}
}