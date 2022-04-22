import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Shapes extends JComponent {
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHints(rh);

        Ellipse2D.Double e1 = new Ellipse2D.Double(10, 10, 210, 210);
        g2d.setColor(new Color(125, 0, 60));
        g2d.fill(e1);

        Ellipse2D.Double e2 = new Ellipse2D.Double(400, 400, 100, 100);
        g2d.setColor(Color.BLUE);
        g2d.fill(e2);

        // red moon
        Ellipse2D.Double e3 = new Ellipse2D.Double(200, 350, 80, 80);
        g2d.setColor(Color.RED);
        g2d.fill(e3);

        // red moon shadow
        Ellipse2D.Double e3s = new Ellipse2D.Double(175, 380, 80, 80);
        g2d.setColor(new Color(0, 1, 23));
        g2d.fill(e3s);

        Ellipse2D.Double e4 = new Ellipse2D.Double(475, 150, 160, 160);
        g2d.setColor(new Color(255, 162, 0));
        g2d.fill(e4);

        Ellipse2D.Double e4i = new Ellipse2D.Double(485, 160, 140, 140);
        g2d.setColor(new Color(255, 222, 10));
        g2d.fill(e4i);

        Ellipse2D.Double e4ii = new Ellipse2D.Double(495, 170, 120, 120);
        g2d.setColor(new Color(255, 236, 112));
        g2d.fill(e4ii);

        Ellipse2D.Double e4iii = new Ellipse2D.Double(505, 180, 100, 100);
        g2d.setColor(new Color(255, 255, 255));
        g2d.fill(e4iii);

        Ellipse2D.Double e5 = new Ellipse2D.Double(200, 200, 55, 55);
        g2d.setColor(Color.GRAY);
        g2d.fill(e5);

        Ellipse2D.Double e6 = new Ellipse2D.Double(190, 200, 55, 55);
        g2d.setColor(new Color(0, 1, 23));
        g2d.fill(e6);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Shapes file = new Shapes();
        frame.add(file);// This is the key!
        frame.setVisible(true);
        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Test window");
        frame.setResizable(true);
        frame.getContentPane().setBackground(new Color(0, 1, 23));
    }
}