class MO
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
}
public class MethodOverloading {
	public static void main(String args[])
	{
		int x=MO.add(11,12);
		int y=MO.add(11,12,13);
		System.out.println("Addition of two numbers :"+x);
		System.out.println("Addition of three numbers :"+y);
	}
}
