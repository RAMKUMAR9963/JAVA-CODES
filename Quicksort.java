import java.util.Scanner;
public class Quicksort {
	public static void sort(String a[])
	{
		quicksort(a,0,a.length-1);
	}
	public static void quicksort(String a[],int low,int high)
	{
		int i=low;
		int j=high;
		String pivot=a[(low+high)/2];
		while(i<=j)
		{
			while(a[i].compareTo(pivot)<0)
			{
				i++;
			}
			while(a[j].compareTo(pivot)>0)
			{
				j--;
			}
			if(i<=j)
			{
				String temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		if(j<low)
		{
			quicksort(a,low,j);
		}
		if(i<high)
		{
			quicksort(a,i,high);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of names :");
		int n=sc.nextInt();
		String a[]=new String[n];
		System.out.println("Enter the "+n+" number of names :");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
		sort(a);
		System.out.println("Sorted List :");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

}
