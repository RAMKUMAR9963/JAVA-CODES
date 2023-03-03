import java.util.Scanner;
public class BubbleSort {
	public static void main(String[] args)
	{
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("\nEnter "+n+" elements :");
		for(int i=0;i<a.length;i++)
				a[i]=s.nextInt();
		for(int i=0;i<a.length-1;i++)
			for(int j=0;j<a.length-i-1;j++)
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					count++;
				}
		System.out.println("The List after sort is :");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		System.out.println("Interchanges :"+count);
	}
}
