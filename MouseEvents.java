import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEvents {
	public static void main(String[] args)
	{
		x w=new x();
	}

}
class x extends JFrame implements MouseListener
{
	public JLabel l1;
	public JLabel l2;
	public JLabel l3;
	public JLabel l4;
	public JLabel l5;
	int x,y;
	public x()
	{
		 l1=new JLabel("");
		 l2=new JLabel("x:");
		 l3=new JLabel("");
		 l4=new JLabel("y:");
		 l5=new JLabel("");
		 setVisible(true);
		 setSize(400,400);
		 add(l1);
		 add(l2);
		 add(l3);
		 add(l4);
		 add(l5);
		 setLayout(new FlowLayout());
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 addMouseListener(this);
		 addMouseMotionListener(new MouseAdapter()
		 	{
			public void mouseMoved(MouseEvent e)
			{
				x=e.getX();
				y=e.getY();
				l1.setText("Eventtitle: MouseMoved");
				l3.setText(x+"");
				l5.setText(y+"");
			}
			public void mouseDragged(MouseEvent e)
			{
				x=e.getX();
				y=e.getY();
				l1.setText("Event Title: MouseDragged");
				l3.setText(x+"");
				l5.setText(y+"");
			}
		 	});
	}
	public void mousePressed(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		l1.setText("Eventtitle: Mousepressed");
		l3.setText(x+"");
		l5.setText(y+"");
	}
	public void mouseEntered(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		l1.setText("Eventtitle: MouseEntered");
		l3.setText(x+"");
		l5.setText(y+"");
	}
	public void mouseReleased(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		l1.setText("Eventtitle: MouseReleased");
		l3.setText(x+"");
		l5.setText(y+"");
	}
	public void mouseExited(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		l1.setText("Eventtitle: MouseExited");
		l3.setText(x+"");
		l5.setText(y+"");
	}
	public void mouseClicked(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		l1.setText("Eventtitle: MouseClicked");
		l3.setText(x+"");
		l5.setText(y+"");
	}
	public void mouseDragged(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		l1.setText("Eventtitle: MouseDragged");
		l3.setText(x+"");
		l5.setText(y+"");
	}
}