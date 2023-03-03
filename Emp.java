import java.util.Scanner;
class Employee
{
	String Designation;
	String Name;
	String Location;
	int Salary;
	int id;	
}
class Emp
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Employees :");
		int n=sc.nextInt();
		Employee emp[]=new Employee[n];
		for(int i=0;i<n;i++)
		{
			emp[i]=new Employee();
			System.out.println("Enter the Details of "+(i+1)+" Employee");
			System.out.println("Enter the Designation : ");
			emp[i].Designation=sc.next();
			System.out.println("Enter the Employee Name :");
			emp[i].Name=sc.next();
			System.out.println("Enter the Employee Location :");
			emp[i].Location=sc.next();
			System.out.println("Enter the ID of an Employee :");
			emp[i].id=sc.nextInt();
			System.out.println("Enter the Salary of an Employee :");
			emp[i].Salary=sc.nextInt();
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("The Details of "+(i+1)+" Employee");
			System.out.println("Employee Designation : "+emp[i].Designation);
			System.out.println("Employee Name : "+emp[i].Name);
			System.out.println("Employee Location : "+emp[i].Location);
			System.out.println("Employee ID : "+emp[i].id);
			System.out.println("Employee Salary : "+emp[i].Salary);
			System.out.println();
			System.out.println();
		}
	}
}
