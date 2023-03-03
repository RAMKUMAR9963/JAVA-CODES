import java.util.Scanner;
public class AddMatrix
{
	public static void main(String args[])
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int n=sc.nextInt();
		System.out.println("Enter the number of columns");
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		int c[][]=new int[n][m];
		System.out.println("Enter the a Matrix Elements :");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int b[][]=new int[n][m];
		System.out.println("Enter the b Matrix Elements :");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Additon of two matrix :");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
