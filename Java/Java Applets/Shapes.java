import java.applet.Applet;
import java.awt.Graphics;
import java.applet.*;
import java.awt.*;
public class Shapes extends Applet
{
public void paint(Graphics g)
{
//Drawing an Oval shape
g.drawOval(250, 100, 250, 100);
//Drawing a Rectangle shape
g.drawLine(50,50,50,250);
g.drawLine(200,250,200,50);
g.drawLine(50,250,200,250);
g.drawLine(200,50,50,50);
//Drawing a Triangle shape
g.drawLine(625,50,700,250);
g.drawLine(625,50,550,250);
g.drawLine(550,250,700,250);
}
}