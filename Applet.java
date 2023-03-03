import java.awt.*;
import javax.swing.*;
public class Applet extends JApplet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawString("Welcome to Applet", 50, 50);
	}
}
