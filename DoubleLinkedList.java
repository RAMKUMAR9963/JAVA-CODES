import java.util.Scanner;
class DoubleLinkedList
{
	private class Node
	{
		int data;
		Node prev,next;
		Node(int data)
		{
			this.prev=null;
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	Node tail=null;
	public void insert(int data)
	{
		//Insert at end
		Node temp=new Node(data);
		if(head==null)
		{
			head=tail=temp;
		}
		else
		{
			tail.next=temp;
			temp.prev=tail;
			tail=temp;
		}
	}
	public void delete()
	{
		Scanner sc=new Scanner(System.in);
		if(head==null)
		{
			System.out.println("List is empty unable to delete");
			return;
		}
		Node temp=head;
		int data;
		System.out.print("\nEnter an element to be deleted : ");
		data=sc.nextInt();
		while(temp!=null && temp.data!=data)
		{
			temp=temp.next;
		}
		if(temp==null)
		{	
			System.out.println("Element "+data+" is not found");
		}
		else
		{
			if(temp==head)
			{
				System.out.println("Element "+head.data+" is deleted");
				head=head.next;				
			}
			else
			{
				Node temp1,temp2;
				temp1=temp.prev;
				temp2=temp.next;
				temp1.next=temp2;
				if(temp2!=null)
				{
					temp2.prev=temp1;
				}
				System.out.println("Element "+temp.data+" is deleted");
			}
		}
	}
	public void display()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		Node temp=head;
		System.out.println("The List is : ");
		System.out.print("Head <-> ");
		while(temp!=null)
		{
			System.out.print(temp.data+" <-> ");
			temp=temp.next;
		}
		System.out.print("Tail\n");
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		DoubleLinkedList l=new DoubleLinkedList();
		int ch,x;
		while(true)
		{
			System.out.println("\n1.Insert\n2.Delete\n3.Display\n4.Exit");
			System.out.print("Enter Your Choice : ");
			ch=s.nextInt();
			switch(ch)
			{
				case 1:System.out.print("\nEnter a value : ");
						x=s.nextInt();
						l.insert(x);
						break;
				case 2:l.delete();
						break;
				case 3:l.display();
						break;
				case 4:return;
				default:System.out.println("Wrong choice entered");
			}
		}
	}
}