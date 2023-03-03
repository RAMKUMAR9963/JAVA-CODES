import java.util.Scanner;
public class S1
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char a=sc.next().charAt(0);
		if((a>=65)&&(a<=90))
		{
			System.out.println("Uppercase");
		}
		else if((a>=97)&&(a<=122))
		{
			System.out.println("LowerCase");
		}
		else if((a>=48)&&(a<=57))
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Symbol");
		}
	}
		
}



