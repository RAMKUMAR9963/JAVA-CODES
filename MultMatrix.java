import java.util.Scanner;

public class MultMatrix
{
	public static void main(String args[])
	{
		int i,j,k;
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
				int sum=0;
				for(k=0;k<3;k++)
				{
					sum=sum+a[i][k]+b[k][j];
				}
				c[i][j]=sum;
			}
		}
		System.out.println("Multiplicaiton of two matrix :");
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
