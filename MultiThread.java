import java.util.Random;
class square extends Thread
{
	int x;
	public square(int n)
	{
		x=n;
	}
	public void run()
	{
		int sqr=x*x;
		System.out.println("the square of the number is "+sqr);
	}
}
class cube extends Thread
{
	int y;
	public cube(int n)
	{
		y=n;
	}
	public void run()
	{
		int cub=y*y*y;
		System.out.println("the cube of the number is "+cub);
	}
}
class Number extends Thread
{
	public void run()
	{
		Random random=new Random();
		
		for(int i=1;i<=5;i++)
		{
			int randomnum=random.nextInt(100);
			System.out.println("The random number is "+randomnum);
			square s=new square(randomnum);
			cube c=new cube(randomnum);
			if(randomnum%2==0)
			{
				s.start();	
			}
			else
			{
				c.start();
			}
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ae)
			{
				System.out.println(ae);
			}
		}
	}
}
public class MultiThread
{
	public static void main(String[] args)
	{
		Number n=new Number();
		n.start();
	}	
}
