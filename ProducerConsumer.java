class Q
{
	int num;
	boolean setValue=false;
	public synchronized void put(int num)
	{
		while(setValue)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{}
		}
		System.out.println("Produced value is :"+num);
		this.num=num;
		setValue=true;
		notify();
	}
	public synchronized void get()
	{
		while(!setValue)
		{
			try
			{
				wait();
			}
			catch(Exception e)
			{}
		}
		System.out.println("Consumed value is :"+num);
		setValue=false;
		notify();
	}
}
class Producer implements Runnable
{
	Q q;
	Producer(Q q)
	{
		this.q=q;
		Thread t=new Thread(this,"Producer");
		t.start();
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			q.put(i++);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {}
		}
	}
}

class Consumer implements Runnable
{
	Q q;
	Consumer(Q q)
	{
		this.q=q;
		Thread t=new Thread(this,"Consumer");
		t.start();
	}
	public void run()
	{
		while(true)
		{
			q.get();
			try {
				Thread.sleep(3000);
			}
			catch(Exception e)
			{}
		}
	}
}
public class ProducerConsumer {
	public static void main(String[] args)
	{
		Q q=new Q();
		new Producer(q);
		new Consumer(q);
	}
}
