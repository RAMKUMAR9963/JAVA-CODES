import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*<applet code=Division.class height=500 width=500>
</applet>*/
public class Division extends Applet implements ActionListener
{
	Label l1,l2,l3;
	TextField tf1,tf2,tf3;
	Button b1;
	public void init()
	{
		setSize(600,400);
		FlowLayout g=new FlowLayout();
		setLayout(g);
		l1=new Label("NUM 1 : ");
		l1.setForeground(Color.blue);
		add(l1);
		tf1=new TextField(5);
		add(tf1);
		l2=new Label("  NUM 2 : ");
		l2.setForeground(Color.blue);
		add(l2);
		tf2=new TextField(5);
		add(tf2);
		b1=new Button("Div");
		b1.addActionListener(this);
		add(b1);
		l3=new Label("  RESULT : ");
		l3.setForeground(Color.blue);
		add(l3);
		tf3=new TextField(15);
		add(tf3);
	}
	public void actionPerformed(ActionEvent ae)
	{
		long n1,n2,res;
		try
		{
			n1=Integer.parseInt(tf1.getText());
			n2=Integer.parseInt(tf2.getText());
			res=n1/n2;
			tf3.setText(String.valueOf(res));
		}
		catch(Exception e)
		{
			tf3.setText(String.valueOf("Exception : "+e.getMessage()));
		}
	}
}