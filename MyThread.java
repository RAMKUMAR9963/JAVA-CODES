
public class MyThread 
{
	public static void main(String[] args)
	{
		MyThreadDemo mt=new MyThreadDemo();
		mt.start();
	}
}
class MyThreadDemo extends Thread
{
	public void run()
	{
		System.out.println("The Thread is started");
	}
}