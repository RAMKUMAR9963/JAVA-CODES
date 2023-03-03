class Animal
{
	void eat()
	{
		System.out.println("Eating");
	}
}
class Wild extends Animal
{
	void eat()
	{
		System.out.println("Eating");
	}
}
public class MethodOverriding
{
	public static void main(String args[])
	{
		Wild w=new Wild();
		w.eat();
	}
}
