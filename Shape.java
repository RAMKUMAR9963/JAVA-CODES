
import java.util.*;
abstract class Shapes 
{
	int a,b;              
	abstract public void printarea();
}
class Rectangle extends Shapes
{
	public int area_react;
	public void printarea()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Length and Breadth of Rectangle :");
		a=s.nextInt();
		b=s.nextInt();
		area_react=a*b;
		System.out.println("Length of "+a+" breadth of "+b);
		System.out.println("The area of rectangle is "+area_react);
	}
}
class Triangle extends Shapes
{
	public double area_tri;
	public void printarea()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Base and height of a Triangle :");
		a=s.nextInt();
		b=s.nextInt();
		area_tri=0.5*a*b;
		System.out.println("Base of "+a+" Height "+b);
		System.out.println("The area of a Triangle is :"+area_tri);
	}
}
class Circle extends Shapes
{
	public double area_circle;
	public void printarea()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Radius :");
		a=s.nextInt();
		area_circle=3.14*a*a;
		System.out.println("Radius of "+a);
		System.out.println("The area of Circle is :"+area_circle);
	}
}
public class Shape
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		r.printarea();
		Triangle t=new Triangle();
		t.printarea();
		Circle c=new Circle();
		c.printarea();
	}
}
