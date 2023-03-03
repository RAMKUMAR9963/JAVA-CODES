import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Traffic{
	public static void main(String[] args)
	{
		T a=new T();
	}
}
class T extends JFrame implements ActionListener{
	public JPanel p;
	public JRadioButton b1;
	public JRadioButton b2;
	public JRadioButton b3;
	public JLabel l1;
	public ButtonGroup b;
	public T()
	{
		p=new JPanel(new FlowLayout());
		l1=new JLabel("",JLabel.CENTER);
		b1=new JRadioButton("RED");
		b2=new JRadioButton("YELLOW");
		b3=new JRadioButton("GREEN");
		b=new ButtonGroup();
		p.add(l1);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		add(p);
		b.add(b1);
		b.add(b2);
		b.add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		setVisible(true);
		setSize(300,300);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(b1.isSelected())
		{
			l1.setText("Stop");
			l1.setForeground(Color.red);
		}
		if(b2.isSelected())
		{
			l1.setText("ready");
			l1.setForeground(Color.YELLOW);
		}
		if(b3.isSelected())
		{
			l1.setText("go");
			l1.setForeground(Color.green);
		}
	}
}