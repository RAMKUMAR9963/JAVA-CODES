import java.io.*;
public class EmployeeDetails 
{
	public static void main(String[] args)
	{
	InputStreamReader ir=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(ir);
	try
	{
		System.out.println("Enter the ID : ");
		int id=Integer.parseInt(br.readLine());
		System.out.println("Enter the Gender : ");
		String Gender=br.readLine();
		System.out.println("Enter Employee Name : ");
		String name=br.readLine();
		System.out.println("Employee ID : "+id);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Gender : "+Gender.toUpperCase());
	}
	catch(IOException ie)
	{
		ie.printStackTrace();
	}
	catch(NumberFormatException e)
	{
		e.printStackTrace();
	}
	}
}
